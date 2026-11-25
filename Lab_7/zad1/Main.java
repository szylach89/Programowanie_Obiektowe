package zad1;

public class Main {
    static void main() {
        Computer.Specification specs = new Computer.Specification(
                32,
                1024,
                "Ryzen 5 1600 AF+");

        specs.print();
    }
}
