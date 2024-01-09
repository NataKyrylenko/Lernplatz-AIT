package Lectione.Lection33;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Employee salesManager1 = new SalesManager(7,"John","Smith",80,100000,0.05);
        Employee salesManager2 = new SalesManager(1,"Ann","Black",30,100000,0.5);
        Employee salesManager3 = new SalesManager(4,"Mary","Kraft",65,100000,0.3);
        
        Employee wageEmployee1 = new WageEmployee(2, "John", "Snow", 50, 20.5);
        Employee wageEmployee2 = new WageEmployee(45, "Ann", "Smith", 30, 6.0);
        Employee wageEmployee3 = new WageEmployee(21, "Garry", "Potter", 80, 12.9);

        Company company = new Company(6);
        company.addEmployee(salesManager1);
        company.addEmployee(salesManager2);
        company.addEmployee(salesManager3);
        company.addEmployee(wageEmployee1);
        company.addEmployee(wageEmployee2);
        company.addEmployee(wageEmployee3);

        // System.out.println("List of employees");
        // company.display();

        // System.out.println("-----remove sales manager 1");
        // System.out.println(company.removeEmployee(salesManager1));
        // company.display();

        // System.out.println("Everybody's salary = " + company.sumSalary());



        System.out.println("After sort: ");
        Employee[] employees = {salesManager1,salesManager2,salesManager3,wageEmployee1,wageEmployee2,wageEmployee3};
        Arrays.sort(employees);
        for(Employee emp: employees){
            System.out.println(emp);
        }
    }
    
}
