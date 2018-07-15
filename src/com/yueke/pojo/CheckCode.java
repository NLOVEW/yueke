package com.yueke.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 验证码
 * @author luck_nhb
 */
public class CheckCode implements Serializable {
    /*
    chid mobilePhone code time
     */
    private String chid;
    private String mobilePhone;
    private String code;
    private Date time;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getChid() {
        return chid;
    }

    public void setChid(String chid) {
        this.chid = chid;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
