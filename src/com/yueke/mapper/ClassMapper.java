package com.yueke.mapper;

import com.yueke.pojo.Class;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * 班级Dao
 * @author luck_nhb
 */
@Mapper
@Repository("classMapper")
public interface ClassMapper {

    /**
     * 根据城市名称查询班级 按照评分降序排列
     * @param city 城市名称
     * @return  返回班级集合
     */
    @Select("select * from class where city = #{city} order by score DESC")
    @Results({
            @Result(property = "cid",column = "cid"),
            @Result(property = "school",column = "sid",one = @One(select = "com.yueke.mapper.SchoolMapper.findSchoolById")),
            @Result(property = "steacher",column = "stid",one = @One(select = "com.yueke.mapper.STeacherMapper.findSTeacherById")),
            @Result(property = "startTime",column = "startTime"),
            @Result(property = "endTime",column = "endTime"),
            @Result(property = "address",column = "address"),
            @Result(property = "course",column = "course"),
            @Result(property = "grade",column = "grade"),
            @Result(property = "message",column = "message"),
            @Result(property = "price",column = "price"),
            @Result(property = "personCount",column = "personCount"),
            @Result(property = "classSum",column = "classSum"),
            @Result(property = "score",column = "score"),
            @Result(property = "credit",column = "credit"),
            @Result(property = "city",column = "city"),
            @Result(property = "area",column = "area"),
    })
    public List<Class> findClassByCity(@Param("city") String city);

    /**
     * 根据城市和区域名称查询班级  按照评分降序排列
     * @param city  城市名称
     * @param area  区域名称
     * @return  返回班级集合
     */
    @Select("select * from class where city = #{city} and area = #{area} order by score DESC")
    @Results({
            @Result(property = "cid",column = "cid"),
            @Result(property = "school",column = "sid",one = @One(select = "com.yueke.mapper.SchoolMapper.findSchoolById")),
            @Result(property = "steacher",column = "stid",one = @One(select = "com.yueke.mapper.STeacherMapper.findSTeacherById")),
            @Result(property = "startTime",column = "startTime"),
            @Result(property = "endTime",column = "endTime"),
            @Result(property = "address",column = "address"),
            @Result(property = "course",column = "course"),
            @Result(property = "grade",column = "grade"),
            @Result(property = "message",column = "message"),
            @Result(property = "price",column = "price"),
            @Result(property = "personCount",column = "personCount"),
            @Result(property = "classSum",column = "classSum"),
            @Result(property = "score",column = "score"),
            @Result(property = "credit",column = "credit"),
            @Result(property = "city",column = "city"),
            @Result(property = "area",column = "area"),
    })
    public List<Class> findClassByArea(@Param("city") String city,
                                       @Param("area") String area);

    /**
     * 根据周边查询，年级查询 按价格升序排列
     * @param grade
     * @return
     */
    @Select("select * from class where city = #{city} and grade = #{grade} order by price ASC")
    @Results({
            @Result(property = "cid",column = "cid"),
            @Result(property = "school",column = "sid",one = @One(select = "com.yueke.mapper.SchoolMapper.findSchoolById")),
            @Result(property = "steacher",column = "stid",one = @One(select = "com.yueke.mapper.STeacherMapper.findSTeacherById")),
            @Result(property = "startTime",column = "startTime"),
            @Result(property = "endTime",column = "endTime"),
            @Result(property = "address",column = "address"),
            @Result(property = "course",column = "course"),
            @Result(property = "grade",column = "grade"),
            @Result(property = "message",column = "message"),
            @Result(property = "price",column = "price"),
            @Result(property = "personCount",column = "personCount"),
            @Result(property = "classSum",column = "classSum"),
            @Result(property = "score",column = "score"),
            @Result(property = "credit",column = "credit"),
            @Result(property = "city",column = "city"),
            @Result(property = "area",column = "area"),
    })
    public  List<Class> findClassByGrade(@Param("city") String city,
                                         @Param("grade") String grade);

    /**
     * 周边班级    根据城市名称以及课程名称查询  按照在读人数升序排列
     * @param city      城市名
     * @param course    课程名
     * @return  返回符合条件的班级集合
     */
    @Select("select * from class where city = #{city} and course = #{course} order by person_count ASC")
    @Results({
            @Result(property = "cid",column = "cid"),
            @Result(property = "school",column = "sid",one = @One(select = "com.yueke.mapper.SchoolMapper.findSchoolById")),
            @Result(property = "steacher",column = "stid",one = @One(select = "com.yueke.mapper.STeacherMapper.findSTeacherById")),
            @Result(property = "startTime",column = "startTime"),
            @Result(property = "endTime",column = "endTime"),
            @Result(property = "address",column = "address"),
            @Result(property = "course",column = "course"),
            @Result(property = "grade",column = "grade"),
            @Result(property = "message",column = "message"),
            @Result(property = "price",column = "price"),
            @Result(property = "personCount",column = "personCount"),
            @Result(property = "classSum",column = "classSum"),
            @Result(property = "score",column = "score"),
            @Result(property = "credit",column = "credit"),
            @Result(property = "city",column = "city"),
            @Result(property = "area",column = "area"),
    })
    public List<Class> findClassByCourse(@Param("city") String city,
                                         @Param("course") String course);
    /**
     * 周边班级    根据城市名称以及上课时间查询  按照在读人数升序排列
     * @param city      城市名
     * @param time      上课时间
     * @return  返回符合条件的班级集合
     */
    @Select("select * from class where city = #{city} and start_time >= #{time} order by credit DESC")
    @Results({
            @Result(property = "cid",column = "cid"),
            @Result(property = "school",column = "sid",one = @One(select = "com.yueke.mapper.SchoolMapper.findSchoolById")),
            @Result(property = "steacher",column = "stid",one = @One(select = "com.yueke.mapper.STeacherMapper.findSTeacherById")),
            @Result(property = "startTime",column = "startTime"),
            @Result(property = "endTime",column = "endTime"),
            @Result(property = "address",column = "address"),
            @Result(property = "course",column = "course"),
            @Result(property = "grade",column = "grade"),
            @Result(property = "message",column = "message"),
            @Result(property = "price",column = "price"),
            @Result(property = "personCount",column = "personCount"),
            @Result(property = "classSum",column = "classSum"),
            @Result(property = "score",column = "score"),
            @Result(property = "credit",column = "credit"),
            @Result(property = "city",column = "city"),
            @Result(property = "area",column = "area"),
    })
    public List<Class> findClassByTime(@Param("city") String city,
                                       @Param("time") Date time);
}
