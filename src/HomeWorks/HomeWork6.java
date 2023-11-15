package HomeWorks;

public class HomeWork6 {
    public static void main(String[] args) {
       // Task1
        int a = 4, b = 3;
        if (a!=b) {
            System.out.println(a+b);
         }
        else if(a==b) {
            System.out.println((a+b)*2);
        }

        // Task2 
        int c = 1, d = 6, e = 6;

         if (c == d && d == e) {
            System.out.println("All numbers are equal");
         }
         else if (c!=d && d!=e && c!=e ) {
            System.out.println("All numbers are different");
         }
         else {
            System.out.println("Some numbers are equal");
         }

    }
}
