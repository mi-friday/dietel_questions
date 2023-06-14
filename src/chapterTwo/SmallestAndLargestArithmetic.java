package chapterTwo;

import java.util.Scanner;

public class SmallestAndLargestArithmetic {

    public static void main(String[] args) {
int min = 0;
int max = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();
        System.out.println("Enter third integer: ");
        int number3 = input.nextInt();
        int sum = number1 + number2 + number3;
        System.out.println("sum: " + sum);
        int average = sum / 3;
        System.out.println("average: " + average);
        int product = number1 * number2 * number3;
        System.out.println("product: " + product);
//        int smallest = Math.min(number1, Math.min(number2, number3));
//        System.out.println("Smallest number: " + smallest);
//        int largest = Math.max(number1, Math.max(number2, number3));
//        System.out.println("Largest number: " + largest);
        if (number1 <= number2 && number1 <= number3){
            min = number1;
        }
        else
        if (number2 <= number1 && number2 <= number3){
            min = number2;
        }
        else
        if (number3 <= number1 && number3 <= number2){
            min = number3;
        }
        System.out.println("the minimum number is " + min);
        if (number1 >= number2 && number1 >= number3){
            max = number1;
        }
        else
        if (number2 >= number1 && number2 >= number3){
            max = number2;
        }
        else
        if (number3 >= number1 && number3 >= number2){
            max = number3;
        }
        System.out.println("the maximum number is " + max);
        }
    }
