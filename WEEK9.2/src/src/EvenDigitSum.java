package src;

public class EvenDigitSum {

        public static void main(String[] args) {
            // Example usage
            int number = 123456;
            int result = getEvenDigitSum(number);

            if (result != -1) {
                System.out.println("Sum of even digits in " + number + " is: " + result);
            } else {
                System.out.println("Invalid number");
            }
        }

        public static int getEvenDigitSum(int number) {
            if (number < 0) {
                return -1; // Invalid value
            }

            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                if (digit % 2 == 0) {
                    sum += digit;
                }
                number /= 10;
            }

            return sum;
        }
    }


