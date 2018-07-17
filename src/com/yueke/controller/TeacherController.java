package com.yueke.controller;

import com.yueke.service.TeacherService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 讲师控制器
 * @author luck_nhb
 */
@RestController
public class TeacherController {
    //注入TeacherSerice
    @Resource(name = "teacherService")
    private TeacherService teacherService;

}
