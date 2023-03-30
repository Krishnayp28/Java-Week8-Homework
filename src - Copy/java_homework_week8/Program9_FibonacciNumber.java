package java_homework_week8;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Program9_FibonacciNumber {
    public static void main(String[] args) {

        //creating object of Scanner class
        Scanner scanner = new Scanner(System.in);
        //Taking input of number of elements in the series
        System.out.println("Enter the Nth term “N” ");
        int n = scanner.nextInt();
        int a = 1, b = 1;
        //scanner close
        scanner.close();
        System.out.print(a + " " + b);
        //for loop to print the series
        for (int i = 1; i <= n - 2; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
    }
}


