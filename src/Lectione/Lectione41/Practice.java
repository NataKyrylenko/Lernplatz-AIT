package Lectione.Lectione41;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {
   
    public static void main(String[] args) {
        Practice practice = new Practice();
        List<String> list = List.of("John", "Mary", "Peter", "John", "Ann", "Mary");
        
        System.out.println(practice.removeDuplicates(list));
    
    //Set<String> nameSet = new HashSet<>(names);
    //System.out.println(nameSet);
     }

     public List<String> removeDuplicates(List<String> input){
        Set<String> set = new HashSet<>(input);
        return new ArrayList<>(set);

     }


}
