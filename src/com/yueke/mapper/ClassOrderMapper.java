package com.yueke.mapper;

import com.yueke.pojo.ClassOrder;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 班级订单
 * @author luck_nhb
 */
@Mapper
@Repository("classOrderMapper")
public interface ClassOrderMapper {

    /**
     * 根据班级编号查询班级订单
     * @param cid  班级编号
     * @return  返回班级订单集合
     */
    @Select("select * from class_order where cid = #{cid}")
    @Results({
            @Result(property = "cloId",column = "cloid"),
            @Result(property = "clazz.cid",column = "cid"),
            @Result(property = "parents.pid",column = "pid"),
            @Result(property = "comment",column = "comment"),
            @Result(property = "orderTime",column = "order_time"),
            @Result(property = "commentTime",column = "comment_time"),
    })
    public List<ClassOrder> findByClass(@Param("cid") String cid);
}
