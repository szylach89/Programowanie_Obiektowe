package zad12;

public class Account {
    protected String name;

    public Account(String name) {
        this.name = name;
    }

    public void postMessage(String message) {
        System.out.println(message);
    }
}
