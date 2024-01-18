package HomeWorks.HomeWork41;

import java.util.List;

public class CounterName {

    public static void main(String[] args) {
        CounterName counterName = new CounterName();
        List<String> names = List.of("David", "Eleni", "Anna",
                                    "Tom", "Bill", "Eleni", "Stiv","Tom",
                                    "Jack", "Tom","Alisia", "Sven", "Tom",
                                    "Richard", "Garry", "Ilon", "Tom");
        String checkName = "Tom";
        System.out.println("The name " + checkName + " is " + counterName.countName(names, checkName) + " in the list");
    
     }

    public static int countName(List<String> nameList, String checkName){
        int counter = 0;
        for(String name : nameList){
            if(name.equals(checkName)){
                counter++;
            }
        }
        return counter;
    }

    
}
