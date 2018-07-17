package com.yueke.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 家庭作业
 * @author luck_nhb
 */
public class HomeWork implements Serializable {
    /**
     *hid Course Parents time(发布时间) message(作业信息) comment(备注)
     */
    private String hid;
    private Course course;
    private Parents parents;
    private String message;
    private String comment;
    private Date time;

    public void set(String hid, Course course, Parents parents, String message, String comment, Date time) {
        this.hid = hid;
        this.course = course;
        this.parents = parents;
        this.message = message;
        this.comment = comment;
        this.time = time;
    }

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Parents getParents() {
        return parents;
    }

    public void setParents(Parents parents) {
        this.parents = parents;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
