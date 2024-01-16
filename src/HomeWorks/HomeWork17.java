package HomeWorks;

import java.util.Arrays;

public class HomeWork17 {
    public static void main(String[] args) {
        String str1 = "asdf";
        String str2 = "dsaf";
        System.out.println(anagramString(str1,str2));
        System.out.println(removeIndex("Hello", 3));

        System.out.println(mySubstring("Hello", 0, 3));

    }

     /*Написать метод, принимающий две строки и проверяющий является ли одна строка анграммой другой.Метод
        возвращает boolean
        abcd  - bcda acbd - анаграммы
        abcd -    acb  abkc - не анаграммы 
         toCharArray
         Arrays.sort
        
        */
        //Task1
    public static boolean anagramString(String str1,String str2){
        if(str1.length() != str2.length())
            return false;
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i = 0; i< ch1.length; i++){
            if(ch1[i] != ch2[i]){
                return false;
            }
        }return true;
    }

    /*Написать метод, принимающий строку и целое число(индекс) и возвращающий строку без символа, находящегося по этому индексу.

        Пример:
        int index = 3
        String str = "Hello"
        public static String removeCharAtIndex( String str, int index) -> "Helo"  */
    
        //task2
    public static String removeIndex(String str, int index){
        return str.substring(0,index) + str.substring(index +1);
    }

    //Task3
    /*Написать свой собственный метод substring, работающий аналогично методу в Джаве. Метод принимает строку , индексы начала и конца и возвращает подстроку.
    String mySubstring( String string, int begin, int end). */

    public static String mySubstring(String string, int begin, int end){
       String res = "";
        for(int i = begin; i < string.length() && i < end; i++){
            res += string.charAt(i);
        }
        return res;
    }
   
}
