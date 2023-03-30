package java_homework_week8;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Program6_Triangle {
    public static void main(String[] args) {
        int i, j, n = 10;
        System.out.print("enter number of rows : ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();

        for (i = 1; i <= n; i++) {// for loop increasing column value by 1 and printing them
            for (j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println("");
        }
    }
}
