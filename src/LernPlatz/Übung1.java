package LernPlatz;
import java.util.Stack;
public class Übung1 {
    public static void main(String[] args) {
        int[] arr1 = {10, 15, 10, 10, 25, 10};
        int[] arr2 = {10, 15, 10, 1, 5, 45};
        //
       checkSumme(arr1); 
       checkSumme(arr2);
    }

    public static void checkSumme(int[] arr){
        Stack <Integer> newArr = new Stack <> ();
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==10){
                newArr.push(arr[i]);
                
            }    
        }System.out.println(newArr);
    }
    
}


