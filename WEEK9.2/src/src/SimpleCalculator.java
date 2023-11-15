package src;

public class SimpleCalculator {


        // Instance variables
        private double firstNumber;
        private double secondNumber;

        // Getter method for firstNumber
        public double getFirstNumber() {
            return firstNumber;
        }

        // Getter method for secondNumber
        public double getSecondNumber() {
            return secondNumber;
        }

        // Setter method for firstNumber
        public void setFirstNumber(double firstNumber) {
            this.firstNumber = firstNumber;
        }

        // Setter method for secondNumber
        public void setSecondNumber(double secondNumber) {
            this.secondNumber = secondNumber;
        }

        // Method to get the addition result
        public double getAdditionResult() {
            return firstNumber + secondNumber;
        }

        // Method to get the subtraction result
        public double getSubtractionResult() {
            return firstNumber - secondNumber;
        }

        // Method to get the multiplication result
        public double getMultiplicationResult() {
            return firstNumber * secondNumber;
        }

        // Method to get the division result
        public double getDivisionResult() {
            // Check if the secondNumber is 0 to avoid division by zero
            if (secondNumber != 0) {
                return firstNumber / secondNumber;
            } else {
                // In case the value of secondNumber is 0, return 0
                return 0;
            }
        }

        // Example usage
        public static void main(String[] args) {
            SimpleCalculator calculator = new SimpleCalculator();
            calculator.setFirstNumber(10.0);
            calculator.setSecondNumber(5.0);

            System.out.println("Addition Result: " + calculator.getAdditionResult());
            System.out.println("Subtraction Result: " + calculator.getSubtractionResult());
            System.out.println("Multiplication Result: " + calculator.getMultiplicationResult());
            System.out.println("Division Result: " + calculator.getDivisionResult());
        }
    }


