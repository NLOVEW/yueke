package com.yueke.pojo;

import java.io.Serializable;

/**
 * 学校
 * @author luck_nhb
 */
public class School implements Serializable {
    /**
     * sid(数据库id) schoolName classCount personSum credit
     */
    private String sid;
    private String schoolName;
    private Integer classCount;
    private Long personSum;
    private Long credit;

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

    public void setPersonSum(Long personSum) {
        this.personSum = personSum;
    }
}
