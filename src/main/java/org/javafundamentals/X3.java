package org.javafundamentals;

import java.util.Scanner;

public class X3 {


    public static void main(String[] args) {
        int num1, num2;
        System.out.print("Number 1:");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println(num1);
        System.out.print("Number 2:");
        num2 = sc.nextInt();
        System.out.println(num2);
        printMe(num1, num2);

    }

    public static void printMe(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            System.out.println("Zeros is not Allowed..... Try again");
        } else {
            System.out.println("Number 1 + Number 2 = " + (n1 + n2));
            System.out.println("Number 1 * Number 2 = " + (n1 * n2));
            System.out.println("Number 1 / Number 2 = " + (n1 / n2));
            System.out.println("Number 1 - Number 2 = " + (n1 - n2));
        }
    }
}
