package com.example.demo.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 时间工具类
 */
public class DateUtils {
    /**
     * 获取当前时间1小时前的时间
     *
     * @return
     */
    public static Date beforeOneHourToNowDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - 1);
        return calendar.getTime();
    }

    /**
     * 获取当前时间1周前的时间
     * @return
     */
    public static Date beforeOneWeekToNowDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, -1);
        return calendar.getTime();
    }
}
