package chapterTwo;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int square = (int) Math.pow(number, 2);
        System.out.println(square);
        if (square > 100) {
        System.out.println( "Number and its square is greater than 100");
    }   else if (square < 100) {
            System.out.println( "Number and its square is less than 100");
        }
        else if(square == 100 ) {
            System.out.println("Number and its square is equal to 100");
        }
        else{
            System.out.println("square is not equal to 100");
        }
    }
    }
