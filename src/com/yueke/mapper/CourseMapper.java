package com.yueke.mapper;

import com.yueke.pojo.Course;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * 课程Dao
 * @author luck_nhb
 */
@Mapper
@Repository("courseMapper")
public interface CourseMapper {

    /**
     * 获得课程详细信息  根据区域  按照评分降序排列
     * @param city
     * @param area
     * @return
     */
    @Select("select * from course,teacher where course.tid = teacher.tid and teacher.city = #{city} and teacher.area = #{area} order by teacher.score DESC")
    @Results({
            @Result(property = "coId",column = "coid"),
            @Result(property = "teacher",column = "tid",one = @One(select = "com.yueke.mapper.TeacherMapper.findTeacherById")),
            @Result(property = "name",column = "name"),
            @Result(property = "time",column = "time"),
            @Result(property = "grade",column = "grade"),
            @Result(property = "price",column = "price"),
    })
    public List<Course> findCourseByArea(@Param("city") String city,
                                         @Param("area") String area);

    /**
     * 根据城市 年级查询  按照价格升序排列
     * @param city
     * @param grade
     * @return
     */
    @Select("select * from course,teacher where course.tid = teacher.tid and teacher.city = #{city} and course.grade = #{grade} order by course.price ASC")
    @Results({
            @Result(property = "coId",column = "coid"),
            @Result(property = "teacher",column = "tid",one = @One(select = "com.yueke.mapper.TeacherMapper.findTeacherById")),
            @Result(property = "name",column = "name"),
            @Result(property = "time",column = "time"),
            @Result(property = "grade",column = "grade"),
            @Result(property = "price",column = "price"),
    })
    public List<Course> findCourseByGrade(@Param("city") String city,
                                          @Param("grade") String grade);

    /**
     * 根据城市及课程名称进行查询  按照价格升序
     * @param city  城市名
     * @param name  课程名
     * @return
     */
    @Select("select * from course,teacher where course.tid = teacher.tid and teacher.city = #{city} and course.name = #{name} order by course.price ASC")
    @Results({
            @Result(property = "coId",column = "coid"),
            @Result(property = "teacher",column = "tid",one = @One(select = "com.yueke.mapper.TeacherMapper.findTeacherById")),
            @Result(property = "name",column = "name"),
            @Result(property = "time",column = "time"),
            @Result(property = "grade",column = "grade"),
            @Result(property = "price",column = "price"),
    })
    public List<Course> findCourseByCourse(@Param("city") String city,
                                           @Param("name") String name);

    /**
     * 根据城市及上课时间进行查询  按照价格升序
     * @param city  城市名
     * @param time  上课时间
     * @return
     */
    @Select("select * from course,teacher where course.tid = teacher.tid and teacher.city = #{city} and course.name >= #{time} order by course.price ASC")
    @Results({
            @Result(property = "coId",column = "coid"),
            @Result(property = "teacher",column = "tid",one = @One(select = "com.yueke.mapper.TeacherMapper.findTeacherById")),
            @Result(property = "name",column = "name"),
            @Result(property = "time",column = "time"),
            @Result(property = "grade",column = "grade"),
            @Result(property = "price",column = "price"),
    })
    public List<Course> findCourseByTime(@Param("city") String city,
                                         @Param("time") Date time);
}
