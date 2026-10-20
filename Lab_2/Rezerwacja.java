public class Rezerwacja {
    Seans seans;
    int nr_siedzenia;

    public Rezerwacja(Seans seans, int nr_siedzenia) {
        this.seans = seans;
        this.nr_siedzenia = nr_siedzenia;
    }

    public void show() {
        seans.show();
        System.out.println("Numer siedzenia: " + nr_siedzenia);
    }
}
