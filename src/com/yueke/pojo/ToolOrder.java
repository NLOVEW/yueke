package com.yueke.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 道具购买订单
 */
public class ToolOrder<T> implements Serializable {
    /**
     * tlid Tool Object time price comment
     */
    private String tlId;
    private T object;
    private Date time;
    private Double price;
    private String comment;

    public String getTlId() {
        return tlId;
    }

    public void setTlId(String tlId) {
        this.tlId = tlId;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
