package HomeWorks.HomeWork41;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CounterName {
    public int findNumberOccurence(List<String> strings,String name){
        Map<String,Integer>nameToNumber = new HashMap<>();
        for(String s : strings){
            if(nameToNumber.containsKey(s)){
                nameToNumber.put(s, nameToNumber.get(s) + 1);
            }else{
                nameToNumber.put(s, 1);
            }
        }
        return nameToNumber.containsKey(name) ? nameToNumber.get(name) : 0;
    }
























    // public static void main(String[] args) {
       
    //     List<String> names = List.of("David", "Eleni", "Anna",
    //                                 "Tom", "Bill", "Eleni", "Stiv","Tom",
    //                                 "Jack", "Tom","Alisia", "Sven", "Tom",
    //                                 "Richard", "Garry", "Ilon", "Tom");
    //     Map<String> namesMap = new HashMap<>(names);
    //     String checkName = "Tom";

        
    //     System.out.println("The name " + checkName + " is " + namesMap.countName(names, checkName) + " in the list");
    
    //  }

    // public static int countName(List<String> nameList, String checkName){
    //     int counter = 0;
    //     for(String name : nameList){
    //         if(name.equals(checkName)){
    //             counter++;
    //         }
    //     }
    //     return counter;
    // }
    //     public static Map<String, Integer> countOccurrences(List<String> nameList) {
    //     Map<String, Integer> occurrencesMap = new HashMap<>();

    //     for (String name : nameList) {
    //         occurrencesMap.put(name, occurrencesMap.getOrDefault(name, 0) + 1);
    //     }

    //     return occurrencesMap;
    // }

    
    
}
