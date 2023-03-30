package java_homework_week8;

/**
 * Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@@
 */
public class Program8_AngleTriangle {
    // main method
    public static void main(String[] args) {
        triangle();
    }
         // static method
        public static void  triangle(){
        // for loops print the triangle
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
        }
    }




