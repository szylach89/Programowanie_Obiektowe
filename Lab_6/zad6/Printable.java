package zad6;

public interface Printable {
    void print();

    default void printHeader() {
        System.out.println("=========DRUKOWANIE=========");
    }
}
