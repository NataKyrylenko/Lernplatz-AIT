package Lectione.Lection33;

class WageEmployee extends Employee{
    
    private double wage;

    public WageEmployee(int id, String name, String secondName, double hour, double wage){
        super(id, name, secondName, hour);
        this.wage = wage;
    }

    public double getWage(){
        return wage;
    }


    public double calculateSalary(){
        double salary = getHour() * wage;
        if(salary<= getHour()*Constants.MIN_WAGE){
            salary = getHour()*Constants.MIN_WAGE;
        }
        return salary;
    }
    @Override
    public String toString(){
        return "WageEmployee {" +
         super.toString()+
                "wage = " + wage +
                '}';

        
    }
    
}
