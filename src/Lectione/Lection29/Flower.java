package Lectione.Lection29;

public class Flower extends Plant{

    public Flower(String name, int height, int age){
        super(name, height, age);
    }
    void doSpring(){
        System.out.println(name + " has grown in Spring, " + (height +15));
    }

    void doSummer(){
        System.out.println(name + " is not growing in Summer, " + (height +15));
    }

    void doAutumn(){
        System.out.println(name + " is not growing in Autumn, " + (height +15));
    }

    void doWinter(){
        System.out.println(name + " is not growing in Winter, " + height);
    }
    void seasons(){
        doSpring();
        doSummer();
        doAutumn();
        doWinter();
    }
}
