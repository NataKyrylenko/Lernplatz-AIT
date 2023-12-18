package HomeWorks.HomeWork27;

public class PizzaChoice {

    public Pizza choosePizza(String type){

        switch (type){

            case "1" : return new PizzaSalami("Salami");
            case "2" : return new PizzaMargarita("Margarita");
            case "3" : return  new PizzaHawaii("Hawaii");

            default: return null;

        }
} 
    
    
}
