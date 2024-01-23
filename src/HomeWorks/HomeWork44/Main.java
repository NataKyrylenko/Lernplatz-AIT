package HomeWorks.HomeWork44;

public class Main {
    public static void main(String[] args) {

        // Task1
        Printable printableLambda = s -> System.out.println("!" + s + "!");
        printableLambda.print("string");

        Producable producableLambda = () -> {
            return "Hallo World";
        };
       System.out.println(producableLambda.produce());

    }
}