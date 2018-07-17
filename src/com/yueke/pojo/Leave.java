package com.yueke.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 请假
 * @author luck_nhb
 */
public class Leave implements Serializable {
    /**
     * leid course Parents leaveTime(请假时间) time(何时请假)
     */
    private String leid;
    private Course course;
    private Parents parents;
    private Date leaveTime;
    private Date time;

    public void set(String leid, Course course, Parents parents, Date leaveTime, Date time) {
        this.leid = leid;
        this.course = course;
        this.parents = parents;
        this.leaveTime = leaveTime;
        this.time = time;
    }

    public String getLeid() {
        return leid;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setLeid(String leid) {

        this.leid = leid;
    }

    public Parents getParents() {
        return parents;
    }

    public void setParents(Parents parents) {
        this.parents = parents;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
