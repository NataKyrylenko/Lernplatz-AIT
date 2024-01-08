package Lectione.Lection33;

public abstract class Employee {

    private int id;
    private String name;
    private String secondName;
    private double hour;

    public Employee(int id, String name, String secondName, double hour){
        this.id = id;
        this.name  = name;
        this.secondName = secondName;
        this.hour = hour;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSecondName(){
        return secondName;
    }
    public double getHour(){
        return hour;
    }
    public double calculateSalary(){
        return 0;
    }

    @Override
    public String toString() {
        return "Employee id=" + id + ", name=" + name + ", secondName=" + secondName + ", hour=" + hour;
    }
    
}
