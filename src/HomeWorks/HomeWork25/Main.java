package HomeWorks.HomeWork25;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Truck truck = new Truck();
        // System.out.println(truck.i);
        // System.out.println(truck.b);
        // System.out.println(truck.s);

        Trucks truck = new Trucks("SuperTruck",
                "Volvo",
                2020,
                "red",
                5000,
                500,
                "John Black");
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

        Trucks truck1 = new Trucks("SuperTruck1",
                "MAN",
                2018,
                "black-yellow",
                10000,
                400,
                "Jack White");

        Truck passengeTruck = new Truck("BMW", "Porshe", 2023, "black", 1000, 340, "Bill");

        passengeTruck.load(1100);
        passengeTruck.move();
        passengeTruck.setCurrentFuel(250);
        passengeTruck.unload(500);


        int[] x = {1, 2};
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        Trucks[] trucks = {truck, truck1, passengeTruck};
        
        for (int i = 0; i < trucks.length; i++) {
            System.out.println(trucks[i]);
        }
        System.out.println(Arrays.toString(trucks));
        System.out.println();

        for (Trucks tr : trucks) {
            System.out.println("truck " + tr.getManufacturer() + " : " + tr.getOwner());
        }
    }     
    
}
