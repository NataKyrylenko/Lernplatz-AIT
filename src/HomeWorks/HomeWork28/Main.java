package HomeWorks.HomeWork28;

public class Main {
    public static void main(String[] args) {
        
        Money money1 = new Money(0, "USD");
        Money money2 = new Money(600, "EUR");
        Money money3 = new Money(20, "GBP");
        
        Money[] moneys = {money1,money2,money3};

        for(Money mon : moneys){
            System.out.println(mon.toString());
        }
       

        
    }
}
