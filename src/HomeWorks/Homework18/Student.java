package HomeWorks.Homework18;

public class Student {
    public String name;
    public int age;
    public String gruppe;
    


    public Student(String studensName, int studentsAge, String studensGruppe){
        name = studensName;
        age = studentsAge;
        gruppe = studensGruppe;
        System.out.println("Student name is: "+ name + ". Age is: "+ age + ". Gruppe is: " + gruppe +".");
        
    }

}