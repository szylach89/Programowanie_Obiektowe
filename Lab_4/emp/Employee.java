package emp;

import per.Person;

public class Employee extends Person {
    String position;

    public Employee(String firstName, String lastName, String position) {
        super(firstName, lastName);
        this.position = position;
    }

    public void displayData() {
        // System.out.println(firstName); <- BŁĄÐ podklasa nie ma dostępu do pola private w nadklasie
        System.out.println(lastName);
        System.out.println(position);
    }
}
