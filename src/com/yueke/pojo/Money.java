package com.yueke.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 余额
 * 记录每个用户的账户余额
 * @param <T>
 * @author luck_nhb
 */
public class Money<T> implements Serializable {
    private String mId;
    private T object;
    private Double balance;
    private Date time;

    public void set(String mId, T object, Double balance, Date time) {
        this.mId = mId;
        this.object = object;
        this.balance = balance;
        this.time = time;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
