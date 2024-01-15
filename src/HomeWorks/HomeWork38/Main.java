package HomeWorks.HomeWork38;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Integer> list1 = List.of(1,2,3,4);
        List <Integer> list2 = List.of(5,2,3,6);
        System.out.println(compareList(list1, list2)); 

    }
    public static List<String> compareList(List<Integer> list1, List<Integer> list2){
        List <String> resultList = new ArrayList<>();
            for(int i = 0; i<list1.size();i++){
                if(list1.get(i).equals(list2.get(i))){
                    resultList.add("Yes");
                }else{
                    resultList.add("No");
                } 
        }
        return resultList;
    }
    
    
}
