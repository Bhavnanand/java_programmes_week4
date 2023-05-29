package programmes;

import java.util.Scanner;

/**Write a method named hasSharedDigit with two parameters of type int.
 Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not  within the range, the method should return false.
 The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;  otherwise, the method should return false.
*/
 public class ShareDigit_Pr13 {
    public static Scanner sc =new Scanner(System.in);
    public static boolean hasSharedDigit(int number1, int number2) {

      //  Scanner sc = new Scanner(System.in);
       // System.out.println("Number 1");
      //  number1 = sc.nextInt();
     //   System.out.println("Number 1");
    //    number2 = sc.nextInt();
        if ((number1 < 10 || number1 > 99) && (number2 < 10 || number2 > 99)) {
            return false;
        }

        int numberOneFirstDigit = number1 / 10;
        int numberTwoFirstDigit = number2 / 10;
        int numberOneLastDigit = number1 % 10;
        int numberTwoLastDigit = number2 / 10;

        if (numberOneFirstDigit == numberTwoFirstDigit || numberOneFirstDigit == numberTwoLastDigit || numberOneLastDigit == numberTwoLastDigit) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter Number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number2: ");
        int num2 = sc.nextInt();
        System.out.println(hasSharedDigit(num1, num2));


    }
}
