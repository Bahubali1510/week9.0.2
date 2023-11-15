package src;

import java.util.Scanner;

    public class FirstAndLastDigitSum {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number to find the sum of the first and last digits:");

            int inputNumber = sc.nextInt();
            int result = sumFirstAndLastDigit(inputNumber);
            System.out.println("Sum of the first and last digits: " + result);
        }

        public static int sumFirstAndLastDigit(int number) {
            if (number < 0) {
                return -1;
            }

            int lastDigit = number % 10;

            // Find the first digit
            int firstDigit = 0;
            while (number > 0) {
                firstDigit = number % 10;
                number /= 10;
            }

            // Return the sum of the first and last digits
            return firstDigit + lastDigit;
        }
    }

