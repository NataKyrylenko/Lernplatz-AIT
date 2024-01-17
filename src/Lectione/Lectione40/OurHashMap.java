package Lectione.Lectione40;

import java.util.ArrayList;
import java.util.List;

public class OurHashMap<E,T> implements OurMape<E,T> {
    
    private static int CAPACITY = 10000;
    List<Node<E,T>>[] source = new ArrayList[CAPACITY];
    
    
    public void put(E key, T value){
        int index = Math.abs(key.hashCode() % CAPACITY);
        //source[]
    }

    private static class Node<E,T> {
        E key;
        T value;
        
        public Node(E key, T value) {
            this.key = key;
            this.value = value;
        }

        
        
    }
}
