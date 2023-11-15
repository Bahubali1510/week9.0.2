package src.Question17;

public class Floor1 {

        private double width;
        private double length;

        // Constructor
        public Floor1(double width, double length) {
            // Set width to 0 if it's less than 0
            this.width = (width < 0) ? 0 : width;

            // Set length to 0 if it's less than 0
            this.length = (length < 0) ? 0 : length;
        }

        // Getter method for width
        public double getWidth() {
            return width;
        }

        // Getter method for length
        public double getLength() {
            return length;
        }

        // Method to calculate the area of the floor
        public double calculateArea() {
            return width * length;
        }

        public static void main(String[] args) {

            Floor1 room = new Floor1(12, 10);
            double area = room.calculateArea();
            System.out.println("Area of the floor: " + area + " square meters");
        }
    }


