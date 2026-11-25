package zad3;

public class Main {
    static void main() {
        Company c = new Company("Januszex");
        Company.Department d = c.new Department("Logistyka");

        d.printNames();
    }
}
