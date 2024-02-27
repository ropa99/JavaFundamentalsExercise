package org.javafundamentals;

import java.util.Scanner;

public class X5 {
    public static void main(String[] args) {
        System.out.print("Name: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello " + (sc.nextLine()));
    }
}
