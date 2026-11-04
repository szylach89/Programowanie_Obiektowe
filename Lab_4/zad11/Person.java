package zad11;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    // Dodaje getter by móc uzyskać dostęp do zmiennej w podklasach
    public String getName() {
        return name;
    }

    public void showInformation() {
        System.out.println(
                "Person: " + this.name
        );
    }
}