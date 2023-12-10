package HomeWorks.HomeWork22;

public class Cars {
    private String[] salon;

    public Cars(String[]salon){
        this.salon = salon;
    }

    public void findCar(String carToFind) {
    boolean carFind = false;
    
        for(String car : salon){
            if(car.equalsIgnoreCase(carToFind)){
                carFind = true;
                break;
            }
        }
        if(carFind){
            System.out.println("This car is available");
        }else{
            System.out.println("This car is not available, take it :  ");
            for(String car : salon){
                System.out.println(car + ", ");
            }
        }
    }
    
}
