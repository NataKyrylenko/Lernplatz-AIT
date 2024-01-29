package HomeWorks.HomeWork47;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("John", 24),
                new Person("Ann", 21),
                new Person("Bill", 16),
                new Person("Jack", 20),
                new Person("Bob", 31),
                new Person("Kate", 17),
                new Person("Alina", 22)
        );

        Map<Integer, List<Person>> groupedAge = groupAge(persons);
        groupedAge.forEach((age, person) -> 
                    System.out.println("Age " + age + ": " + person));
        System.out.println("Total age above 18: " + summeAge(persons));
        System.out.println(returnName(persons));
    }


    public static Map<Integer, List<Person>> groupAge(List<Person> persons){
        return persons.stream().collect(Collectors.groupingBy(Person::getAge));
    }

    public static int summeAge(List<Person> persons){
        return persons.stream()
                .filter(person -> person.getAge() > 18)
                .mapToInt(Person::getAge)
                .sum();
    }

    public static String returnName(List<Person> persons){
        return persons.stream()
                .filter(person -> person.getAge() > 18) 
                .map(Person::getName)
                .collect(Collectors.joining(" and " , "At the moment ", " are of legal age "));
    }
}
