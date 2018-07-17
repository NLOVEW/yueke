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
     * @param mobliePhone 用户手机号
     * @param password  用户密码
     * @return  密码比对是否正确
     */
    public boolean parentsLogin(String mobliePhone, String password) {
        boolean flag = false;
        if (loginMapper.findPasswordOnParents(mobliePhone).equals(password)){
           flag = true;
        }
        return flag;
    }
}
