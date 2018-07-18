package com.yueke.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 教室类
 * @author luck_nhb
 */
public class Class implements Serializable {
    /**
     * cid(数据库id) School Teacher city area(区域) time(上课时间) price(价格)
     * 		course(科目) grade(年级) personCount(在读人数	)
     *score 评分
     * credit 信誉分
     */
    private String cid;
    private School school;
    private Teacher teacher;
    private String city;
    private String area;
    private Date startTime;
    private Date endTime;
    private String course;
    private String grade;
    private String message;
    private Double price;
    private String address;
    private Integer personCount;//已有人数
    private Integer classSum;//可容纳人数
    private Integer score;
    private Integer credit;


    public void set(String cid, School school, Teacher teacher, String city, String area, Date startTime, Date endTime, String course, String grade, String message, Double price, String address, Integer personCount, Integer classSum, Integer score, Integer credit) {
        this.cid = cid;
        this.school = school;
        this.teacher = teacher;
        this.city = city;
        this.area = area;
        this.startTime = startTime;
        this.endTime = endTime;
        this.course = course;
        this.grade = grade;
        this.message = message;
        this.price = price;
        this.address = address;
        this.personCount = personCount;
        this.classSum = classSum;
        this.score = score;
        this.credit = credit;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getClassSum() {
        return classSum;
    }

    public void setClassSum(Integer classSum) {
        this.classSum = classSum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPersonCount() {
        return personCount;
    }

    public void setPersonCount(Integer personCount) {
        this.personCount = personCount;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }
}
