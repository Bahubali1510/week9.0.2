package src;


import java.util.Scanner;
public class ReadingUserInputChallange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        int sum = 0;

              while (count<10){
            System.out.println("Enter the number" + (count+1) + " ");
            if (sc.hasNext())
                  {
                      int value = sc.nextInt();
                      sum += value;
                      count++;
                  }
                  else {
                    System.out.println("Invalid Number");
                    sc.hasNext();
            }
        }
        System.out.println("sum of numbers:" + sum);
              sc.close();
    }
}




