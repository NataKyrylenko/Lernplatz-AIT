package HomeWorks;

public class HomeWork13 {
    public static void main(String[] args) {
        printFruits();
        minNumberArr();
    }  

    
    //Task1
    static void printFruits(){
        String[] fruitsArr = {"Orange", "Apple", "Banana", "Mango"};
        for(int i = 0; i< fruitsArr.length; i++)
            System.out.println(fruitsArr[i]);
        
        for(int y = 0; y< fruitsArr.length; y++){
            fruitsArr[0] = "Kiwi";
            System.out.println(fruitsArr[y]);
         
        }
        //Task2
        for(int e = 0; e<fruitsArr.length; e++){
            if(e%2==0){
                System.out.println(fruitsArr[e]);
            }
        }
    }

    //Task3
        static void minNumberArr(){
            int[] numbers = {2,4,6,23,-4,78,-1};
            for(int i = 0; i< numbers.length; i++){
                if( numbers[i]<numbers[0]){
                    numbers[0] = numbers[i];    
                }        
            }System.out.println(numbers[0]);
        }

}
