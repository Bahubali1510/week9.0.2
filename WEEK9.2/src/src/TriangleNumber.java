package src;

import java.util.Scanner;

public class TriangleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.println("enter the size of triangle");
        rows = sc.nextInt();

        for (int i =1; i<=rows; i++)
        {
         for (int j=1; j<=i; j++)
         {
             System.out.println(j+ " ");
         }
        }
    }
}
