package HomeWorks.HomeWork24;

public class HomePets {
    private String food;
    private double amount;
    private String name;

    public HomePets(String food, double amount, String name){
        this.food = food;
        this.amount = amount;
        this.name = name;
    }

    public void needsFood(){
        System.out.println(name + " needs " + food + " in the " + amount + " kg");
    }
}
class Dog extends HomePets {
    
    public Dog( String food, double amount, String name){
        super(food, amount, name);
        
    }  
}
class Labrador extends Dog{
    private String toys;
    
    public Labrador(String  food, double amount,String name, String toys){
        super(food, amount, name);
        this.toys = toys;
    }
    
    public void playedToys(String toys, String name){
        System.out.println(name + " is playing with a " + toys);
    }
}
class Cat extends HomePets {
    public Cat( String food, double amount, String name){
        super(food, amount, name);
    }
      
}
class Parrot extends HomePets {
    public Parrot( String food, double amount, String name){
        super(food, amount, name);
    }   
}
class Fish extends HomePets {
    public Fish( String food, double amount, String name){
        super(food, amount, name);
    }  
}


