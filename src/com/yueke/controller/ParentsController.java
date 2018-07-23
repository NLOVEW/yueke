package com.yueke.controller;

import com.alibaba.fastjson.JSON;
import com.yueke.pojo.EssayComment;
import com.yueke.pojo.Parents;
import com.yueke.pojo.Result;
import com.yueke.service.ParentsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 家长用户控制器
 * @author luck_nhb
 */
@RestController
public class ParentsController {
    //注入ParentsService
    @Resource(name = "parentsService")
    private ParentsService parentsService;

    private Result result = new Result();

    /**
     * 查询家长用户的个人信息
     * @param request
     * @return 返回Parents的json字符串
     */
    @RequestMapping(value = "/parents/getParents",method = RequestMethod.GET)
    public String getParents(HttpServletRequest request){
        String mobilePone = (String) request.getSession().getAttribute("user");
        //todo parents中的time是时间戳，没有进行处理
        Parents parents = parentsService.findParents(mobilePone);
        String parentsJson = JSON.toJSONString(parents);
        return parentsJson;
    }

    /**
     * 前端传入 esid，message两个字段
     * @param essayComment
     * @param request
     * @return
     */
    @RequestMapping(value = "/parents/commentEssay",method = RequestMethod.POST)
    public String commentEssay(EssayComment essayComment , HttpServletRequest request){
        String mobilePhone = (String) request.getSession().getAttribute("user");
        int tem = parentsService.commentEssay(mobilePhone, essayComment);
        if (tem == 0){
            result.setCode("error");
        }else {
            result.setCode("success");
        }
        return JSON.toJSONString(result);
    }
}
