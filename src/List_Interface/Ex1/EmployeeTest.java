package List_Interface.Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many employees will be added? ");
        int n = Integer.parseInt(scanner.nextLine());
        List<Employee> employees = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {

            System.out.print("Enter the name: ");
            String name = scanner.nextLine();

            System.out.print("Enter the salary: ");
            double salary = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter the id: ");
            int id = Integer.parseInt(scanner.nextLine());

            employees.add(new Employee(id, name, salary));

        }

        for (Employee employeesList : employees) {
            System.out.println(employeesList);
        }


        System.out.print("Enter the employee ID that will have salary increase: ");
        int employeeId = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the percentage: ");
        double percentage = Double.parseDouble(scanner.nextLine());

        Employee selectedEmployee = employees.stream().filter(e -> e.getId() == employeeId).findFirst().orElse(null);

        if (selectedEmployee != null) {
            selectedEmployee.applyDiscountOf(employeeId, percentage);
        } else {
            System.out.println("This user id does not exist");
            return;
        }

        for (Employee employeeList : employees) {
            System.out.println(employeeList);
        }




        scanner.close();
    }
}
