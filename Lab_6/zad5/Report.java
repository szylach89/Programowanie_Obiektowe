package zad5;

public class Report implements Printable, Exportable, Savable{
    @Override
    public void print() {
        System.out.println("Drukowanie Raportu");
    }

    @Override
    public void export() {
        System.out.println("Export Raportu");
    }

    @Override
    public void save() {
        System.out.println("Zapis Raportu");
    }
}
