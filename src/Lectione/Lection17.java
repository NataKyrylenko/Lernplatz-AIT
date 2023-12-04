package Lectione;

public class Lection17 {
    public static void main(String[] args) {
        String letters = "abcd";
        String letters2 = "abab";
        System.out.println(moveLetter(letters));
        System.out.println(deleteLetter(letters2));

        
        
    }

    public static String moveLetter(String letters){
        char temporary = letters.charAt(letters.length()-1);
        String str2 = letters.substring(0, letters.length()-1);
        return temporary + str2;
    }


/* Написать метод, удаляющий из строки повторяющиеся буквы и возвращающий результат
     abab -> ab */

    public static String deleteLetter(String letters){
        char[] str = letters.toCharArray();
        String result = "";

        for(int i = 0; i< str.length; i++){
            
            if(result.indexOf(str[i]) == -1){
                result += str[i]; 
            } 
        }
        return result; 
    }

}