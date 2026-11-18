package zad6;

public class Invoice implements Printable {

    @Override
    public void print() {
        System.out.println("Drukowanie Faktury");
    }

    @Override
    public void printHeader() {
        System.out.println("------Drukowanie faktury------");
    }
}
