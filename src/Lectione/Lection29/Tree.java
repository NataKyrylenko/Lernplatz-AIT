package Lectione.Lection29;

public class Tree extends Plant{

    public Tree(String name, int height, int age){
        super(name, height, age);
    }
    void doSpring(){
        System.out.println(name + " has grown in Spring, " + (height +4));
    }

    void doSummer(){
        System.out.println(name + " has grown in Summer, " + (height +4));
    }

    void doAutumn(){
        System.out.println(name + " is not growing in Autumn, " + (height +4));
    }

    void doWinter(){
        System.out.println(name + " is not growing in Winter, " + (height +4));
    }
    void seasons(){
        doSpring();
        doSummer();
        doAutumn();
        doWinter();;
    }
    
}
