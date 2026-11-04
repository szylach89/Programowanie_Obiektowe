package employees;

public class Administrator extends Employee{
    @Override
    public int calculateSalary() {
        return super.calculateSalary() + 1000;
    }
}
