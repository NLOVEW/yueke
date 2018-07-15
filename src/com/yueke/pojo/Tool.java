package com.yueke.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 道具
 * @author luck_nhb
 */
public class Tool implements Serializable {
    /**
     * tid tName(名称) function(功能) level price time
     */
    private String toId;
    private String tName;
    private String function;
    private Integer level;
    private Double price;
    private Date time;

    public String getToId() {
        return toId;
    }

    public void setToId(String toId) {
        this.toId = toId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
