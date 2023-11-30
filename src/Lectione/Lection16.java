package Lectione;

import java.util.Arrays;

public class Lection16 {
    public static void main(String[] args) {
        String java = "Hello";

        char[] strArr = java.toCharArray();            //toCharArray()
        System.out.println(Arrays.toString(strArr));


        String empty = "";
        //empty = " ";
        System.out.println(empty.length());
        System.out.println(java.isEmpty());             //isEmpty()
        System.out.println(empty.isEmpty());


        String stri1 = "Hello";                         //concat()
        String stri2 = "world";
        String res = stri1.concat(" ").concat(stri2).concat(" ").concat("2023");
        System.out.println(res);

        String stJoin = String.join(" ", stri1,stri2); //join()
        System.out.println(stJoin);
        
        
        System.out.println(stri1.charAt(0));               //charAt()
        System.out.println(stri1.charAt(stri1.length()-1));      // last symbol of the string
        ///////////////////////////////////////////

        String jack = "Jack";
        String jack1 = "Jack";
        System.out.println(jack == jack1); //true
        String jack2 = new String("jack");
        System.out.println(jack == jack2); //false

        System.out.println(jack.equals(jack2));                    //equals()
        System.out.println(jack.equalsIgnoreCase(jack2));          //equalsIgnoreCase()
        System.out.println(jack.toLowerCase());                    //toLowerCase()
        System.out.println(jack.toUpperCase());                    //toUpperCase()


        System.out.println(stri1.compareTo(stri2));                 //compareTo()
        System.out.println(stri1.compareToIgnoreCase(stri2));       //compareToIgnoreCase()

        //int indexJack = jack.indexOf('c');
        System.out.println(jack.indexOf('c'));                     //indexOf()
        System.out.println(jack.lastIndexOf('c'));                 //lastIndexOf()

        String sentence = "Java is a great programming language";
        String[] words = sentence.split(" ");                   // split()
        System.out.println(Arrays.toString(words));                 

        String part1 = "George".substring(2,5);    //substring()
        System.out.println(part1);
        String str = "Hello";
        System.out.println(findnHalfString(str));

    }

    public static String findnHalfString(String str){
        return str.substring(0,str.length()/2);
        
    }
}
