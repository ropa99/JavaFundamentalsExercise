package org.javafundamentals;

import java.util.Scanner;

public class X7 {
    public static void main(String[] args) {
        int sec;
        int secOnHour = 3600; //60 * 60
        int secOnMinutes = 60;
        int secRemaning;
        int hours, min;
        System.out.print("Input seconds: ");
        Scanner sc = new Scanner(System.in);
        sec = sc.nextInt();

        //Get hours
        hours = sec / secOnHour;
        //Remaining seconds
        secRemaning = sec - (hours * secOnHour);
        //Get minutes
        min = secRemaning / secOnMinutes;
        //Remaining seconds
        secRemaning = sec - ((hours * secOnHour) + (min * secOnMinutes));
        System.out.println("Time: " + hours + ":" + min + ":" + secRemaning);


    }
}
