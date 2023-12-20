package HomeWorks.HomeWork28;

class Wallet {
 
    private String kreditKart;
    Money summe;
    Money valuta;
        
    public Wallet(String kreditKart ,Money summe, Money valuta){
        this.kreditKart = kreditKart;
        this.summe = summe;
        this.valuta = valuta;
    }
    public String toString() {
        return "Wallet{" +
                "kreditKart='" + kreditKart + '\'' +
                ", summe='" + summe + '\'' +
                ", valuta=" + valuta +
                '}';
    }
    
}
