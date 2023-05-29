package programmes;

import java.util.Scanner;

public class Palindrome_Number_Pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("Is "
                + number +"  a palindrome? " + isPalindrome(number));
        sc.close();
    }
    private static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return originalNumber == reverse;
    }
}
