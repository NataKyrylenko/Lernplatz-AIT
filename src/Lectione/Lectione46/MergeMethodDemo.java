package Lectione.Lectione46;

import java.util.HashMap;
import java.util.Map;

public class MergeMethodDemo {
    public static void main(String[] args) {
        Map<String,Integer> items = new HashMap<>();
        items.put("Desktop" , 1000);
        items.put("TvSet" , 600);
        items.put("mouse" , 60);
        
        System.out.println(items);
        items.merge("Phone", 550, (oldValue,newValue) -> oldValue + newValue);
        System.out.println(items);

        items.merge("Desktop", 700, (oldValue,newValue) -> oldValue + newValue);
        System.out.println(items);

        Map<String,String> cities = new HashMap<>();
        cities.put("Berlin", "Germany");
        cities.put("Paris", "France");
        cities.put("London", "England");
        
        System.out.println("Countries: ");
        System.out.println(cities);

        cities.merge("London", "GreatBritian", (oldValue,newValue) -> oldValue + "/" + newValue);
        cities.merge("Madrid", "Spain", (oldValue,newValue) -> oldValue + "/" + newValue);
        System.out.println(cities);
        cities.forEach((key,value) -> System.out.println("key : " + key + " value:" + value));
       
        Map<String, Integer> items1 = new HashMap<>();
        items1.put("Desktop", 600);
        items1.put("Mouse", 150);
       
        Map<String, Integer> items2 = new HashMap<>();
        items2.put("TVset", 800);
        items2.put("Mouse", 100);

        items2.forEach((key,value) -> items1.merge(key, value, (oldValue,newValue) -> {
            if(oldValue < newValue)
                 return oldValue;
            else
                return newValue;
        }));
        System.out.println("Merge Map");
        items1.forEach((key,value) -> System.out.println("key : " + key + " value:" + value));

     }
}
