package zad11;

public class Main {
    static void main() {
        Car c = new Car();

        c.start();

        /*
        Dziedziczenie byłoby błędem ponieważ tu nie ma relacji IS-A
        Car HAS-A Engine, nie Car IS-A Engine
         */
    }
}
