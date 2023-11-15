package src.cylinder;

public class Circle {

        // Instance variable
        private double radius;

        // Constructor
        public Circle(double radius) {
            // Initialize the field, setting it to 0 if radius is less than 0
            this.radius = (radius < 0) ? 0 : radius;
        }

        // Instance method to get the radius
        public double getRadius() {
            return radius;
        }

        // Instance method to calculate and return the area
        public double getArea() {
            // Using Math.PI constant for PI
            return radius * radius * Math.PI;
        }

        // You can add other methods or modify the class as needed
    }


