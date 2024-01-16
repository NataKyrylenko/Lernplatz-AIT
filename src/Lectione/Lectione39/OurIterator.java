package Lectione.Lectione39;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class OurIterator {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Berlin");
        cities.add("Paris");
        cities.add("Rome");
        cities.add("Madrid");

        ListIterator<String> listiterator = cities.listIterator();
        System.out.println("cities before change");
        while (listiterator.hasNext()) {
            System.out.println(listiterator.next());
        }
        listiterator.set("London");
        System.out.println("Cities after, reversed");

        while (listiterator.hasPrevious()) {
            System.out.println(listiterator.previous());
        }
    }
    
}
