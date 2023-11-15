package src;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;


        while (true) {
            System.out.print("Enter  number ");

            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }

            } else {
                break;
            }

            sc.nextLine();
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);

        sc.close();

    }
}
