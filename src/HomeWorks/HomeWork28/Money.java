package HomeWorks.HomeWork28;

 class Money {

    private double summe;
    private String valuta;

    public Money(double summe, String valuta){
        this.summe = summe;
        this.valuta = valuta;
    }
    public String toString(){
        return summe + " " + valuta;
        
    }
    
    
}
