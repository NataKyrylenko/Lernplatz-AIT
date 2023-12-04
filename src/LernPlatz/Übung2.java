package LernPlatz;

public class Übung2 {
    
public static void main(String[] args) {
    
   
    //String vaja = rotateLetters("Java", 2);
    System.out.println(rotateLetters("Java", 2));

}

public static String rotateLetters(String input, int amount) {
   String string = "";
   for(int i = 0; i<amount;i++){
      char temporary = input.charAt(0);
      string = input.substring(1)+temporary;
      input = string;
   }return input;
}


// public static boolean rotatedLetters(String str1,String vaja){  
//      String str2 = "";

//      for(int i=0; i < str1.length(); i++){
//         char temporary = str1.charAt(0);
//         str2 = str1.substring(1) + temporary;
//         str1 = str2;
//         //System.out.println(str1);
//         if(str1.equals(vaja)){
//            return true;
//         }
//      } return false;
//     } 
    
}
