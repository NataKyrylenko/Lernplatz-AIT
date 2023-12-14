package HomeWorks.HomeWork25;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Truck truck = new Truck();
        // System.out.println(truck.i);
        // System.out.println(truck.b);
        // System.out.println(truck.s);

        Truck truck = new Truck("SuperTruck", "Volvo", 2020, "yellow", "Bill");
        System.out.println(truck);

        truck.load(1500);
        truck.load(10000);
        truck.load(3500);

        truck.move();
        truck.setCurrentFuel(600);
        truck.move();

        truck.stop();

        truck.unload(10000);
        truck.unload(2000);
        truck.unload(-1000);
        truck.unload(3000);

        
       Car passengerCar = new PassengerCar("BMW", "BMW", 2023, "red", "Smith", 5);
        
        Truck truck1 = new Truck("Volvo", "MAN", 2021, "black", "Duck");
        
        int[] x = {1, 2};
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        Car[] cars = {truck, truck1, passengerCar};
        
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println(Arrays.toString(cars));
        System.out.println();

        for (Car tr : cars) {
            System.out.println("truck " + tr.getManufacturer() + " : " + tr.getOwner());
        }
    }     
    
}
