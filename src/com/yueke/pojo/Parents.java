package com.yueke.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 家长类
 * @author luck_nhb
 */
public class Parents implements Serializable {
    /**
     * pid(数据库id) mobilePhone(手机号)
     * userName(姓名) password(密码)
     * vip(会员) level(等级) time(注册时间)
     */
    private String pid;
    private String mobilePhone;
    private String userName;
    private String password;
    private Integer vip;
    private Integer level;
    private Date time;

    public void set(String pid, String mobilePhone, String userName, String password, Integer vip, Integer level, Date time) {
        this.pid = pid;
        this.mobilePhone = mobilePhone;
        this.userName = userName;
        this.password = password;
        this.vip = vip;
        this.level = level;
        this.time = time;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}