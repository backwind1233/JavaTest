package com.java.se;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by zhihaoguo on 15/3/23.
 */
public class TestCal {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2015, 3, 1, 0, 0, 0);
        Date date = cal.getTime();

        System.out.println(date);

        cal.set(Calendar.MONTH, 3);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);

        date = cal.getTime();

        System.out.println(date);

    }
}
