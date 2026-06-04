package Oop2;

import java.util.Scanner;

public class EmployeeDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.setName(scanner.nextLine());
        System.out.print("Gross salary: ");
        employee.setGrossSalary(scanner.nextDouble());
        System.out.print("Tax: ");
        employee.setTax(scanner.nextDouble());

        System.out.printf("Employee: %s, $ %.2f%n", employee.getName(), employee.netSalary());

        System.out.print("Wich percentage to increase salary: ");
        employee.increaseSalary(scanner.nextDouble());

        System.out.println("Updated data: "+ employee.getName() +", $" + employee.netSalary());





        scanner.close();
    }
}
