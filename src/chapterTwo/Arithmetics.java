package chapterTwo;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();
        int square1 = (int) Math.pow(number1, 2);
        int square2 = (int) Math.pow(number2, 2);
        int diff = square1 - square2;
        System.out.println(diff);
    }
}
