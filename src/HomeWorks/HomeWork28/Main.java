package HomeWorks.HomeWork28;

public class Main {
    public static void main(String[] args) {
        
        Money money1 = new Money(100, "USD");
        Money money2 = new Money(600, "EUR");

        Wallet wallet = new Wallet("Visa", money1, money2);
        
        System.out.println(wallet);
        
       

        
    }
}
