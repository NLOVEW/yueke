package com.yueke.controller;

import com.yueke.pojo.Course;
import com.yueke.service.CourseService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 课程控制器
 * @author luck_nhb
 */
@RestController
public class CourseController {
    @Resource(name = "courseService")
    private CourseService courseService;

    /**
     * 获得课程详细信息  根据区域  按照评分降序排列
     * @param city
     * @param area
     * @return
     */
    @RequestMapping(value = "/course/getCourseByArea/{city}/{area}",method = RequestMethod.GET)
    public List<Course> getCourseByArea(@PathVariable("city") String city,
                                        @PathVariable("area") String area){
        List<Course> courses = courseService.getCourseByArea(city, area);
        return courses;
    }

    /**
     * 根据城市 年级查询  按照价格升序排列
     * @param city
     * @param grade
     * @return
     */
    @RequestMapping(value = "/course/getCourseByGrade/{city}/{grade}",method = RequestMethod.GET)
    public List<Course> getCourseByGrade(@PathVariable("city") String city,
                                         @PathVariable("grade") String grade){
        List<Course> courses = courseService.getCourseByGrade(city, grade);
        return courses;
    }

    /**
     * 根据城市及课程名称进行查询  按照价格升序
     * @param city  城市名
     * @param name  课程名
     * @return
     */
    @RequestMapping(value = "/course/getCourseByCourse/{city}/{name}",method = RequestMethod.GET)
    public List<Course> getCourseByCourse(@PathVariable("city") String city,
                                          @PathVariable("name") String name){
        List<Course> courses = courseService.getCourseByCourse(city, name);
        return courses;
    }

    /**
     * 根据城市及上课时间进行查询  按照价格升序
     * @param city  城市名
     * @param time  上课时间
     * @return
     */
    @RequestMapping("/course/getCourseByTime/{city}/{time}")
    public List<Course> getCourseByTime(@PathVariable("city") String city,
                                        @PathVariable("time") Long time){
        List<Course> courses = courseService.getCourseByTime(city, time);
        return courses;
    }

}
