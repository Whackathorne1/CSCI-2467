package edu.cscc;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] prices = new int[10];
        int count = 0;
        boolean exitLoop = true;
        int x = 0;

//        do
//        {


            for(int i = 0; i < 10; i++)
            {
                System.out.println("Enter a price.");
                prices[count] = input.nextInt();
                count = count + 1;
            }

//                while(exitLoop)
//                {
//                    System.out.println("Would you like to continue? yes or no");
//                    String userAnswer = input.next();
//
//                    if (userAnswer.toLowerCase().contains("n"))
//                    {
//                        break;
//                    }
//                    else if (!userAnswer.toLowerCase().contains("n") && !userAnswer.toLowerCase().contains("y"))
//                    {
//                        System.out.println("Incorrect entry.");
//                    }
//                    else if(userAnswer.toLowerCase().contains("y"))
//                    {
//                        exitLoop = false;
//                    }
//                }

//        }while(true);

        Arrays.sort(prices);

        System.out.println("Three least expensive: ");
        for( int i = 0; i < 3; i++) {
            System.out.println( prices[i] );
        }

        System.out.println("Three most expensive: ");
        for( int i = 7; i <10; i++) {

            System.out.println( prices[i] );
        }
    }
}

