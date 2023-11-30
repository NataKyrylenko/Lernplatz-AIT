package HomeWorks;

public class HomeWork16 {
    public static void main(String[] args) {
        String str = "Hello";
        returnLangString(str);

        String str1 = "Hello";
        String str2 = "There";
        System.out.println(concatString(str1, str2));
        
        String letters = "abcd";
        System.out.println(moveLetter(letters));

    }
    //Task 1
    public static void returnLangString(String string){
        System.out.println(string.length()*2); 
    }

    //Task 2
    public static String concatString(String str1, String str2){
       str1 = str1.substring(1);
       str2 = str2.substring(1);
       String result = str1.concat(str2).toUpperCase();
       return result;
    }

    //Task 3
    public static String moveLetter(String letters){
        char temporary = letters.charAt(0);
        letters = letters.substring(1);
        String charToStr = Character.toString(temporary);
        String result = letters.concat(charToStr);
        return result;
    }
    
}
