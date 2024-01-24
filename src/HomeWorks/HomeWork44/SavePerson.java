package HomeWorks.HomeWork44;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SavePerson {

    public static void savePerson(String fileName, List<Person> persons){

        try (BufferedWriter personWriter = new BufferedWriter(new FileWriter(fileName))){
            for(Person person : persons){
                personWriter.write(person.name + ", " + person.age);
                personWriter.newLine();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        List<Person> personList = List.of(
            new Person("John", 25),
            new Person("Anna", 16),
            new Person("Bill", 34),
            new Person("Will", 56)
        );
        savePerson("personList.txt", personList);
    }
}
