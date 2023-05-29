package programmes;

import java.util.Scanner;

/**Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 The method needs to find the first and the last digit of the parameter number passed to the method,
 using a loop and return the sum of the first and the last digit of that number.
 If the number is negative then the method needs to return -1 to indicate an invalid value.
 */
public class FirstAndLastDigitSum_Pr7 {
    static Scanner sc =new Scanner(System.in);
    public static void main(String args[]) {
        System.out.println("Enter your number");
        int number = sc.nextInt();
        System.out.println(sumFirstAndLastDigit(number));
     //   System.out.println(sumFirstAndLastDigit(113));
      //  System.out.println(sumFirstAndLastDigit(0));
      //  System.out.println(sumFirstAndLastDigit(5));
       // System.out.println(sumFirstAndLastDigit(-20));
sc.close();
    }


    public static int sumFirstAndLastDigit (int number) {
        int lastDigit = number % 10;
        int sum = 0;

        if (number >= 10) {

            while ((number / 10) >= 10){

                number = number / 10;
            }

            number = number / 10;
            sum = lastDigit + number;
            return sum;

        } else if (number < 0) {

            return -1;
        }

        sum = number *= 2;
        return sum;
    }
}


