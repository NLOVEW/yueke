package com.yueke.pojo;

import java.io.Serializable;

/**
 * 用来返回验证结果
 * @author luck_nhb
 */
public class Result implements Serializable {
    /*
    code:标记    comment：备注
     */
    private String code;
    private String comment;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
