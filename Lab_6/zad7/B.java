package zad7;

public interface B {
    default void hello() {
        System.out.println("B");
    }
}
