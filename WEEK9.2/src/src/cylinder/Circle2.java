package src.cylinder;

public class Circle2 {
        private double radius;

        public Circle2(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    class Cylinder extends Circle {
        private double height;

        public Cylinder(double radius, double height) {
            super(radius);
            this.height = (height < 0) ? 0 : height;
        }

        public double getHeight() {
            return height;
        }

        public double getVolume() {
            return getArea() * height;
        }
    }

    class Main {
        public static void main(String[] args) {
            // Example usage
            double radius = 3.0;
            double height = 5.0;

            Cylinder cylinder = new Cylinder(radius, height);

            System.out.println("Radius: " + cylinder.getRadius());
            System.out.println("Height: " + cylinder.getHeight());
            System.out.println("Volume: " + cylinder.getVolume());
        }
    }

