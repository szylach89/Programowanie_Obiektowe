package zad6;

public class Employee {
    String imie;
    String nazwisko;
    int id;

    public Employee(String imie, String nazwisko, int id) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = id;
    }

    void showInformation() {
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("ID: " + id);
    }
}
