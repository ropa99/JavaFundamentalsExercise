package org.javafundamentals;

import java.util.Scanner;

public class X4 {
    public static void main(String[] args) {
        int n1, n2, n3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Value 1: ");
        n1 = sc.nextInt();
        System.out.print("Value 2: ");
        n2 = sc.nextInt();
        System.out.print("Value 3: ");
        n3 = sc.nextInt();
        printMe(n1, n2, n3);
    }

    public static void printMe(int n1, int n2, int n3) {
        System.out.println("Average of the three values = " + ((n1 + n2 + n3) / 3));

    }
}
