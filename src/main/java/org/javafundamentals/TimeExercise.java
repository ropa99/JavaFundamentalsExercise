package org.javafundamentals;


import java.time.*;
import java.time.chrono.ChronoLocalDate;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Locale;

import java.time.format.DateTimeFormatter;

public class TimeExercise {
    public static void main(String[] args) {

        //1
        System.out.println("Current day: " + LocalDate.now());

        //2
        LocalDate ld1 = LocalDate.now();
        String dateStr = ld1.format(DateTimeFormatter.ofPattern("eeee dd LLLL", new Locale("sv")));
        System.out.println(dateStr);

        //3
        LocalDate ld2 = LocalDate.parse("2024-03-26");
        DayOfWeek x = DayOfWeek.SUNDAY;
        int dayNumber = x.getValue();
        for (int i = -1; i < (dayNumber - 1); i++) {

            System.out.println(ld2.plusDays(i).getDayOfWeek());
        }


        //4
        String sDate = "2024-03-05";
        System.out.println("Date parsed:" + LocalDate.parse(sDate));

        //5
        LocalDate ld3 = LocalDate.parse("1967-05-27");
        System.out.println("Birth Day: " + ld3.getDayOfWeek());

        //6
        LocalDate ld4 = LocalDate.now();
        LocalDate ld5 = ld4.plusYears(10);
        LocalDate ld6 = ld5.minusMonths(10);
        System.out.println("Month: " + ld6.getMonth());

        //7 todo:Check 7. Months and days don't calculate correct ???
        Period p1 = Period.between(ld3, ld4);
        System.out.println("Years: " + p1.getYears() + " Months: " + p1.getMonths() + " Days: " + p1.getDays());

        //8
        Period p2 = Period.of(4, 7, 29);
        LocalDate ld7 = LocalDate.now();
        LocalDate ld8 = ld7.plusYears(p2.getYears()).plusMonths(p2.getMonths()).plusDays(p2.getDays());
        System.out.println("Future Date: " + ld8.getYear() + "-" + ld8.getMonthValue() + "-" + ld8.getDayOfMonth());

        //9
        LocalTime lt1 = LocalTime.now();
        System.out.println("LocalTime: " + lt1);

        //10
        System.out.println("NanoSeconds: " + lt1.getNano());

        //11
        LocalTime localTime = LocalTime.parse("11:43");
        System.out.println("LocalTime as String: " + localTime.toString());

        //12
        LocalTime lt2 = LocalTime.now();
        System.out.println("Pattern: " + lt2.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));

        //13
        LocalDateTime ldt9 = LocalDateTime.of(2020, 12, 31, 10, 00);

        //14
        System.out.println("DateTime: " + ldt9.format(DateTimeFormatter.ofPattern("EEEE dd LLL HH:mm ", new Locale("sv"))));

        //15
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt1 = LocalDateTime.of(ld, lt);

        //16 todo: same as 15 ???
    }


}
