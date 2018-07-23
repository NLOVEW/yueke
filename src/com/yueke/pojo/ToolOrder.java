package com.yueke.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 道具购买订单
 */
public class ToolOrder implements Serializable {
    /**
     * tlid Tool Object time price comment
     */
    private String tlId;
    private Integer type;
    private String phone;
    private Tool tool;
    private String tmName;
    private Date time;
    private Double price;
    private Integer number;
    private Integer subNumber;
    private String comment;

    public void set(String tlId, Integer type, String phone, Tool tool, String tmName, Date time, Double price, Integer number, Integer subNumber, String comment) {
        this.tlId = tlId;
        this.type = type;
        this.phone = phone;
        this.tool = tool;
        this.tmName = tmName;
        this.time = time;
        this.price = price;
        this.number = number;
        this.subNumber = subNumber;
        this.comment = comment;
    }

    public String getTmName() {
        return tmName;
    }

    public void setTmName(String tmName) {
        this.tmName = tmName;
    }

    public Integer getType() {

        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public Integer getSubNumber() {
        return subNumber;
    }

    public void setSubNumber(Integer subNumber) {
        this.subNumber = subNumber;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTlId() {
        return tlId;
    }

    public void setTlId(String tlId) {
        this.tlId = tlId;
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
