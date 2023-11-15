package src;

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphabets");
        String input = sc.next().toLowerCase();
        String input1 = sc.next().toUpperCase();



        char ch = 0;

       if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
           char charAt = input.charAt(0);

           if (input1.length() == 1 && Character.isLetter(input1.charAt(0))) {
               char charAt1 = input1.charAt(0);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel");
            } else {
                System.out.println(ch + " is a consonant");
            }}
        } else {
            System.out.println("Error: Please enter a single alphabet character.");

        }
    }
}

