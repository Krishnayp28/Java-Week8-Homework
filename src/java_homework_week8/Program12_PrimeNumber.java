package java_homework_week8;
/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */

import java.util.Scanner;

public class Program12_PrimeNumber {

    static boolean checkForPrime(int num) {
        boolean isItPrime = true;

        if(num <= 1) {
            isItPrime = false;

            return isItPrime;
        }
        else {
            for (int i = 2; i<= num/2; i++) {// for loop increasing value by 1 whilst keeping it less than what user entered
                if ((num % i) == 0) {// Checking whether user entered number and remainder of i equals zero.
                    isItPrime = false;
                    break;
                }
            }
            return isItPrime;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int inputNumber = scanner.nextInt();
        boolean isItPrime = checkForPrime(inputNumber);

        if (isItPrime) {
            System.out.println(inputNumber + " is a prime number.");
        } else {
            System.out.println(inputNumber + " is not a prime number.");
        }
        scanner.close();
    }

}
