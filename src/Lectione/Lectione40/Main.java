package Lectione.Lectione40;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> items = new HashMap<>();
        System.out.println(items);


    OurMape<Integer,String> ourMap = new OurHashMap<>();
    ourMap.put(3, "d");
    ourMap.put(2, "b");
    ourMap.put(1, "a");






        //добавить ел
        items.put(700, "TV");
        items.put(1500,"Notebook");
        items.put(200, "Printer");
        items.put(150, "Mouse");
        items.put(80, "Keyboard");
        System.out.println(items);
        
        //замена по ключу
        items.put(1500, "Desktop");
        System.out.println(items);

        //получить ел по ключу get()
        System.out.println(items.get(200));

        //размер
        System.out.println(items.size());

       // удалить
       items.remove(200);
       System.out.println(items);

       //проверка наличия ключа
       System.out.println(items.containsKey(700));
       System.out.println(items.containsKey(800));

       //проверка наличия значения
       System.out.println(items.containsValue("TV"));
       System.out.println(items.containsValue("Printer"));
        
       //получение набора ключей
       System.out.println(items.keySet());

       //получить все значения
       System.out.println(items.values());

       //перебор элементов мапы
       //1 вариант
        for(Integer key : items.keySet()){
           System.out.println(key + ":" + items.get(key));
        }
        //2 вариант с помощью ключ-значение
        System.out.println("Iterating with EntrySet");
        for(Map.Entry<Integer,String> entry : items.entrySet()){
            Integer k = entry.getKey();
            String v = entry.getValue();

            System.out.println(k + ":" + v);
        }

        // TreeMap - сортирует
    Map <String,String> treeMap = new TreeMap<>();
        //treeMap.putAll(items);
        treeMap.put("Snow", "John");
        treeMap.put("Black", "Mike");
        treeMap.put("Apple", "Kate");
        treeMap.put("White", "John");
        System.out.println(treeMap);
        
        // LinkedHashMap - сохраняет порядок
        System.out.println(items);
    Map <String,String> linkedHashMap =  new LinkedHashMap<>();
    linkedHashMap.put("Snow", "John");
    linkedHashMap.put("Black", "Mike");
    linkedHashMap.put("Apple", "Kate");
    linkedHashMap.put("White", "John");
    
    System.out.println(linkedHashMap);

    }
}
