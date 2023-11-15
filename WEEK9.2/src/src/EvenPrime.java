package src;

import java.util.Scanner;

public class EvenPrime {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input from the user
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Check if the number is prime
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }

            scanner.close();
        }

        // Function to check if a number is prime
        private static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }

            // Check for factors from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false; // Found a factor, not a prime number
                }
            }

            return true; // No factors found, it's a prime number
        }
    }


