package com.yueke.service;

import com.yueke.mapper.EssayMapper;
import com.yueke.mapper.SchoolMapper;
import com.yueke.mapper.ToolOrderMapper;
import com.yueke.pojo.Class;
import com.yueke.pojo.*;
import com.yueke.utils.FastDfsUtil;
import com.yueke.utils.IDUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Transactional
@Service("schoolService")
public class SchoolService {
    @Resource(name = "schoolMapper")
    private SchoolMapper schoolMapper;

    @Resource(name = "toolOrderMapper")
    private ToolOrderMapper toolOrderMapper;

    @Resource(name = "essayMapper")
    private EssayMapper essayMapper;

    public int updatePassword(String password,String mobilePhone) {
        int tem = schoolMapper.updatePassword(password, mobilePhone);
        return tem;
    }

    public List<School> getAllSchool() {
        List<School> schools = schoolMapper.findAllSchool();
        return schools;
    }

    public School getSchool(String mobilePhone) {
        School school = schoolMapper.findSchool(mobilePhone);
        return school;
    }

    public int updateSchool(School school) {
        int tem = schoolMapper.updateSchool(school);
        return tem;
    }

    public Image uploadImage(MultipartFile file, HttpServletRequest request) {
        Image image = new Image();
        try {
            String imageName = file.getOriginalFilename();
            String extName = imageName.substring(imageName.lastIndexOf(".") + 1);
            FastDfsUtil fastDfsUtil = new FastDfsUtil();
            FastDfsFile fastDfsFile = new FastDfsFile(imageName, file.getBytes(), extName);
            String path = null;
            path = fastDfsUtil.uploadImage(fastDfsFile);
            String mobilePhone = (String) request.getSession().getAttribute("user");
            School school = schoolMapper.findSchoolByMobilePhone(mobilePhone);
            image.set(IDUtil.getId(), 1,school.getSid(), path, new Date());
            schoolMapper.insertImage(image);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }

    public String getImagePath(String mobilePhone) {
        School school = schoolMapper.findSchoolByMobilePhone(mobilePhone);
        String path = schoolMapper.findPathByUid(school.getSid());
        return path;
    }

    public List<Class> getClass(String mobilePhone) {
        School school = schoolMapper.findSchoolByMobilePhone(mobilePhone);
        List<Class> classes = schoolMapper.findAllClassBySid(school.getSid());
        return classes;
    }

    public int setClass(String mobilePhone, Class clazz) {
        School school = schoolMapper.findSchoolByMobilePhone(mobilePhone);
        clazz.setSchool(school);
        clazz.setCid(IDUtil.getId());
        int tem = schoolMapper.insertClass(clazz);
        return tem;
    }

    public int setSTeacher(String mobilePhone, STeacher sTeacher) {
        School school = schoolMapper.findSchoolByMobilePhone(mobilePhone);
        MultipartFile image = sTeacher.getImage();
        int tem = 0;
        if (image == null){
            sTeacher.setStId(IDUtil.getId());
            sTeacher.setSchool(school);
            tem = schoolMapper.insertSTeacher(sTeacher);
        }else{
            try {
                String imageName = image.getOriginalFilename();
                String extName = imageName.substring(imageName.lastIndexOf(".") + 1);
                FastDfsUtil fastDfsUtil = new FastDfsUtil();
                FastDfsFile fastDfsFile = new FastDfsFile(imageName, image.getBytes(), extName);
                String path = null;
                path = fastDfsUtil.uploadImage(fastDfsFile);
                sTeacher.setStId(IDUtil.getId());
                sTeacher.setSchool(school);
                sTeacher.setImagePath(path);
                tem = schoolMapper.insertSTeacher(sTeacher);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return tem;
    }


}
