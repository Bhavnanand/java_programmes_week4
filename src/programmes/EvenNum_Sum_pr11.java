package programmes;

import java.util.Scanner;

public class EvenNum_Sum_pr11 {
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your number");
        int number= sc.nextInt();
        int sum = getEvenDigitSum(number);
        System.out.println(sum);
        sc.close();
    }

    public static int getEvenDigitSum(int number) {
        int originalNumber = number;
        int lastDigit;
        int sumOfEvenDigits = 0;
        if (number >= 0) {
            while (number > 0) {
                lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    sumOfEvenDigits += lastDigit;
                }
                number /= 10;
            }
            if (originalNumber >= 0) {
                System.out.println("The sum of even digits within a number " + originalNumber + " is equal to:");
            }
            return sumOfEvenDigits;
        }
        System.out.println("Invalid input:");
        return -1;
    }
}