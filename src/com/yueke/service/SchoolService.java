package com.yueke.service;

import com.yueke.mapper.SchoolMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("schoolService")
public class SchoolService {
    @Resource(name = "schoolMapper")
    private SchoolMapper schoolMapper;
}
