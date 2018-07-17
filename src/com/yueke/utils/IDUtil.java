package com.yueke.utils;

/**
 * 用来生成13位主键
 * @author luck_nhb
 */
public class IDUtil {
    public static String getId() {
        long lId = System.currentTimeMillis();
        String string = String.valueOf(lId);
        return string;
    }
}
