package org.minpoint.muxige.core.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

/*
 * @ClassName DateTimeUtils
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/15 22:13
 */
public class DateTimeUtils {

    /**
     * 获取当前毫秒时间
     * @return 毫秒
     */
    public static long currentTimeMillis(){
        return System.currentTimeMillis();
    }

    /**
     * 获取当前秒时间
     * @return 秒
     */
    public static long currentTimeStamp(){
        return currentTimeMillis() / 1000;
    }

    /**
     * 获取某天的开始时间
     * @param days 负数 过去的某天，正数，将来的某天，格式：yyyy-MM-dd
     * @return localDateTime
     */
    public static LocalDateTime oneDayStartTime(int days){
        return LocalDateTime.of(LocalDate.now().plusDays(days), LocalTime.MIN);
    }

    /**
     * 获取某天的开始时间
     * @param days 负数 过去的某天，正数，将来的某天，格式：yyyy-MM-dd
     * @return localDateTime
     */
    public static LocalDateTime oneDayEndTime(int days){
        return LocalDateTime.of(LocalDate.now().plusDays(days), LocalTime.MAX);
    }

    /**
     * 获取某天正午时间
     * @param days 负数 过去的某天，正数，将来的某天，格式：yyyy-MM-dd
     * @return localDateTime
     */
    public static LocalDateTime oneDayMidTime(int days){
        return LocalDateTime.of(LocalDate.now().plusDays(days), LocalTime.NOON);
    }

    /**
     * 获取当天开始时间戳UTC
     * @return 当天开始时间戳
     */
    public static long oneDayStartTimeStamp(int days){
        return oneDayStartTime(days).toEpochSecond(ZoneOffset.UTC);
    }

    /**
     * 获取当天开始时间戳UTC
     * @return 当天开始时间戳
     */
    public static long currentDayStartTimeStamp(){
        return oneDayStartTime(0).toEpochSecond(ZoneOffset.UTC);
    }
}
