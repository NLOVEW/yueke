package com.yueke.mapper;

import com.yueke.pojo.Class;
import com.yueke.pojo.Image;
import com.yueke.pojo.STeacher;
import com.yueke.pojo.School;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("schoolMapper")
public interface SchoolMapper {

    @Select("select * from school where mobilePhone = #{mobilePhone}")
    public School findSchoolByMobilePhone(@Param("mobilePhone") String mobilePhone);

    @Select("select * from school where sid = #{sid}")
    public School findSchoolById(@Param("sid") String sid);

    @Select("select * from school order by credit DESC")
    @Results({
            @Result(property = "sid",column = "sid"),
            @Result(property = "schoolName",column = "schoolName"),
            @Result(property = "message",column = "message"),
            @Result(property = "time",column = "time"),
            @Result(property = "mobilePhone",column = "mobilePhone"),
            @Result(property = "password",column = "password"),
            @Result(property = "classCount",column = "classCount"),
            @Result(property = "personSum",column = "personSum"),
            @Result(property = "credit",column = "credit")
    })
    public List<School> findAllSchool();

    @Update("update school set password = #{password} where mobilePhone = #{mobilePhone}")
    public int updatePassword(@Param("password") String password,
                               @Param("mobilePhone") String mobilePhone);

    @Select("select * from school where mobilePhone = #{mobilePhone}")
    public School findSchool(@Param("mobilePhone") String mobilePhone);

    @Update("update school set message = #{message},classCount = #{classCount},personSum = #{personSum} where mobilePhone = #{mobilePhone}")
    public int updateSchool(School school);

    @Insert("insert into image values(#{iId},#{type},#{uid},#{path},#{time})")
    @Options(useGeneratedKeys = false,keyProperty = "#{iId}")
    public void insertImage(Image image);

    @Select("select path from image where type = 1 and uid = #{uid}")
    public String findPathByUid(@Param("uid") String uid);

    @Select("select * from class where sid = #{sid} order by credit DESC")
    @Results({
            @Result(property = "cid",column = "cid"),
            @Result(property = "school",column = "sid",one = @One(select = "com.yueke.mapper.SchoolMapper.findSchoolById")),
            @Result(property = "steacher",column = "stid",one = @One(select = "com.yueke.mapper.STeacherMapper.findSTeacherById")),
            @Result(property = "city",column = "city"),
            @Result(property = "area",column = "area"),
            @Result(property = "startTime",column = "startTime"),
            @Result(property = "endTime",column = "endTime"),
            @Result(property = "course",column = "course"),
            @Result(property = "grade",column = "grade"),
            @Result(property = "message",column = "message"),
            @Result(property = "price",column = "price"),
            @Result(property = "address",column = "address"),
            @Result(property = "personCount",column = "personCount"),
            @Result(property = "classSum",column = "classSum"),
            @Result(property = "score",column = "score"),
            @Result(property = "credit",column = "credit"),
    })
    public List<Class> findAllClassBySid(String sid);

    @Insert("insert into class values(#{cid},#{school.sid},#{steacher.stId},#{city},#{area},#{startTime},#{endTime},#{address},#{price},#{course},#{grade},#{message},#{personCount},#{classSum},#{score},#{credit})")
    public int insertClass(Class clazz);

    @Insert("insert into steacher values(#{stId},#{school.sid},#{stName},#{imagePath},#{message})")
    public int insertSTeacher(STeacher sTeacher);
}
