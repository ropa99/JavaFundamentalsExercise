package org.javafundamentals;
import java.util.Scanner;
public class X2 {
    public static void main(String[] args) {
        int year;
        boolean leap;
        System.out.print("Year?: ");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        //System.out.println("Year :" +year);
        if (year % 4 == 0){
            //Check for century
            if(year % 100 ==0){
                if(year % 400 == 0){
                    leap = true;
                }else{
                    leap = false;
                }

            } else {
                leap = true;
            }

        } else {
            leap = false;
        }

        if (leap){
            System.out.println("Year: " + year + " is a leap year");
        }else{
            System.out.println("Year: " + year + " is NOT a leap year");
        }
    }
}

