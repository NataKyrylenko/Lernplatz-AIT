package HomeWorks.HomeWork24;

public class Main {
    public static void main(String[] args) {
        HomePets pets = new HomePets("food", 2.3, "Pets");
        HomePets dog = new Dog("Pedegree", 1.1, "Dog");
        Labrador labrador = new Labrador("Pedegree", 1.1, "Labrador", "ball");
        


        pets.needsFood();
        dog.needsFood();
        labrador.needsFood();
        labrador.needsToys("ball","Labrador");

    }
    
}
