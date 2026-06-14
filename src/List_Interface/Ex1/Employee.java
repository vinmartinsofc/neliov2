package List_Interface.Ex1;

public class Employee {
    private final int id;
    private final String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void applyDiscountOf(int employeeId, double percentage) {
        double calc = salary * (percentage / 100);
        salary += calc;
    }

    @Override
    public String toString() {
        return String.format("%n" +
                "%s%n" +
                "Name: %s%n" +
                "Salary: %.2f%n" +
                "#ID: %d%n", "==== EMPLOYEE ====", name, salary, id);
    }
}
