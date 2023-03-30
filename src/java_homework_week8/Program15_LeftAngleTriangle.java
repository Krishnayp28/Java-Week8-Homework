package java_homework_week8;

/**
 * Display left angle triangle of * using nested for loops
 *      *
 *    * *
 *  * * *
 *  * * * *
 *  * * * * *
 */
public class Program15_LeftAngleTriangle {
    public static void main(String args[]) {
        int row  = 5;// Number of rows of stars which will be printed

        for (int j = 1; j <= row; j++) {// for loop 1 for leaving blank spaces
            for (int i = 1; i <= row - j; i++) {// printing two white spaces every time j value increases
                System.out.print("  ");
            }

            for (int k = 1; k <= j; k++) {// for loop 2 for printing the *
                System.out.print("* "); // printing * everytime k value increases
            }

            System.out.println();
        }
    }
}

