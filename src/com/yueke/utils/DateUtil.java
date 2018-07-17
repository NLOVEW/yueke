package com.yueke.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间转换
 * @author luck_nhb
 */
public class DateUtil {
    /**
     * 将Date日期格式转换成"yyyy-MM-dd HH:mm:ss"
     * @param date
     * @return
     */
    public static String date2SimpleDate(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        return format;
    }
}
