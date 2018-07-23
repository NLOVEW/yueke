package com.yueke.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 教师类
 * @author luck_nhb
 */
public class Teacher implements Serializable {
    /*
     * tid(数据库id) mobilePhone(手机号) userName(姓名) password(密码) city(城市) area(区域)
     * credit(信誉积分) count(上课次数) vip(会员) level(等级)
     */
    private String tid;
    private String mobilePhone;
    private String userName;
    private String password;
    private String city;
    private String area;
    private Integer score;
    private Long credit;
    private Integer count;
    private Integer vip;
    private Integer level;
    private Date time;

    public void set(String tid, String mobilePhone, String userName, String password, String city, String area, Integer score, Long credit, Integer count, Integer vip, Integer level, Date time) {
        this.tid = tid;
        this.mobilePhone = mobilePhone;
        this.userName = userName;
        this.password = password;
        this.city = city;
        this.area = area;
        this.score = score;
        this.credit = credit;
        this.count = count;
        this.vip = vip;
        this.level = level;
        this.time = time;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Long getCredit() {
        return credit;
    }

    public void setCredit(Long credit) {
        this.credit = credit;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
