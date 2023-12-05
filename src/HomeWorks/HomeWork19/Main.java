package HomeWorks.HomeWork19;

public class Main {
    public static void main (String[] args){
    Temperature temperature1 = new Temperature(0);
    Temperature temperature2 = new Temperature(223);
    Temperature temperature3 = new Temperature(56);


    System.out.println(temperature1.gradus + "F ->  " + temperature1.getCelsius() + "C");
    System.out.println(temperature2.gradus + "F ->  " + temperature2.getCelsius() + "C");
    System.out.println(temperature3.gradus + "F ->  " + temperature3.getCelsius() + "C");
    
     } 
  
}