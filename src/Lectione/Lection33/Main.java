package Lectione.Lection33;

public class Main {

    public static void main(String[] args) {
        Company company = new Company(3);

        Employee salesManager1 = new SalesManager(1, "Willi", "Wonka", 2, 4, 10);
        Employee wageEmployee1 = new WageEmployee(2, "Olga", "Smidt", 40, 8);
        Employee salesManager2 = new SalesManager(3, "Ali", "Wind", 7, 75,25);
        Employee wageManager3 = new WageEmployee(4, "Bill", "Muller", 4, 50);

        company.addEmployee(wageEmployee1);
        company.addEmployee(salesManager1);
        company.addEmployee(salesManager2);
        company.removeEmployee(salesManager1);
        company.addEmployee(wageManager3);

        System.out.println("Employees in the company: ");
        company.display();

        System.out.println("Total salary for all employees: " + company.sumSalary());
        
    }
    
}
