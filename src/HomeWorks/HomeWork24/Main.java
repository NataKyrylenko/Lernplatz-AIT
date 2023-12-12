package HomeWorks.HomeWork24;

public class Main {
    public static void main(String[] args) {
        HomePets pets = new HomePets();
        HomePets dog = new Dog();
        HomePets cat = new Cat();
        HomePets parrot = new Parrot();
        HomePets fish = new Fish();


        pets.needsFood();
        dog.needsFood();
        cat.needsFood();
        parrot.needsFood();
        fish.needsFood();

    }
    
}
