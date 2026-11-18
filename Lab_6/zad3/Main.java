package zad3;

import employees.*;

public class Main {
    static void main() {
        Employee[] emps = {
                new Manager("Jan Kowalski", 7500),
                new Developer("Tomasz Nowak", 3500),
                new Salesperson("Włodzimież Biały", 4500)
        };

        for (Employee emp : emps) {
            emp.printPayslip();
        }
    }
}
