package HomeWorks;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
      System.out.println(defineNumber());
      System.out.println(checkSymbol());
      
    }
    //Task1
    static String defineNumber() {
        System.out.println("Enter a Number");
        try (Scanner scanner = new Scanner(System.in)) {
          int number = scanner.nextInt();
          if (number < 0) {
              return "number + is negativ";
          }
          else if(number > 0) {
              return "number +  is positiv";
          }
          else {
              return "Number is null";
          }
        }   
    }

    //Task 2
    static String checkSymbol() {
        try (Scanner scanner = new Scanner(System.in)) {
          System.out.println("Enter a Symbol ");
          char mySymbol = scanner.next().charAt(0);
           boolean x = false;
          switch (mySymbol) {
              case 'a':
              case 'e':
              case 'i':
              case 'o':
              case 'u':
              case 'A':
              case 'E':
              case 'I':
              case 'O':
              case 'U':
                   x = true;
              }      
              if(x){
                return "Symbol is vowel";
              }
              else {
                if ((mySymbol<='z' && mySymbol>='a') || (mySymbol<='Z'&& mySymbol>='A')){
                  return "Sumbol is a consonant";
              }
              else {
                return "Is not a letter";
              }
            }
        }  
  } 
}