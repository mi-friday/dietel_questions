package chapterTwo;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second integer: ");
        int secondNumber = input.nextInt();

        int tripled = firstNumber * 3;
        int doubled = secondNumber * 2;

        boolean isMultipled = tripled % doubled == 0;
        System.out.println("Is first number tripled a multiple of the second number doubled? " + isMultipled);

        }
    }

