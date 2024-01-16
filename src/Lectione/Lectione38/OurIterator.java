package Lectione.Lectione38;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OurIterator {

    public static void main(String[] args) {
        OurIterator ourIterator = new OurIterator();
        List<Integer> ints = new ArrayList<>();
        ints.add(2);
        ints.add(13);
        ints.add(15);
        ints.add(5);
        ints.add(22);
        System.out.println(ourIterator.returnElmMoreN(ints, 15));
        
    }

    public List <Integer> returnElmMoreN(List<Integer> input, int n){
    Iterator<Integer> iterator = input.iterator();
        while (iterator.hasNext()) {
          if(iterator.next()>=n){
            iterator.remove();
          }
        }
        return input;
    }
}
