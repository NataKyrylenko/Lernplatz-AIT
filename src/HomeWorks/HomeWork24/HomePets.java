package HomeWorks.HomeWork24;

public class HomePets {

    public void needsFood(){
        System.out.println("Pets needs food");
    }
}


class Dog extends HomePets {
    public void needsFood(){
        System.out.println("Dog need Pedigree");
    }
    
}

class Cat extends HomePets {
    public void needsFood(){
        System.out.println("Cat need Whiskas");
    }
    
}

class Parrot extends HomePets {
    public void needsFood(){
        System.out.println("Parrot need grain");
    }
    
}

class Fish extends HomePets {
    public void needsFood(){
        System.out.println("Fish need Vipagran");
    }
    
}

