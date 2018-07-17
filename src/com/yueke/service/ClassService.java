package com.yueke.service;

import com.yueke.mapper.ClassMapper;
import com.yueke.mapper.ClassOrderMapper;
import com.yueke.pojo.Class;
import com.yueke.pojo.ClassOrder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 班级服务
 * @author luck_nhb
 */
@Service("classService")
public class ClassService {
    //注入ClassMapper
    @Resource(name = "classMapper")
    private ClassMapper classMapper;
    //注入ClassOrderMapper
    @Resource(name = "classOrderMapper")
    private ClassOrderMapper classOrderMapper;

    /**
     * 根据区域查询，按照评分排序 降序
     * @param city 输入的城市名称
     * @return  返回班级集合
     */
    public List<Class> getClassByArea(String city) {
        List<Class> classes = classMapper.findClassByCity(city);
        for (Class clazz : classes){

        }
        return classes;
    }

    /**
     * 根据区域查询，按照评分排序 降序
     * @param city  城市名称
     * @param area  区域名称
     * @return  返回班级集合
     */
    public List<Class> getClassByArea(String city, String area) {
        List<Class> classes = classMapper.findClassByArea(city,area);
        for (Class clazz : classes){

        }
        return classes;
    }

    /**
     * 根据班级编号查询班级订单情况（包括评价）
     * @param cid
     * @return  返回班级订单结合
     */
    public List<ClassOrder> getOrderByClass(String cid) {
        List<ClassOrder> orders = classOrderMapper.findByClass(cid);
        return orders;
    }

    /**
     * 周边班级   根据城市以及年级查询  按照价格升序
     * @param city 城市名称
     * @param grade 年级
     * @return  返回符合条件的班级集合
     */
    public List<Class> getClassByGrade(String city,String grade) {
        List<Class> classes = classMapper.findClassByGrade(city, grade);
        return classes;
    }

    /**
     * 周边班级    根据城市名称以及课程名称查询  按照在读人数升序排列
     * @param city      城市名
     * @param course    课程名
     * @return  返回符合条件的班级集合
     */
    public List<Class> getClassByCourse(String city, String course) {
        List<Class> classes = classMapper.findClassByCourse(city, course);
        return classes;
    }

    /**
     * 周边班级    根据城市名称以及上课时间查询  按照在读人数升序排列
     * @param city      城市名
     * @param time      上课时间
     * @return  返回符合条件的班级集合
     */
    public List<Class> getClassByTime(String city, Long time) {
        Date startTime = new Date(time.longValue());
        List<Class> classes = classMapper.findClassByTime(city, startTime);
        return classes;
    }
}
