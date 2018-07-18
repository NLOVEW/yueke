package com.yueke.controller;

import com.yueke.pojo.School;
import com.yueke.service.SchoolService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 学校机构控制器
 * @author luck_nhb
 */
@RestController
public class SchoolController {
    @Resource(name = "schoolService")
    private SchoolService schoolService;

    @RequestMapping(value = "/school/getSchool",method = RequestMethod.GET)
    public List<School> getSchool(){
        List<School> schools = schoolService.getSchool();
        return schools;
    }

}
