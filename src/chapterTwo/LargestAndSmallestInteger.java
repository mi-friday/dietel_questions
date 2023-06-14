package chapterTwo;

import java.util.Scanner;

public class LargestAndSmallestInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest =  0;
        int smallest = 0;

        for (int i = 1; i <= 5; i++){
            System.out.print("Enter integer " + i + ": ");
            int num = input.nextInt();

            if (num > largest){
                largest = num;
            }
            if (num < smallest){
                smallest = num;
            }
        }
        System.out.println("largest integer: " + largest);
        System.out.println("smallest integer: " + smallest);
    }
}
