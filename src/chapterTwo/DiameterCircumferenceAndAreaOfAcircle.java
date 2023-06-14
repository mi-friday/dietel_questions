package chapterTwo;

import java.util.Scanner;

public class DiameterCircumferenceAndAreaOfAcircle {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter radius: ");
        int radius = Input.nextInt();

        double circleDiameter = 2 * radius;
        double circumference = 2 * Math.PI * radius ;
        double area = Math.PI * radius * radius;

        System.out.println("Diameter of a circle is: " + circleDiameter);
        System.out.println("Circumference of a circle is: " + circumference);
        System.out.println("Area of a circle is: " + area);
    }

}
