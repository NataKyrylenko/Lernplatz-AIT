package Lectione;
public class Lection15 {
    //bubble sort (сортировка пузырьком, меняет елем. местами)

public static void main(String[] args) {
    int[] array = {6,3,0,5};
    bubbleSort(array);
    for (int i = 0; i<array.length; i++){
        System.out.println(array[i] + " ");
    }
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
