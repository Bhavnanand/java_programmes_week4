package programmes;

import java.util.Scanner;

public class Digit_Sum_challange_Pr4 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number :");
        // Should return 8 => 1 + 2 + 5 = 8
        System.out.println("Sum of 125 is = " + sumDigits(125));
        // Should return 17 => 8 + 5 + 4 = 17
        System.out.println("Sum of 854 is = " + sumDigits(854));
        // Should return 9 => 1 + 8 = 9
        System.out.println("Sum of 18 is = " + sumDigits(18));
        // Should return -1
        System.out.println("Sum of -3 is = " + sumDigits(-3));
        //sc.close();
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sumDigits = 0;
        // Convert number to string
        String numberToString = Integer.toString(number);
        // Map through all char of the string
        for(char c : numberToString.toCharArray()) {
            // Convert the char to number again
            sumDigits += Integer.parseInt(String.valueOf(c));
        }
        return sumDigits;
    }
}