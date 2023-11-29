

package Lectione;
import java.util.Scanner;

public class Lection6 {

    public static void main(String[] args) {
        
        try (Scanner newScanner = new Scanner(System.in)) {
            int num = newScanner.nextInt();

            if(num>0){
                System.out.println("number is positiv");
            }
            else if(num<0) {
                System.out.println("number is negative");
            } 
            else if (num==0) {
                System.out.println("number is zero");
            }
            else {
                System.out.println("number is not defined");
   }
        }

    }
    
}
