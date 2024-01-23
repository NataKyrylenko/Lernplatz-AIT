package Lectione.Lectione44;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {
        int height = 100;

        // анонимный класс
        Flyable flyable = new Flyable() {
            public void fly(){
                System.out.println("Flying at " + height);
            }
        };
        flyable.fly();

        // lambda-expressions
        Flyable flambda = () -> {
            System.out.println("Flying with lambda at " + height);
        };
        flambda.fly();

        Flyable flambda1 = () -> {
            System.out.println("Flying with lambda1 at " + height);
        };
        flambda1.fly();

        Wolkable walk = () -> {
            return "I can walk";
        };
        System.out.println(walk.wolkable());

        Eatable eatable = (food) -> {
            return "A man eats " + food;
        };
       System.out.println(eatable.eat("orange"));

        Arithmetical arithmetical = (i,j) -> {
            return i + j;
        };
        System.out.println(arithmetical.calculate(4, 6));

        // короткая запись lambda

        Arithmetical arithmetical1 = (i,j) -> i + j;
        System.out.println(arithmetical1.calculate(2,3 ));
        Arithmetical minus = (i,j) -> i - j;
        System.out.println(minus.calculate(2,3 ));

        Eatable eatableShort = food -> "A man eats " + food;
        System.out.println(eatableShort.eat("banane"));


        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Ann");
        names.add("Jack");
        names.add("Bill");

        names.forEach(name -> System.out.println(name));

        List<Product> items = new ArrayList<>();
        items.add(new Product("keybord", 2500));
        items.add(new Product("tvset", 500));
        items.add(new Product("laptop", 300));
       
        //сортировать по имени и цене
        Collections.sort(items, (product1,product2) -> product1.name.compareTo(product2.name));
        System.out.println(items);

        Collections.sort(items, (product1,product2) -> product1.price - product2.price);
        System.out.println(items);
        
    }    
}
