package zad4;

import employees.*;

public class Main {
    static void main() {
        Employee[] employees = {
                new Developer(),
                new Manager(),
                new Tester(),
                new Administrator()
        };

        for (Employee e : employees) {
            System.out.println(e.calculateSalary());
        }
    }
}
