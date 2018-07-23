package com.yueke.mapper;

import com.yueke.pojo.CheckCode;
import com.yueke.pojo.Parents;
import com.yueke.pojo.School;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * 注册Dao
 * @author luck_nhb
 */
@Mapper
@Repository("registerMapper")
public interface RegisterMapper {
    /**
     * 将手机验证码存入数据库，方便后续验证
     * @param checkCode
     */
    @Insert("insert into check_code values(#{chid},#{mobilePhone},#{code},#{time})")
    public void insertCode(CheckCode checkCode);

    /**
     * 根据手机号查询数据库中的短信验证码进行核对
     * @param mobilePhone
     * @return 返回手机号对应的验证码
     */
    @Select("select code from check_code where mobilePhone = #{mobilePhone}")
    public String findCode(@Param("mobilePhone") String mobilePhone);

    /**
     * 传入家长的信息进行注册，在注册的时候返回主键id值
     * useGeneratedKeys = false 代表不使用系统的主键生成策略
     * keyProperty = "#{pid}" 代表返回值为pid主键
     * @param parents
     */
    @Insert("insert into parents values(#{pid},#{mobilePhone},#{userName},#{password},#{vip},#{level},#{time})")
    @Options(useGeneratedKeys = false,keyProperty = "#{pid}")
    public void insertParents(Parents parents);

    @Insert("insert into school values(#{sid},#{mobilePhone},#{password},#{schoolName},#{classCount},#{personSum},#{credit},#{time})")
    @Options(useGeneratedKeys = false,keyProperty = "#{sid}")
    public void insertSchool(School school);
}
