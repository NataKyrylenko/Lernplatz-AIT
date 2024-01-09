package Lectione.Lection33;

public class Company {

    private Employee[] employees;
    private int companySize;
    
    public Company(int capacity){
        employees = new Employee[capacity]; 
    }

    public boolean addEmployee(Employee employee){
        if(companySize < employees.length){
            employees[companySize] = employee;
            companySize++;
            return true;
        }
        return false;
    }

    public boolean removeEmployee(Employee employee){
        for(int i = 0; i < companySize; i++){
            if(employees[i].equals(employee)){
                employees[i] = employees[companySize -1];
                companySize--;
                return true;
            }
        }
        return false;
    }

    // public void display(){
    //     for(int i = 0; i < companySize; i++){
    //         System.out.println(employees[i]);
    //     }
    // }

        public void display(){
            for(Employee employee : employees){
                System.out.println(employee.toString());
                }
    }

    public double sumSalary(){
        double sum= 0;
        for(int i= 0; i < companySize; i++){
            sum = sum+employees[i].calculateSalary();
        }
        return sum;
    }
    
}
