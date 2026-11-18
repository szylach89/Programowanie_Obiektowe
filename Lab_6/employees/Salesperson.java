package employees;

public class Salesperson extends Employee{
    public Salesperson(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return 0.5 * baseSalary + 2500;
    }
}
