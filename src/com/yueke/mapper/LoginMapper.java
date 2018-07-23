package com.yueke.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 登录DAO层
 * @author luck_nhb
 */
@Mapper
@Repository("loginMapper")
public interface LoginMapper {
    /**
     * 根据手机号查询家长用户的密码
     * @param mobilePhone 用户手机号
     * @return 返回密码
     */
    @Select("select password from parents where mobilePhone = #{mobilePhone}")
    public String findPasswordOnParents(@Param("mobilePhone") String mobilePhone);

    @Select("select password from school where mobilePhone = #{mobilePhone}")
    public String findPasswordOnSchool(@Param("mobilePhone") String mobilePhone);
}
