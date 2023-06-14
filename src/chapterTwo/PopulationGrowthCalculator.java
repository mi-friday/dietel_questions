package chapterTwo;

import java.util.Scanner;

public class PopulationGrowthCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current world population: ");
        long currentPopulation = input.nextLong();

        System.out.print("Enter the annual population growth rate (%): ");
        double growthRate = input.nextDouble() / 100.0;

        System.out.print("Enter the number of years to estimate: ");
        int years = input.nextInt();


        for (int i = 1; i <= years; i++) {
            currentPopulation += (long) (currentPopulation * growthRate);
            System.out.println("Estimated world population after " + i + " year(s): " + currentPopulation);
        }
    }
}
