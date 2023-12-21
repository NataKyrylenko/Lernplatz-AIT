package HomeWorks.HomeWork30;

//import java.time.DayOfWeek;
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
         scanner.close();
    }
}


/* 
public class DayOfWeekResolveer{

    private static Scanner scanner = new Scanner(System.in);
    
    public void start(){
        do{
            DayOfWeek dayOfWeek = readDayOfWeek();
            System.out.println("It is " + isDayOff(dayOfWeek));
            System.out.println("Do you want chek another day? Enter yes or any letter if no");
     }
     while(scanner.nextLine().equalsIgnoreCase("yes"));
        System.out.println("Thank you for using our service");
        scanner.close();

    }
    private DayOfWeek readDayOfWeek(){
        System.out.println("Enter day of the week");
        String day = scanner.nextLine().toUpperCase();
        while(!day.equals("MONDAY")||
             day.equals("TUESDAU") ||
             day.equals("WEDNESDAY") ||
             day.equals("THURSDAY") ||
             day.equals("FRIDAY") ||
             day.equals("SATURDAY") ||
             day.equals("SUNDAY") ||){
                System.out.println("You hawe ented a wrong day. Please enter a correct day");
                day =  scanner.nextLine().toUpperCase();
            }

        return DayOfWeek.valueOf(day);
    } 
    private boolean isDayOff(DayOfWeek day){
        switch (day) {
            case SATURDAY:
            case SUNDAY: return true;
                break;
            default: return false;
                
        }
    }
    public static void main(String[] args) {
        DayOfWeekResolveer resolveer = new DayOfWeekResolveer();
        resolveer.start();
    }
}*/
