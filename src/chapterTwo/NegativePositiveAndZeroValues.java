package chapterTwo;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();

            if (number < 0) {
                negativeCount++;
            } else if (number > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of zeros: " + zeroCount);
    }
}

