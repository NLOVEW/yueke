package com.yueke.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 课程订单表
 * @author luck_nhb
 */
public class CourseOrder implements Serializable {
    /*
    coid Course Parents  teach_time(上课时间)
    time(订购时间) message(评论信息) score(评分)
     */
    private String couId;
    private Course course;
    private Parents parents;
    private Date teachTime;
    private Date time;
    private Double price;//实际交易价格
    private String message;
    private Integer score;

    public String getCouId() {
        return couId;
    }

    public void setCouId(String couId) {
        this.couId = couId;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getTeachTime() {
        return teachTime;
    }

    public void setTeachTime(Date teachTime) {
        this.teachTime = teachTime;
    }

    public Parents getParents() {
        return parents;
    }

    public void setParents(Parents parents) {
        this.parents = parents;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
