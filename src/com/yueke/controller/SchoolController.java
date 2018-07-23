package com.yueke.controller;

import com.alibaba.fastjson.JSON;
import com.yueke.pojo.*;
import com.yueke.pojo.Class;
import com.yueke.service.SchoolService;
import com.yueke.utils.MD5Util;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 学校机构控制器
 * @author luck_nhb
 */
@RestController
public class SchoolController {
    @Resource(name = "schoolService")
    private SchoolService schoolService;

    private Result result = new Result();

    /**
     * 获得学校列表
     * @return
     */
    @RequestMapping(value = "/school/getAllSchool",method = RequestMethod.GET)
    public List<School> getAllSchool(){
        List<School> schools = schoolService.getAllSchool();
        return schools;
    }

    /**
     * 机构更改密码
     * @param password
     * @param request
     * @return
     */
    @RequestMapping(value = "/school/updatePassword",method = RequestMethod.POST)
    public String updatePassword(String password, HttpServletRequest request){
        String mobilePhone = (String) request.getSession().getAttribute("user");
        int tem = schoolService.updatePassword(MD5Util.md5(password), mobilePhone);
        if (tem == 0){
            result.setCode("error");
        }else{
            result.setCode("success");
        }
        return JSON.toJSONString(result);
    }

    /**
     * 获得学校的信息（根据session）
     * @param request
     * @return
     */
    @RequestMapping(value = "/school/getSchool",method = RequestMethod.GET)
    public School getSchool(HttpServletRequest request){
        String mobilePhone = (String) request.getSession().getAttribute("user");
        School school = schoolService.getSchool(mobilePhone);
        return school;
    }

    /**
     * 更新机构信息
     * @param school
     * @param request
     * @return
     */
    @RequestMapping(value = "/school/updateSchool",method = RequestMethod.POST)
    public String updateSchool(@RequestBody School school,HttpServletRequest request){
        String mobilePhone = (String) request.getSession().getAttribute("user");
        school.setMobilePhone(mobilePhone);
        int tem = schoolService.updateSchool(school);
        if (tem == 0){
            result.setCode("error");
        }else {
            result.setCode("success");
        }
        return JSON.toJSONString(result);
    }

    /**
     * 机构上传照片
     * @param file
     * @param request
     * @return
     */
    @RequestMapping(value = "/school/uploadImage",method = RequestMethod.POST)
    public String uploadImage(MultipartFile file,HttpServletRequest request){
        if (file.isEmpty()){
            result.setCode("error");
        }else{
            Image image = schoolService.uploadImage(file, request);
            if (image.getiId() != null){
                    result.setCode("success");
             }
        }
        return JSON.toJSONString(result);
    }

    /**
     * 获得机构方的照片
     * @return
     */
    @RequestMapping(value = "/school/getImagePath",method = RequestMethod.GET)
    public String getImagePath(HttpServletRequest request){
        String mobilePhone = (String) request.getSession().getAttribute("user");
        String path = schoolService.getImagePath(mobilePhone);
        return path;
    }

    /**
     * 机构方设置课程信息发布,请求信息:
     * {
     *     "steacher": {
     *       "stId": "1",
     *       "message": "中等"
     *     },
     *     "city": "郑州",
     *     "area": "进水",
     *     "startTime": 1531100526000,
     *     "endTime": 1531791731000,
     *     "course": "数学",
     *     "grade": "3",
     *     "message": "测试",
     *     "price": 100,
     *     "address": "商都",
     *     "personCount": 20,
     *     "classSum": 50,
     *     "score": 20,
     *     "credit": 30
     *   }
     * @return
     */
    @RequestMapping(value = "/school/setClass",method = RequestMethod.POST)
    public String setClass(@RequestBody Class clazz,HttpServletRequest request){
        String mobilePhone = (String) request.getSession().getAttribute("user");
        int tem = schoolService.setClass(mobilePhone,clazz);
        if (tem == 0){
            result.setCode("error");
        }else {
            result.setCode("success");
        }
        return JSON.toJSONString(result);
    }

    /**
     * 获得该机构下的所有课程信息
     * @param request
     * @return
     */
    @RequestMapping(value = "/school/getClass",method = RequestMethod.GET)
    public List<Class> getClass(HttpServletRequest request){
        String mobilePhone = (String) request.getSession().getAttribute("user");
        List<Class> classes = schoolService.getClass(mobilePhone);
        return classes;
    }

    /**
     * 添加教师资料
     * stName  message  image（教师照片）
     * @param sTeacher
     * @param request
     * @return
     */
    @RequestMapping(value = "/school/setSTeacher",method = RequestMethod.POST)
    public String setSTeacher(STeacher sTeacher,HttpServletRequest request){
        String mobilePhone = (String) request.getSession().getAttribute("user");
        int tem = schoolService.setSTeacher(mobilePhone,sTeacher);
        if (tem == 0){
            result.setCode("error");
        }else {
            result.setCode("success");
        }
        return JSON.toJSONString(result);
    }
}
