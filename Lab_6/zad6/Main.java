package zad6;

public class Main {
    static void main() {
        Printable[] docs = {new Report(), new Invoice()};

        for (Printable d : docs) {
            d.printHeader();
        }
    }
}
