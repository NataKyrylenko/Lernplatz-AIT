package HomeWorks;
import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Enter value 1 ");
                double value1 = scanner.nextInt();
                System.out.println("Enter value 2 ");
                int value2 = scanner.nextInt();
                System.out.println("Enter Math Symbol ");
                char mySymbol = scanner.next().charAt(0);
                
                switch (mySymbol) {
                    case '+': 
                           System.out.println("The addition is: " + (value1 + value2));
                        break;
                    case '-':
                            System.out.println("The result of subtraction is: "+ (value1 - value2));
                    break;

                    case '*':
                            System.out.println( "The result of multiplied is: " + (value1 * value2));
                    break;

                    case '/':
                            System.out.println("The result of divided is: " +(value1 / value2));
                    break;
                    default:
                            System.out.println("Symbol is not defined");
                        break;
                }
        }
    }
}
