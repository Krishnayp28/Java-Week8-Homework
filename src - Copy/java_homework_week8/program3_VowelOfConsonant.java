package java_homework_week8;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 *  alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 *  Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 *  For eg:
 *  Input an alphabet: p
 *  Expected Output:
 *  Input letter is Consonant
 */
public class program3_VowelOfConsonant {
    // main method

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input  an alphabet: ");
        String input = scanner.next().toLowerCase();// Converting user value to lower case and storing in letter variable
        scanner.close();
        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90; // Identifying whether Character is uppercase by ASCII value
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;// Identifying whether Character is lowercase by ASCII value
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");// for any other character it will identify as Consonant

        if (input.length() > 1)  // Identifying whether Character is uppercase by ASCII value
        {
            System.out.println("Error. enter  single character.");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Error.  Enter uppercase or lowercase letter.");// If anything else is entered it will show error.
        } else if (vowels) // If Vowel is identified it will print out Vowel message.
        {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is Consonant");// If vowel is not identified it will print out Consonant message.
        }
    }

}

