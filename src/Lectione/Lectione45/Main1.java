package Lectione.Lectione45;

public class Main1 {

    public static void main(String[] args) {
        int[] ints = {-6, -2, 1, 4, 2, 6, -5};
        //System.out.println(findSumCondition(ints, ExampleClass::isPositive));
        //System.out.println(findSumCondition(ints, ExampleClass::isEven));

        ExampleClass2 exampleClass2 = new ExampleClass2();
        //System.out.println(findSumCondition(ints, exampleClass2::isPositive));

        //ссылки на конструктор
        PersonCreator personCreator = Person::new;
        Person person = personCreator.create("John");
        System.out.println(person.getName());



    }

    public static int findSumCondition(int[] ints, ExampleInterface example){
        int sum = 0;
        for(int i : ints){
            if(example.isEqual(i)){
                sum += i;
            }
        }
        return sum;
    }
    
}
