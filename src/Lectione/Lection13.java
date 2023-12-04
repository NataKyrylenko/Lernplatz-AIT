package Lectione;
import java.util.Scanner;


public class Lection13 {

    public static void main(String[] args) {
       System.out.println(findPower());
       System.out.println(returnSummeArr());
    }



    public static int findPower (){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a value");
            int num = scanner.nextInt();
            System.out.println("Enter the power of the number ");
            int power = scanner.nextInt();
            int result = 1;
            for(int i=1; i<=power; i++){
                result = result*num;   
            }return result;
        }

    }
    /*Написать метод, возвращающий  сумму 
    значений всех элементов целочисленного массива */

    public static int returnSummeArr(){
        int[] arr = {4,65,2,7,12};
        int summe =0;
        for(int i = 0; i< arr.length; i++){
            summe += arr[i]; 
        }
        return summe;

    }
     
}