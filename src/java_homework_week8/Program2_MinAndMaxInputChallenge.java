package java_homework_week8;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class Program2_MinAndMaxInputChallenge {

    public static void main(String[] args) {
        minAndMaxInput();
    }

    public static void minAndMaxInput(){
        Scanner scan = new Scanner(System.in);//scanner declaration for reading input from console
        System.out.println("Please enter total number: ");

        int numbers = scan.nextInt();
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        System.out.println("Please enter " + numbers + " numbers.");
        //implementing the condition
        for (
                int a = 0;
                a < numbers; a++) {
            int current = scan.nextInt();
            if (current > maximum) {
                maximum = current;// // assigning largest entered number value to number integer
            }
            if (current < minimum) {
                minimum = current;// assigning smallest entered number value to number integer
            }
        }
        System.out.println("largest of " + numbers + " numbers is: " + maximum);
        System.out.println("smallest of " + numbers + " numbers is: " + minimum);
        scan.close();

    }
}

