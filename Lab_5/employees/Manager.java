package employees;

public class Manager extends Employee {
    @Override
    public int calculateSalary() {
        return super.calculateSalary() * 2 + 2500;
    }
}
