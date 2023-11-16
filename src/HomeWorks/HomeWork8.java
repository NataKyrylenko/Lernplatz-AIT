package HomeWorks;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        
        System.out.println("Area of the Circle = " + radiusCircle());
        System.out.println("From Fahrenheit to Celsius is: " + temp() + "°");
    }
    //Task 1
    static double radiusCircle() {
        System.out.println("Enter radius");
        Scanner scanner = new Scanner(System.in);
        int area = scanner.nextInt();
        return Math.PI*(area*area);
    }

    //Task 2
    static int temp () {
        System.out.println("Enter Fahrenheit value");
        Scanner scanner = new Scanner(System.in);
        int gradus = scanner. nextInt();
        return 5*(gradus-32)/9;
    }
}
