package com.yueke.controller;

import com.alibaba.fastjson.JSON;
import com.yueke.pojo.Parents;
import com.yueke.pojo.Result;
import com.yueke.service.RegisterService;
import com.yueke.utils.IDUtil;
import com.yueke.utils.MD5Util;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 注册控制器
 * @author luck_nhb
 */
@RestController
public class RegisterController {
    //注入RegisterService
    @Resource(name = "registerService")
    private RegisterService registerService;
    //设置全局变量，用来设置返回调用返回值
    private Result result = new Result();

    //todo 如果前端不愿意验证短信，则可调用checkCode方法
    /**
     * get请求：根据手机号产生六位短信验证码
     * @param mobilePhone
     * @return 正常返回六位验证码用于前段页面对比，错误返回“error”字段，全部为json数据
     */
    @RequestMapping(value = "/register/doCode/{mobilePhone}",method = RequestMethod.GET)
    public String doCode(@PathVariable("mobilePhone") String mobilePhone){
        String newCode = registerService.doCode(mobilePhone);
        if (newCode == null){
            result.setCode("error");
        }else {
            result.setCode(newCode);
        }
        return JSON.toJSONString(result);
    }

    /**
     * 手机注册验证码核对
     * @param mobilePhone 用户手机号
     * @param code 手机短信验证码
     * @return 是否通过验证（error：未通过；success：通过）
     */
    @RequestMapping(value = "/register/checkCode/{mobilePhone}/{code}",method = RequestMethod.GET)
    public String checkCode(@PathVariable("mobilePhone") String mobilePhone,
                            @PathVariable("code") String code){
        if (registerService.checkCode(mobilePhone, code) == 1){
            result.setCode("success");
        }else {
            result.setCode("error");
        }
        return JSON.toJSONString(result);
    }

    /**
     * 进行注册
     * @param mobilePhone
     * @param password
     * @return 返回注册结果（error：注册未成功；success：注册成功）
     */
    @RequestMapping(value = "/register/register/{mobilePhone}/{password}",method = RequestMethod.POST)
    public String register(@PathVariable("mobilePhone") String mobilePhone,
                           @PathVariable("password") String password){
        Parents parents = new Parents();
        parents.set(IDUtil.getId(), mobilePhone, mobilePhone,
                MD5Util.md5(password), 0, 0, new Date());
        int flag = registerService.register(parents);
        if (flag == 1){
            result.setCode("success");
        }else{
            result.setCode("error");
        }
        return JSON.toJSONString(result);
    }
}
