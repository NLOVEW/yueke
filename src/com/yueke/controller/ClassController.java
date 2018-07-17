package com.yueke.controller;

import com.yueke.pojo.Class;
import com.yueke.pojo.ClassOrder;
import com.yueke.service.ClassService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 班级控制器
 * @author luck_nhb
 */

@RestController
public class ClassController {
    @Resource(name = "classService")
    private ClassService classService;

    /**
     * 按照城市名称来查询 按照评分降序排列
     * @param city 输入的城市名
     * @return 返回班级类列表
     */
    @RequestMapping(value = "/class/getClassByArea/{city}",method = RequestMethod.GET)
    public List<Class> getClassByArea(@PathVariable("city") String city){
        List<Class> classes = classService.getClassByArea(city);
        return classes;
    }

    /**
     * 按照城市名称和城区名来查询 按照评分降序排列
     * @param city 城市名
     * @param area 区域名
     * @return 返回班级类列表
     */
    @RequestMapping(value = "/class/getClassByArea/{city}/{area}",method = RequestMethod.GET)
    public List<Class> getClassByArea(@PathVariable("city") String city,
                                @PathVariable("area") String area){
        List<Class> classes = classService.getClassByArea(city,area);
        return classes;
    }

    /**
     * 周边班级   根据城市以及年级查询  按照价格升序
     * @param city 城市名称
     * @param grade 年级
     * @return  返回符合条件的班级集合
     */
    @RequestMapping(value = "/class/getClassByGrade/{city}/{grade}",method = RequestMethod.GET)
    public List<Class> getClassByGrade(@PathVariable("city") String city,
                                       @PathVariable("grade") String grade){
        List<Class> classes = classService.getClassByGrade(city, grade);
        return classes;
    }

    /**
     * 周边班级    根据城市名称以及课程名称查询  按照在读人数升序排列
     * @param city      城市名
     * @param course    课程名
     * @return  返回符合条件的班级集合
     */
    @RequestMapping(value = "/class/getClassByCourse/{city}/{course}",method = RequestMethod.GET)
    public List<Class> getClassByCourse(@PathVariable("city") String city,
                                        @PathVariable("course") String course){
        List<Class> classes = classService.getClassByCourse(city, course);
        return classes;
    }

    /**
     * 周边班级    根据城市名称以及上课时间查询  按照在读人数升序排列
     * @param city      城市名
     * @param time      上课时间   时间戳
     * @return  返回符合条件的班级集合
     */
    @RequestMapping("/class/getClassByTime/{city}/{time}")
    public List<Class> getClassByTime(@PathVariable("city") String city,
                                      @PathVariable("time") Long time){
        List<Class> classes = classService.getClassByTime(city, time);
        return classes;
    }

    /**
     * 根据班级编号查询班级的订单
     * @param cid 班级标号
     * @return 返回班级订单集合
     */
    @RequestMapping("/class/getClassOrderByClass/{cid}")
    public List<ClassOrder> getClassOrderByClass(@PathVariable("cid") String cid){
        List<ClassOrder> orders = classService.getOrderByClass(cid);
        return orders;
    }
}
