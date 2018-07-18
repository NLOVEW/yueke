package com.yueke.service;

import com.yueke.mapper.SchoolMapper;
import com.yueke.pojo.School;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("schoolService")
public class SchoolService {
    @Resource(name = "schoolMapper")
    private SchoolMapper schoolMapper;

    public List<School> getSchool() {
        List<School> schools = schoolMapper.findSchool();
        return schools;
    }
}
