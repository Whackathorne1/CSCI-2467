package edu.cscc;

import java.util.Scanner;

// TODO Wyatt Hackathorne, 9/25/20, Calculate and Catagorize BMI
public class Main<classification> {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String classification;
        System.out.println("Please enter your weight in lbs: ");
        double lbs = input.nextDouble();
        System.out.println("Please enter your height in inches: ");
        double inches = input.nextDouble();
        double value = convertToKilograms(lbs);
        double v = convertToMeters(inches);
        double bmi;
        bmi = calcBMI(value, v);

        //classification method
        if (bmi < 18.5)
        {
            classification = "underweight";
        }
        else if (bmi <= 25.0)
        {
            classification = "Normal";
        }
        else if (bmi <= 30)
        {
            classification = "Overweight";
        }
        else
        {
            classification = "Obese";
        }
        System.out.println("Your BMI is " + bmi);
        System.out.println("This BMI is catagorized as " + classification);
    }

    /* Function method */
    private static double calcBMI(double value, double v)
    {
        double bmi = value / (v * v);
        return bmi;
    }
    private static double convertToKilograms(double lbs)
    {
        double value = lbs / 2.2046;
            return value;
    }
    private static double convertToMeters(double inches)
    {
        double v = inches / 39.37;
            return v;
    }
}





