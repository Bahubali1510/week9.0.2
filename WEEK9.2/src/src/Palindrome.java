package src;

import java.util.Scanner;

public class Palindrome {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int userInput = scanner.nextInt();

            System.out.println("Is it a palindrome? " + isPalindrome(userInput));

            scanner.close();
        }

        public static boolean isPalindrome(int number) {

            String numString = String.valueOf(Math.abs(number));

            // Use two pointers to check if the number is a palindrome
            int left = 0;
            int right = numString.length() - 1;

            while (left < right) {
                if (numString.charAt(left) != numString.charAt(right)) {
                    // If any pair of digits do not match, it's not a palindrome
                    return false;
                }
                // Move the pointers towards each other
                left++;
                right--;
            }


            return true;
        }
    }



