package employees;

public class Manager extends Employee{
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return 2 * baseSalary + 1500;
    }
}
