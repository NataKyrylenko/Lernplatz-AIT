package HomeWorks;

import java.util.Scanner;

public class HomeWork12 {
    
    public static void main(String[] args) {
        printTabelle();
        printTriangle();
    }

    //Task1
    public static void printTabelle() {
        try(Scanner scanner = new Scanner(System.in)) {
 System.out.println("Enter a number");
        int number = scanner. nextInt();

            for(int i = 1; i<=10; i++) {
                System.out.println(number + " * " + i + " = " +i*number);
            }
        }
    
       

           // scanner.close();
    }

    //Task2
    static void printTriangle () {
        for(int i = 1; i<=6;i++){
            for(int y =1; y<=i; y++){
                System.out.print(y); 
            }
            System.out.println();
        }
    }    

}
