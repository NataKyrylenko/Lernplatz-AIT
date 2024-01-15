package Lectione.Lection37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Конструкторы ArrayList
    ArrayList() -создает пустой лист
    ArrayList( Collection collection) - создается  лист, в который добавляются все элементы коллекции  collection
    ArrayList(int capacity) -  список с начальным размером capacity
     */
    List<String> names = new ArrayList<>();

    //add() - добавить элемент в конец листа
    names.add("Cersei Lannister");
    names.add("Turion Lannister");
    System.out.println(names);
        
    //добавление элемента по индексу
    names.add(1,"John Snow");
    System.out.println(names);

    names.add("Jaime Lannister");
    System.out.println(names);

    names.add("Khal Drogo");
        System.out.println(names);

    // замена элемента set(index, elt)
    names.set(0, "Daineris");
    System.out.println(names);

    // получение элемента по индексу - get()
    System.out.println(names.get(0));
    System.out.println(names.get(1));

    // метод, возвращающий размер листа size()
        System.out.println("names size is " + names.size());
        System.out.println("at the last position " + names.get(names.size() - 1));
    //System.out.println(names.get(5));

    System.out.println("print with for loop");
    for (int i = 0;i< names.size();i++){
        System.out.println(names.get(i));
    }
    System.out.println("print with enhanced for");
    for(String name:names){
        System.out.println(name);
    }

    //  удаление элемента метод remove(Object o) - удаление по названию
    names.remove("Khal Drogo");
    System.out.println(names);
    boolean removeDrogo = names.remove("Khal Drogo");
    System.out.println(names);
    System.out.println(removeDrogo);

    //  удаление элемента метод remove(int index) - удаление по индексу
    String snow = names.remove(1);
    System.out.println("Who is removed? " + snow);
    System.out.println(names);
    names.add(null);
    System.out.println(names);
    System.out.println("Who is removed? "+ names.remove(3));

    // int indexOf(Object o)  - возвращает индекс элемента
    int position = names.indexOf("Daineris");
    System.out.println(position);

    // boolean contains(Object o)- проверяет содержит ли лист данный обьект
    System.out.println("Is Daineris in the list? " + names.contains("Daineris"));
    System.out.println("Is Khal Drogo in the list? " + names.contains("Khal Drogo"));

    // сортировка листов
    Collections.sort(names);
    System.out.println(names);
}
    
}
