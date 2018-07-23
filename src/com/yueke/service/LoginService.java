package com.yueke.service;

import com.yueke.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 登录的实现类
 * @author luck_nhb
 */
@Service("loginService")
public class LoginService{
    //注入LoginMapper
    @Autowired
    private LoginMapper loginMapper;

    /**
     * 家长用户登录
     * @param mobilePhone 用户手机号
     * @param password  用户密码
     * @return  密码比对是否正确
     */
    public boolean parentsLogin(String mobilePhone, String password) {
        boolean flag = false;
        if (loginMapper.findPasswordOnParents(mobilePhone).equals(password)){
           flag = true;
        }
        return flag;
    }

    public boolean schoolLogin(String mobilePhone, String password) {
        boolean flag = false;
        if (loginMapper.findPasswordOnSchool(mobilePhone).equals(password)){
            flag = true;
        }
        return flag;
    }
}
