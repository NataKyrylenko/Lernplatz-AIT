package Lectione.Lection33;

class SalesManager extends Employee{
    private double salesVolume;
    private double commission;


    public SalesManager(int id, String name, String secondName, double hour, double salesVolume, double commission){
        super(id, name, secondName, hour);
        this.salesVolume = salesVolume;
        this.commission = commission;
    }

    public double getSalesVolume() {
        return salesVolume;
    }

    public double getCommission() {
        return commission;
    }

    public double calculateSalary(){
        double salary = salesVolume*commission;
        if(salary < getHour()* Constants.MIN_WAGE){
            salary = getHour() * Constants.MIN_WAGE;
        }
        return salary;
    }

    @Override
    public String toString() {
        return "SalesManager{" +
                super.toString()+
                " salesVolume=" + salesVolume +
                 " commission=" + commission + "}";
    }

    
    
}
