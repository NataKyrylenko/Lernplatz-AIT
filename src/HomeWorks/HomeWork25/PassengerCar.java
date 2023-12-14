package HomeWorks.HomeWork25;

class PassengerCar extends Car {
    int numberOfSeats;
        public PassengerCar(String model,
                     String manufacturer,
                     int year,
                     String color, String owner, int numberOfSeats)
        {
        super(model, manufacturer, year, color, owner);
        this.numberOfSeats = numberOfSeats;
    
            }
        //     public void move(){
        //         System.out.println(" passenger car is driing");
        //     }
            public void stop(){
                System.out.println(" passeger car is stopping");
            }

            @Override
        public String toString() {
        return "PassengerCar{" +
                "model= " + getModel() +
                ", manufacturer=" + getManufactured() +
                ", year=" + getYear()+
                ", color= " + getColor() +
                '}';
    }
        
    }

