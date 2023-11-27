//package Spielplatz;
public class Lection12 {
    public static void main(String[] args) {
      //System.out.println(countSum(5)); 
      for (int i = 0; i<10; i++ ){
        if(i==6){ //не печатать 6 и продолжить цикл
            continue;  
        }
        /*if (i<6) { цыкл печатает числа после 6
            continue;
        }*/
        System.out.println(i);
      }
        

    }


    /*
     static int countSum(int n) {
        int sum = 0;
        for(int i = 0; i<=n; i++){
             sum+=i;
        }
        return sum;
    }
    ****************************************** gleich
        int sum = 0;
        for(int i = 1; i<=5;sum += i++);
             
        System.out.println("Sum is "+ sum);

     */
    
    
}
