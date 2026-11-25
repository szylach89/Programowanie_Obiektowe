package zad3;

public class Company {
    String name;

    public Company(String name) {
        this.name = name;
    }

    class Department {
        String name;

        public Department(String name) {
            this.name = name;
        }

        void printNames() {
            System.out.println(Company.this.name);
            System.out.println(this.name);

            /*
            this odwołuje się do obiektu klasy wewnętrznej
            Company.this odwołuje się jawnie do obiektu klasy zewnętrznej
             */
        }
    }
}
