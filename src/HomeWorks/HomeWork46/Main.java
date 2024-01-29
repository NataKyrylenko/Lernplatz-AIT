package HomeWorks.HomeWork46;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    Address address1 = new Address("Street1",1);
    Address address2 = new Address("Street2",2);
    Address address3 = new Address("Street3",3);
    Address address4 = new Address("Street4",4);

    Person person1 = new Person("Person1",16,address1);
    Person person2 = new Person("Person2",26,address2);
    Person person3 = new Person("Person3",10,address3);
    Person person4 = new Person("Person4",116,address4);

    List<Person> persons = List.of(person1,person2,person3,person4);
    printAdress(persons);
    }

    public static void printAdress(List<Person> personList){
        personList.stream().filter(person -> person.getAge() > 17)
                .map(Person::getAddress)
                .forEach(address -> System.out.println("Adress: " + address.getStreet() + " " + address.getHouseNumber()));
    }
    
}
