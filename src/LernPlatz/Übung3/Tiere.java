package LernPlatz.Übung3;

public class Tiere{

    public void tierKannLaufen(){
        System.out.println("Tiere können laufen");
    }  
}

class Hund extends Tiere{
    public void tierKannLaufen(){
        System.out.println("Hunde können laufen");
    }
}

class Katze extends Tiere{
    public void tierKannLaufen(){
        System.out.println("Katze können laufen");
    }
}

class Kaenguru extends Tiere{
    public void tierKannLaufen(){
        System.out.println("Kaenguru können springen");
    }
}


