package src;

public class RightAngleTriangle {

    public static void displayTriangle(int rows) {
        for (int i = 1; i <= rows; i++) { // loop for rows
            for (int j = 1; j <= i; j++) { // loop for columns
                System.out.print("@");
            }
            System.out.println(); // move to next line after each row
        }
    }
    public static void main(String[] args) {
        int rows = 5; // number of rows in the triangle
        displayTriangle(rows);
    }
}
