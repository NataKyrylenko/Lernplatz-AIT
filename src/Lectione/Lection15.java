package Lectione;

import java.util.Arrays;

public class Lection15 {
    //bubble sort (сортировка пузырьком, меняет елем. местами)

public static void main(String[] args) {
    int[] array = {6,3,0,6,5,-6,6,7, 78};
    bubbleSort(array);
    for (int i = 0; i<array.length; i++){
        System.out.print(array[i] + " ");
    }
    ///////////////////////////////////////////
    int[] ints = {6,8,-47,34,89};
    Arrays.sort(ints); //сортирует масив
    System.out.println(Arrays.toString(ints));// выводит отсортир.масив
    ////////////////////////////////////////////


}

public static void bubbleSort(int[] array){
    boolean sorted = false;
    int temp;
    while (!sorted) { //цыкл повторяется пока sorted=false
        sorted = true;
        for(int i = 0; i<array.length -1; i++){
            if(array[i]>array[i+1]){ //проверка соседних ел.
                temp = array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
                sorted = false;
            }
        }
    }
    

}


}
