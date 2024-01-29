package HomeWorks.HomeWork46;

import java.util.List;

public class PrintNames {

    public static void printEigeneNames(List<String> names) {
        names.stream().distinct().forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<String> namesList = List.of("John", "Bob", "Ann", "Jack", "Bob", "John");
        printEigeneNames(namesList);
    }
    
}
