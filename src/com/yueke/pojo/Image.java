package com.yueke.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 图片类
 * 用于上传用户头像
 * @param <T>
 * @author luck_nhb
 */
public class Image<T> implements Serializable {
    private String iId;
    private T object;
    private String path;
    private Date time;

    public void set(String iId, T object, String path, Date time) {
        this.iId = iId;
        this.object = object;
        this.path = path;
        this.time = time;
    }

    public String getiId() {
        return iId;
    }

    public void setiId(String iId) {
        this.iId = iId;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
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
