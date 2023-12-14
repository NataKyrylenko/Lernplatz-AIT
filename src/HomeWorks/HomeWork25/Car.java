package HomeWorks.HomeWork25;

public class Car {
    
        private String model;
        private String manufacturer;
        private int year;
        private String color;
        private String owner;
        

        public Car(String model,
                 String manufacturer,
                 int year,
                 String color,
                 String owner) {
            
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.owner = owner;
    }
    public String getModel(){
        return model;
    }
    public String getManufactured(){
        return manufacturer;
    }
    public int getYear(){
        return year;
    }
    public String getColor(){
        return color;
    }
    public String getOwnwer(){
        return owner;
    }

    // public String move(){
    //     return ;
    // }

    @Override
    public String toString() {
        return "Car{" +
                "model= " + model +
                ", manufacturer=" + manufacturer +
                ", year=" + year +
                ", color= " + color +
                '}';
    }
    

    public String getManufacturer() {
        return manufacturer;
    }

    public void load(int weight) {
        if (weight > getRemainingCapacity()) {
            System.out.println("This is too heavy for me!  Can't continue");
            printRemainingCapacity();
            return;
        }

        currentWeight += weight;
        System.out.println("Loading " + weight + " kg......");
        System.out.println("Loaded " + weight + " kg.");
        printRemainingCapacity();
    }

    public void unload(int unloadingWeight) {
        if (unloadingWeight > currentWeight) {
            System.out.println("Not enough cargo !");
            printRemainingCargo();
            return;
        }

        if (unloadingWeight < 0) {
            System.out.println("Can't unload negative weight");
            return;
        }

        currentWeight -= unloadingWeight;
        System.out.println("Unloading " + unloadingWeight + " kg....");
        System.out.println("Unloaded " + unloadingWeight + " kg.");
        printRemainingCargo();
    }

    private void printRemainingCargo() {
        System.out.println("Remaining cargo weight is " + currentWeight + " kg");
    }

    public void move() {
        if (currentFuel == 0) {
            System.out.println("Not enough fuel, can't drive");
            return;
        }

        if (currentWeight == 0) {
            System.out.println("Please load the truck before driving!");
            return;
        }

        System.out.println("Trying...");
        System.out.println("Trying...");
        System.out.println("Yeah, driving!");
    }

    public void stop() {
        System.out.println("Stopping...");
        System.out.println("Stopping...");
        System.out.println("Yeah!");
    }

    public void setCurrentFuel(int currentFuel) {
        if (currentFuel > maxFuel) {
            this.currentFuel = maxFuel;
            return;
        }
        this.currentFuel = currentFuel;
    }

    public String getOwner() {
        return "The owner is " + owner;
    }

    private void printRemainingCapacity() {
        System.out.println("Remaining capacity " + getRemainingCapacity() + " kg");
    }

    private int getRemainingCapacity() {
        return maxWeight - currentWeight;
    }


}

