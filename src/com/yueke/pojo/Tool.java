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
    private ToolMenu toolMenu;
    private Integer limit;
    private Integer level;
    private Double price;
    private Date time;

    public void set(String toId, ToolMenu toolMenu, Integer limit, Integer level, Double price, Date time) {
        this.toId = toId;
        this.toolMenu = toolMenu;
        this.limit = limit;
        this.level = level;
        this.price = price;
        this.time = time;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getToId() {
        return toId;
    }

    public void setToId(String toId) {
        this.toId = toId;
    }

    public ToolMenu getToolMenu() {
        return toolMenu;
    }

    public void setToolMenu(ToolMenu toolMenu) {
        this.toolMenu = toolMenu;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
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
