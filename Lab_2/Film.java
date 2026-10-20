public class Film {
    String tytul;
    int dlugosc_trwania;

    public Film(String tytul, int dlugosc_trwania) {
        this.tytul = tytul;
        this.dlugosc_trwania = dlugosc_trwania;
    }

    public void show() {
        System.out.println("Tytuł: " + tytul);
        System.out.println("Długość trwania: " + dlugosc_trwania);
    }
}
