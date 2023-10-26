package application;

import entities.Employee;
import java.util.Scanner;

public class CalculateSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String employeeName1;
        double grossSalary1;
        double tax1;

        System.out.print("Enter the employee's name: ");
        employeeName1 = sc.nextLine();
        System.out.print("Enter the gross salary of employee: ");
        grossSalary1 = sc.nextDouble();
        System.out.print("Enter the tax for employee: $");
        tax1 = sc.nextDouble();
        sc.nextLine();
        Employee emp1 = new Employee(employeeName1, grossSalary1, tax1);

        System.out.println(emp1);
        System.out.print("Enter the percentage to increase salary: ");
        emp1.increaseSalary(sc.nextDouble());
        System.out.println("\nUpdate data:" + emp1);
    }
}