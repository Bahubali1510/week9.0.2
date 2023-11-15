package src;

public class LeftTriangle {
    public static void main(String[] args) {
        int rows = 5; // You can change the number of rows as needed

        for (int i = 0; i < rows; i++) {
            // Inner loop to print '*' for each row
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}

