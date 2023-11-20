package HomeWorks;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
      System.out.println(defineNumber());

      System.out.println(checkSymbol());
      
    }
    //Task1
    static String defineNumber() {
        System.out.println("Enter a Number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            return " number + is negativ";
        }
        else if(number > 0) {
            return "number +  is positiv";
        }
        else {
            return "Number is null";
        }   
    }

    //Task 2
    static String checkSymbol() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Symbol ");
        char mySymbol = scanner.next().charAt(0);
         
        switch (mySymbol) {
            case 'a':
            case'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return "Symbol + is a vowel";
                   
            default:
                 return "Symbol is a consonant ";
    }
  } 
}