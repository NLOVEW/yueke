package com.yueke.pojo;

import java.io.Serializable;

/**
 * 课程
 * @author luck_nhb
 */
public class Lesson implements Serializable {
    /**
     *lid course Parents HomeWork
     *passCourse(已上课时) subCourse(剩余课时)
     * backCourse(退课) Leave CourseOrder
     */
    private String lid;
    private Course course;
    private Parents parents;
    private Integer passCourse;
    private Integer subCourse;
    private HomeWork homeWork;
    private Leave leave;
    private Integer backCourse;
    private CourseOrder order;

    public void set(String lid, Course course, Parents parents, Integer passCourse, Integer subCourse, HomeWork homeWork, Leave leave, Integer backCourse, CourseOrder order) {
        this.lid = lid;
        this.course = course;
        this.parents = parents;
        this.passCourse = passCourse;
        this.subCourse = subCourse;
        this.homeWork = homeWork;
        this.leave = leave;
        this.backCourse = backCourse;
        this.order = order;
    }

    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
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

    public Integer getPassCourse() {
        return passCourse;
    }

    public void setPassCourse(Integer passCourse) {
        this.passCourse = passCourse;
    }

    public Integer getSubCourse() {
        return subCourse;
    }

    public void setSubCourse(Integer subCourse) {
        this.subCourse = subCourse;
    }

    public HomeWork getHomeWork() {
        return homeWork;
    }

    public void setHomeWork(HomeWork homeWork) {
        this.homeWork = homeWork;
    }

    public Leave getLeave() {
        return leave;
    }

    public void setLeave(Leave leave) {
        this.leave = leave;
    }

    public Integer getBackCourse() {
        return backCourse;
    }

    public void setBackCourse(Integer backCourse) {
        this.backCourse = backCourse;
    }

    public CourseOrder getOrder() {
        return order;
    }

    public void setOrder(CourseOrder order) {
        this.order = order;
    }
}
