package src;

import java.util.Scanner;

public class DigitSum {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number");
            int num = sc.nextInt();

            int result = sumDigits(num);
            System.out.println("Sum of digits: " + result);
        }

        private static int sumDigits(int number) {
            if (number < 10) {
                return -1;
            }
            int sum = 0;
            while (number > 0) {
                // extract the least significant digit
                int digit = number % 10;
                sum = sum + digit;
                // drop least significant digit
                number = number / 10;
            }
            return sum;
        }
    }
