package zad11;

public class Student extends Person {

    private int albumNumber;

    public Student(String name, int albumNumber) { // Dodaje zmienne i wywołuje super(...)
        super(name);
        this.albumNumber = albumNumber;
    }

    // Dodanie @Override, zmiana showInformations na showInformation, użycie gettera do name (jest private w nadklasie)
    @Override
    public void showInformation() {
        System.out.println(
                getName() + ", " + albumNumber
        );
    }
}