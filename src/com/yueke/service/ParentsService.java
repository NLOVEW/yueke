package com.yueke.service;

import com.yueke.mapper.EssayCommentMapper;
import com.yueke.mapper.EssayMapper;
import com.yueke.mapper.ParentsMapper;
import com.yueke.pojo.EssayComment;
import com.yueke.pojo.Parents;
import com.yueke.utils.IDUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 家长服务类
 * @author luck_nhb
 */
@Service
public class ParentsService {
    //注入ParentsMapper
    @Resource(name = "parentsMapper")
    private ParentsMapper parentsMapper;

    @Resource(name = "essayMapper")
    private EssayMapper essayMapper;

    @Resource(name = "essayCommentMapper")
    private EssayCommentMapper essayCommentMapper;

    /**
     * 根据用户手机号查询
     * @param mobilePhone
     * @return 家长用户Parents
     */
    public Parents findParents(String mobilePhone){
        return parentsMapper.findParents(mobilePhone);
    }

    public int commentEssay(String mobilePhone, EssayComment essayComment) {
        Parents parents = parentsMapper.findParents(mobilePhone);
        essayComment.setPid(parents.getPid());
        essayComment.setTime(new Date());
        essayComment.setEcid(IDUtil.getId());
        int tem = essayCommentMapper.insertCommentEssay(essayComment);
        if (tem != 0){
            return 1;
        }
        return 0;
    }
}
