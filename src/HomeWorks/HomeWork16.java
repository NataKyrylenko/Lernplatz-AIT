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
        String result = str1.substring(1)+str2.substring(1);
        return result.toUpperCase();
    }

    //Task 3
    public static String moveLetter(String letters){
        char temporary = letters.charAt(3);
        String str2 = letters.substring(0,3);
        return temporary + str2;
    } }
    // 
        // 
        // 
// } char[] str = letters.toCharArray();
//          return str[3]+ letters.substring(0,3);
