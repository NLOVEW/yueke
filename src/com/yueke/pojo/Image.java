package com.yueke.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 图片类
 * 用于上传用户头像
 * @author luck_nhb
 */
public class Image implements Serializable {
    private String iId;
    private Integer type;
    private String uid;
    private String path;
    private Date time;

    public void set(String iId, Integer type, String uid, String path, Date time) {
        this.iId = iId;
        this.type = type;
        this.uid = uid;
        this.path = path;
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getiId() {
        return iId;
    }

    public void setiId(String iId) {
        this.iId = iId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
