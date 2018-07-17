package com.yueke.mapper;

import com.yueke.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("teacherMapper")
public interface TeacherMapper {
    @Select("select * from teacher where tid = #{tid}")
    public Teacher findTeacherById(@Param("tid") String tid);
}
