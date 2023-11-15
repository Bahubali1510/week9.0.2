package src.cylinder;

public class main {
    public static void main(String[] args) {
        // Creating a Circle object with a radius of 5.0
        Circle myCircle = new Circle(5.0);

        // Getting the radius and printing it
        double radius = myCircle.getRadius();
        System.out.println("Radius: " + radius);

        // Calculating the area and printing it
        double area = myCircle.getArea();
        System.out.println("Area: " + area);
    }
}







