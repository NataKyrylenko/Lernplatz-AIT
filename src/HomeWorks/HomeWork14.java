package HomeWorks;

public class HomeWork14 {
    public static void main(String[] args) {
        int[] array1 = {2,5,3,6,6};
        int[] array2 = {2,7,3,6,6};

        System.out.println(areEqual(array1, array2) ? "true" : "false");
        System.out.println(calcEventNumber(array1));
    }
    //Task1
    public static boolean areEqual( int[] array1, int[] array2){
        if( array1.length != array2.length)
            return false;
        for(int i = 0; i< array1.length; i++){
            if(array1[i] != array2[i])
            return false;
        }
        return true;
    }
    //Task2
    public static int calcEventNumber(int[] array1){
        int counter = 0;
        for(int x : array1){
            if(x%2==0){
               counter++;
            }
        }
        return counter;

    }    
}
