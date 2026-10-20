public class Zad12 {
    static void main() {
        SalaKinowa sala1 = new SalaKinowa(1, 60);
        SalaKinowa sala2 = new SalaKinowa(2, 120);

        Film film1 = new Film("Resident Evil", 90);
        Film film2 = new Film("Lalka", 162);

        Seans seans = new Seans(film2, sala2, "24-10-2026 17:30");

        Rezerwacja rez = new Rezerwacja(seans, 118);

        System.out.println("----");
        sala1.show();
        System.out.println("----");
        sala2.show();
        System.out.println("----");
        film1.show();
        System.out.println("----");
        film2.show();
        System.out.println("----");
        seans.show();
        System.out.println("----");
        rez.show();
        System.out.println("----");

    }
}
