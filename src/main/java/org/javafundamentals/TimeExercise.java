package org.javafundamentals;

import java.util.Locale;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeExercise {
    public static void main(String[] args) {


        System.out.println("Current day: " + LocalDate.now());

        LocalDate ld1 = LocalDate.now();
        String dateStr = ld1.format(DateTimeFormatter.ofPattern("eeee dd LLLL", new Locale("sv")));

        LocalDate ld2 = LocalDate.parse("2024-03-26");


    }


}
