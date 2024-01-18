package Lectione.Lectione41;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;


public class Main {

    //Set - колекция в которой не могут содержаться дубликаты

    public static void main(String[] args) {
        Set <String> hashSet = new HashSet<>();

        //HashSet(Collection) - создается сет  в который копируются элементы колекции

        //добавление элементов add()
        System.out.println(hashSet.add("aaa")); //true
        System.out.println(hashSet.add("aaa")); // false
        hashSet.add("ccc");
        hashSet.add("bbb");
        hashSet.add("ddd");
        System.out.println(hashSet);

        for(String s : hashSet){
            System.out.println(s);
        }

        //удалить элемента
        hashSet.remove("ccc");
        System.out.println(hashSet);

        System.out.println(hashSet.size());

        System.out.println(hashSet.contains("aaa"));

        System.out.println(hashSet.isEmpty());

        Iterator <String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        hashSet.clear();
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet);

        Set<String> nameSet = new HashSet<>();
        nameSet.add("John");
        nameSet.add("Jack");
        nameSet.add("Bill");
        nameSet.add("Ann");
        System.out.println(nameSet);

        //LinkedHashSet
        System.out.println("LinkedHashSet");
        Set<String>nameSet1 = new LinkedHashSet<>();
        nameSet1.add("John");
        nameSet1.add("Jack");
        nameSet1.add("Bill");
        nameSet1.add("Ann");
        System.out.println(nameSet1);

        //TreeSet
        System.out.println("TreeSet");
        Set<String>treeSet = new TreeSet<>(nameSet);
        System.out.println(treeSet);

    }
    
}
