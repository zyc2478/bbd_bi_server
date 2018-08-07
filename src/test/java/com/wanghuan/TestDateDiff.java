package com.wanghuan;

import org.junit.Test;

import java.util.Date;

public class TestDateDiff {

    @Test
    public void testDateDiff(){
        int diffDays = 30;
        long diffDaysl = new Long(diffDays);
        long current_time = new Date().getTime();
        System.out.println(current_time);
        long calc_time = current_time -  diffDaysl * 3600 * 24 * 1000 ;
        System.out.println("calc_time:" + calc_time);
        System.out.println("calc_date" +  new Date(calc_time));
    }
}
