package HomeWorks.HomeWork22;

public class Main {
    public static void main(String[] args) {
        String [] salon = {"Audi","BMW","Ford","Honda","Hyundai","Kia","Mazda"};
        
        Cars car = new Cars(salon);
        car.findCar("bmw");
        car.findCar("Mercedes");
        car.findCar("Kia");
        car.findCar("smart");

        
    }
    
    
}