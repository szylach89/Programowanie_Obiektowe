package zad4;

public class Main {
    static void main() {
        Printable[] elements = {
                new Invoice(),
                new Ticket(),
                new Report()
        };

        for (Printable e : elements) {
            e.print();
        }
    }
}
