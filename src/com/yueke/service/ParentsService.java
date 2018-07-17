package com.yueke.service;

import com.yueke.mapper.ParentsMapper;
import com.yueke.pojo.Parents;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 家长服务类
 * @author luck_nhb
 */
@Service
public class ParentsService {
    //注入ParentsMapper
    @Resource(name = "parentsMapper")
    private ParentsMapper parentsMapper;

    /**
     * 根据用户手机号查询
     * @param mobilePhone
     * @return 家长用户Parents
     */
    public Parents findParents(String mobilePhone){
        return parentsMapper.findParents(mobilePhone);
    }
}
