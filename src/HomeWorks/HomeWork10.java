package HomeWorks;

import java.util.Scanner;

public class HomeWork10 { 
    //Task1
    //  static void printCube() {
    //       int  n = 0;
    //       int y = 0;
    //         while (n<3) {
    //         n++;
    //         y = n*n*n;
    //         //n = n*n*n;
    //         System.out.println(y);  
    //         }
            
    //  }
     public static void main(String[] args) {
      //printCube();
           
     //Task2
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number from o to 100. You have 4 attempts to guess the number");
    int att = 0;
    
    while (att<4) {
        int rand = scanner.nextInt();
        int x = 75;
        
        if (rand<x ) {
            System.out.println("little");
            att++;
            if (att==4){
                System.out.println("Youre attempts are over");
                break;
            }
        }
        else if (rand>x){
            System.out.println("many");
            att++;
            if (att==4){
                System.out.println("Youre attempts are over");
                break;
            }
        }
        else {
             System.out.println("Super! You won");
             break;
        }
    }
}
    
}

