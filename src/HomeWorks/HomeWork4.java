package HomeWorks;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {

        //Task1
        Scanner myScanner = new Scanner(System.in);
        String firstName = myScanner.nextLine();
        String lastName = myScanner.nextLine();
        int age = myScanner.nextInt();
        System.out.println("First name: " + firstName + "\nLast name: " + lastName + "\nAge: " + age);

        //Task2
        System.out.println("Enter a value char");
        Scanner newScanner = new Scanner(System.in);
        int myChar = newScanner.nextInt();
        char ch = (char) myChar;
        System.out.println("Symbol char is: " +  ch);

        //Task3
        System.out.println("Enter a value variable 1");
        Scanner newVariable = new Scanner(System.in);
        int num1 = newVariable.nextInt();
        System.out.println("Enter a value variable 2");
        int num2 = newVariable.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("vaiables 1 = " + num1 + "\nvariables 2 = " + num2 );
    }

}
