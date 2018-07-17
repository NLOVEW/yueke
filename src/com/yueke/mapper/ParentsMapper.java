package com.yueke.mapper;

import com.yueke.pojo.Parents;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * 家长用户DAO
 * @author luck_nhb
 */
@Mapper
@Repository("parentsMapper")
public interface ParentsMapper {

    /**
     * 根据手机号查询家长用户信息
     * @param mobilePhone
     * @return  Parents
     */
    @Select("select * from parents where mobilePhone = #{mobilePhone}")
    @Results({
            @Result(property = "pid",column = "pid"),
            @Result(property = "mobilePhone",column = "mobilePhone"),
            @Result(property = "userName",column = "userName"),
            @Result(property = "password",column = "password"),
            @Result(property = "vip",column = "vip"),
            @Result(property = "level",column = "level"),
            @Result(property = "time",column = "time")
    })
    public Parents findParents(@Param("mobilePhone") String mobilePhone);
}
