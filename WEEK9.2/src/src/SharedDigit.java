package src;

public class SharedDigit {


        public static void main(String[] args) {
            // Example usage
            System.out.println(hasSharedDigit(12, 23)); // Should return true
            System.out.println(hasSharedDigit(9, 99));  // Should return false
            System.out.println(hasSharedDigit(15, 55)); // Should return true
        }

        public static boolean hasSharedDigit(int number1, int number2) {
            if (!isValidRange(number1) || !isValidRange(number2)) {
                return false;
            }

            // Extract digits from the numbers
            int digit1Number1 = number1 % 10;
            int digit2Number1 = number1 / 10;
            int digit1Number2 = number2 % 10;
            int digit2Number2 = number2 / 10;

            // Check for shared digits
            return (digit1Number1 == digit1Number2 || digit1Number1 == digit2Number2 ||
                    digit2Number1 == digit1Number2 || digit2Number1 == digit2Number2);
        }

        private static boolean isValidRange(int number) {
            return number >= 10 && number <= 99;
        }
    }


