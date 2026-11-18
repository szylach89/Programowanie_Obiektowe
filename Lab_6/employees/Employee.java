package employees;

public abstract class Employee {
    String name;
    double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void printPayslip() {
        System.out.println("------------------");
        System.out.printf("Wynagrodzenie dla %s: %f%n", name, calculateSalary());
        System.out.println("------------------");

    }
}
