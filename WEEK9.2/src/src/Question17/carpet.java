package src.Question17;

public class carpet {

        // Instance variable
        private double cost;

        // Constructor
        public carpet(double cost) {
            // Check if cost is less than 0 and set to 0 in that case
            if (cost < 0) {
                this.cost = 0;
            } else {
                this.cost = cost;
            }
        }

        // Getter method for cost
        public double getCost() {
            return cost;
        }

        // Method to calculate the total cost based on room dimensions
        public double calculateCost(double width, double length) {
            // Calculate area of the floor
            double area = width * length;

            // Calculate total cost
            double totalCost = area * cost;

            return totalCost;
        }

        public static void main(String[] args) {
            // Example usage
            carpet carpet = new carpet(8.0); // Cost per square meter is $8

            // Room dimensions
            double width = 10.0;
            double length = 12.0;

            // Calculate and display the total cost
            double totalCost = carpet.calculateCost(width, length);
            System.out.println("The total cost of carpeting for the room is: $" + totalCost);
        }
    }


