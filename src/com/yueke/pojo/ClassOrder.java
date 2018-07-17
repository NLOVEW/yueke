package com.yueke.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 课程订单
 * @author luck_nhb
 */
public class ClassOrder implements Serializable {
    /*
    cloid Class Parents  time(订购时间) message(评论信息)
     */
    private String cloId;
    private Class clazz;
    private Parents parents;
    private String comment;
    private Date orderTime;
    private Date commentTime;

    public String getCloId() {
        return cloId;
    }

    public void setCloId(String cloId) {
        this.cloId = cloId;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public Parents getParents() {
        return parents;
    }

    public void setParents(Parents parents) {
        this.parents = parents;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
}
