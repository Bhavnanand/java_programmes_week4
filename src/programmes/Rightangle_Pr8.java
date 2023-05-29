package programmes;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Rightangle_Pr8 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        rightAngle();
    }

    public static void rightAngle() {
        System.out.println("Enter rows:");
        int rows = sc.nextInt();
        for (int x = 1; x <= rows; x++) {
            for (int i = 1; i <= x; i++) {
                System.out.print("@" + "");
            }

            System.out.println("");
        }
    }


}
