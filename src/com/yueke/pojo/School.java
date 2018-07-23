package com.yueke.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 学校
 * @author luck_nhb
 */
public class School implements Serializable {
    /**
     * sid(数据库id) schoolName classCount personSum credit
     */
    private String sid;
    private String mobilePhone;
    private String password;
    private String schoolName;
    private String message;
    private Integer classCount;
    private Long personSum;
    private Long credit;
    private Date time;

    public void set(String sid, String mobilePhone, String password, String schoolName, String message, Integer classCount, Long personSum, Long credit, Date time) {
        this.sid = sid;
        this.mobilePhone = mobilePhone;
        this.password = password;
        this.schoolName = schoolName;
        this.message = message;
        this.classCount = classCount;
        this.personSum = personSum;
        this.credit = credit;
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Long getCredit() {
        return credit;
    }

    public void setCredit(Long credit) {
        this.credit = credit;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getClassCount() {
        return classCount;
    }

    public void setClassCount(Integer classCount) {
        this.classCount = classCount;
    }

    public Long getPersonSum() {
        return personSum;
    }
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPersonSum(Long personSum) {
        this.personSum = personSum;
    }
}
