package zad6;

public class Manager extends Employee{
    String dzial;

    public Manager(String imie, String nazwisko, int id, String dzial) {
        super(imie, nazwisko, id);
        this.dzial = dzial;
    }

    @Override
    void showInformation() {
        super.showInformation();
        System.out.println("Dział: " + dzial);
    }
}
