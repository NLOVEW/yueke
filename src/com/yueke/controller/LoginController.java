package com.yueke.controller;

import com.alibaba.fastjson.JSON;
import com.yueke.pojo.Result;
import com.yueke.service.LoginService;
import com.yueke.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 登录接口
 * @author luck_nhb
 */
@RestController
public class LoginController {
    //注入LoginService
    @Autowired
    private LoginService loginService;
    //设置全局变量，用来返回json验证码
    private Result result = new Result();

    /**
     * 登录验证
     * @param mobilePhone
     * @param password
     * @return 返回验证结果（error：代表未通过；success：通过）
     */
    @RequestMapping(value = "/login/parentsLogin/{mobilePhone}/{password}",method = RequestMethod.POST)
    public String parentsLogin(@PathVariable("mobilePhone") String mobilePhone,
                               @PathVariable("password") String password,
                               HttpServletRequest request){
        String mdPassword = MD5Util.md5(password);
        boolean flag = loginService.parentsLogin(mobilePhone, mdPassword);
        if (flag){
            //登录后服务器端记录登录用户的信息
            request.getSession().setAttribute("parents",mobilePhone);
            result.setCode("success");
        }else{
            result.setCode("error");
        }
        return JSON.toJSONString(result);
    }
}
