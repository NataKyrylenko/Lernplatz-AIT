package HomeWorks.HomeWork19;

public class Temperature {

     double gradus;

    public Temperature(int gradus){
        this.gradus = gradus;
        
       
     }
     double getCelsius(){
        return Math.round(5*(gradus - 32)/9);
     }
}