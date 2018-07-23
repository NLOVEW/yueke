package com.yueke.service;

import com.yueke.mapper.RegisterMapper;
import com.yueke.pojo.CheckCode;
import com.yueke.pojo.Parents;
import com.yueke.pojo.School;
import com.yueke.utils.IDUtil;
import com.yueke.utils.SmsUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 注册服务
 * @author luck_nhb
 */
@Service("registerService")
public class RegisterService {
    @Resource(name = "registerMapper")
    private RegisterMapper registerMapper;

    /**
     * 产生手机短信验证码
     * @param mobilePhone
     * @return 正常则返回六位手机验证码，否则返回null
     */
    @Transactional
    public String doCode(String mobilePhone){
        CheckCode checkCode = new CheckCode();
        String code = null;
        try {
            //todo 上线时更换公司信息
            code = SmsUtil.sendCode("LTAInsSIYFW24TUv", "ECcPuXkRAqv4rNuaaLGwrLX9knLW9W",
                    "牛海波", "SMS_139239169", mobilePhone);
            checkCode.set(IDUtil.getId(), mobilePhone, code, new Date());
            registerMapper.insertCode(checkCode);
            System.out.println("phone:"+mobilePhone+"---code:"+code);
        }catch (Exception e){
            System.out.println("Error:手机验证码发送超时");
        }
        return code;
    }

    /**
     * 核对短信验证码
     * @param mobilePhone
     * @param code
     * @return 正常返回为success，否则为error
     */
    public int checkCode(String mobilePhone,String code){
        String findCode = registerMapper.findCode(mobilePhone);
        System.out.println("findCode:"+findCode);
        int flag = 0;
        if (findCode.equals(code)){
            flag = 1;
        }
        return flag;
    }

    /**
     * 从controller传入家长的信息进行注册
     * @param parents
     * @return 返回是否注册成功（保存数据库成功）
     */
    public int registerParents(Parents parents){
        int flag = 0;
        registerMapper.insertParents(parents);
        String pid = parents.getPid();
        if (pid != null){
            flag = 1;
        }
        return flag;
    }

    public int registerSchool(School school) {
        int flag = 0;
        registerMapper.insertSchool(school);
        String pid = school.getSid();
        if (pid != null){
            flag = 1;
        }
        return flag;
    }
}
