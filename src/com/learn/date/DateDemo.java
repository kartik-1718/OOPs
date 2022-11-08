package com.learn.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = date .plusDays(1);
        LocalDateTime time = LocalDateTime.now();


        System.out.println(date);
        System.out.println("yestrday's date was "+ yesterday);
        System.out.println("Tomorrow's date is "+ tomorrow);

        System.out.println(time);
    }
}
