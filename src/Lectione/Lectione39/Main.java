package Lectione.Lectione39;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(1, "order");
        Order order2 = new Order(1, "order");

        System.out.println(order1 == order2);      //false
        System.out.println(order1.equals(order2)); //false, после переопределения true
    
        
        String str = "Java";
        System.out.println(str.hashCode());
        String str1 = "Hallo";
        System.out.println(str1.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(order1.hashCode());
        System.out.println(order2.hashCode());
    }
    
}
