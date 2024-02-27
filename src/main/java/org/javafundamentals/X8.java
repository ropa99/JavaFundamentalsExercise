package org.javafundamentals;

import java.util.Scanner;
import java.util.Random;

public class X8 {
    public static void main(String[] args) {
        int upperBound = 500;
        int guess;
        int answer;
        int noOfTries = 0;

        //Random object
        Random r = new Random();
        //Returns number between 0 -499. Added 1 for correct value
        answer = r.nextInt(upperBound) + 1;
        //System.out.println("Random number: " + answer);


        System.out.print("Guess a number between 1 - 500 : ");
        guess = getGuess();
        noOfTries++;

        while (guess != answer) {
            if (guess < answer) {
                System.out.print("Your guess was to small, Try again: ");
                guess = getGuess();
                noOfTries++;
            } else if (guess > answer) {
                System.out.print("Your guess was to big, Try again: ");
                guess = getGuess();
                noOfTries++;
            }


        }
        System.out.println("Congratulations You guessed the correct number: " + answer + " using " + noOfTries + " guesses");
        noOfTries = 0;

    }

    public static int getGuess() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }

}
