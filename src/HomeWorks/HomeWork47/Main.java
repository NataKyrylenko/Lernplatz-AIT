package HomeWorks.HomeWork47;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("John", 34),
                new Person("Ann", 21),
                new Person("Bill", 16),
                new Person("Jack", 60),
                new Person("Bob", 51),
                new Person("Kate", 17),
                new Person("Alina", 22),
                new Person("Sven", 55)

        );
        groupAge(persons).forEach((key,value) -> System.out.println(key + " -> " + value.stream().map(Person::getName).collect(Collectors.toList())));

        System.out.println("Total age above 18 is: " + summeAge(persons));
        System.out.println(returnName(persons));

        //Task3
        System.out.println(countWords("aaaaaa cccc aab bbbb a ff aaa" , "a"));
        System.out.println(countWords("aaaaaa cccc aab bbbb a ff aaa" , "aaa"));
        System.out.println(countWords("aaaaaa cccc aab bbbb a ff aaa" , "aa"));
    }


    public static Map<Integer, List<Person>> groupAge(List<Person> persons){
        return persons.stream().collect(Collectors.groupingBy(Person::getAge));
    }

    public static int summeAge(List<Person> persons){
        return persons.stream()
                .filter(person -> person.getAge() > 18)
                .mapToInt(Person::getAge).sum();
    }

    public static String returnName(List<Person> persons){
        return persons.stream()
                .filter(person -> person.getAge() > 18) 
                .map(Person::getName)
                .collect(Collectors.joining(" and " , "At the moment ", " are of legal age "));
    }

    //Task3
    public static long countWords(String sentence, String pattern){
        return Stream.of(sentence.split(" "))
                    .filter(w -> w.startsWith(pattern))
                    .count();
    }
}
