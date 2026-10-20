public class Seans {
    Film film;
    SalaKinowa sala;
    String data;

    public Seans(Film film, SalaKinowa sala, String data) {
        this.film = film;
        this.sala = sala;
        this.data = data;
    }

    public void show() {
        System.out.println("Film: " + film.tytul);
        System.out.println("Numer sali: " + sala.nr_sali);
        System.out.println("Data: " + data);
    }
}
