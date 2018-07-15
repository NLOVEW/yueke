package com.yueke.pojo;

import java.io.Serializable;

/**
 * 课程
 * @author luck_nhb
 */
public class Course implements Serializable {
    /*
     * Course:coid Teacher cName grade price(价格)
     */
    private String coId;
    private Teacher teacher;
    private String name;
    private Integer grade;
    private Double price;

    public String getCoId() {
        return coId;
    }

    public void setCoId(String coId) {
        this.coId = coId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
