package Lectione;
import java.util.Scanner;

public class Lection7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scanner.nextInt();

        boolean result = (year%4==0 || year%100==0 || year%400==0);
        System.out.println("is " + year + " a leap year? " + result);
        
    }
}
