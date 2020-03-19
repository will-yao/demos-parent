package com.xuantuo.date;

import java.util.Calendar;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/12/19
 **/
public class CalendarDemo {


    public static void main(String[] args) {

        //第二日凌晨
        Calendar cal = Calendar.getInstance();
        long current = cal.getTimeInMillis();

        cal.add(Calendar.DAY_OF_YEAR, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.MILLISECOND, 0);

        long leftTime = (cal.getTimeInMillis() - current) / 1000;

        System.out.println((int)leftTime);
        System.out.println((int) leftTime > 1 ? (int) leftTime : 1);
        System.out.println((int)current);
    }
}
