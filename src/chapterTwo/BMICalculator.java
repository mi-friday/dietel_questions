package chapterTwo;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        double bmi = calculateBMI(weightInPounds, heightInInches);

        System.out.println("BMI: " + bmi);
        displayBMICategory(bmi);
    }

    public static double calculateBMI(double weightInPounds, double heightInInches) {
        double bmi = (weightInPounds * 703) / (heightInInches * heightInInches);
        return bmi;
    }

    public static void displayBMICategory(double bmi) {
        System.out.print("BMI Category: ");
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
