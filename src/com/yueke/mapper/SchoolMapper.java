package com.yueke.mapper;

import com.yueke.pojo.School;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("schoolMapper")
public interface SchoolMapper {

    @Select("select * from school order by credit DESC")
    @Results({
            @Result(property = "sid",column = "sid"),
            @Result(property = "schoolName",column = "school_name"),
            @Result(property = "mobilePhone",column = "mobilePhone"),
            @Result(property = "password",column = "password"),
            @Result(property = "classCount",column = "class_count"),
            @Result(property = "personSum",column = "person_sum"),
            @Result(property = "credit",column = "credit")
    })
    public List<School> findSchool();
}
