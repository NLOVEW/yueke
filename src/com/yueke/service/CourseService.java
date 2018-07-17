package com.yueke.service;

import com.yueke.mapper.CourseMapper;
import com.yueke.pojo.Course;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 课程服务
 * @author luck_nhb
 */
@Service("courseService")
public class CourseService {
    @Resource(name = "courseMapper")
    private CourseMapper courseMapper;

    /**
     * 获得课程详细信息  根据区域  按照评分降序排列
     * @param city
     * @param area
     * @return
     */
    public List<Course> getCourseByArea(String city, String area) {
        List<Course> courses = courseMapper.findCourseByArea(city, area);
        return courses;
    }

    /**
     * 根据城市 年级查询  按照价格升序排列
     * @param city
     * @param grade
     * @return
     */
    public List<Course> getCourseByGrade(String city, String grade) {
        List<Course> courses = courseMapper.findCourseByGrade(city, grade);
        return courses;
    }

    /**
     * 根据城市及课程名称进行查询  按照价格升序
     * @param city  城市名
     * @param name  课程名
     * @return
     */
    public List<Course> getCourseByCourse(String city, String name) {
        List<Course> courses = courseMapper.findCourseByCourse(city, name);
        return courses;
    }

    /**
     * 根据城市及上课时间进行查询  按照价格升序
     * @param city  城市名
     * @param time  上课时间
     * @return
     */
    public List<Course> getCourseByTime(String city, Long time) {
        Date startTime = new Date(time.longValue());
        List<Course> courses = courseMapper.findCourseByTime(city, startTime);
        return courses;
    }
}
