package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int volume = 400;
        int water;
        {


            do {
                System.out.println("please enter the amount of water added or removed; ");
                volume = input.nextInt();
            } while (volume <= 1200);

        }
    }
}
