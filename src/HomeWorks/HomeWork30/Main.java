package HomeWorks.HomeWork30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of Week");
        String dayInput = scanner.nextLine().toUpperCase();
        Week selectedDay = Week.valueOf(dayInput);
        

        if(selectedDay == Week.SATURDAY || selectedDay == Week.SUNDAY){
            System.out.println(selectedDay + " is true");
        } else {
            System.out.println(selectedDay + " is false");
        }




    }
    
}
