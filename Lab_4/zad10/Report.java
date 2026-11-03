package zad10;

public class Report extends Document{
    String tytul;

    public Report(String tresc, String tytul) {
        super(tresc);
        this.tytul = tytul;
    }

    @Override
    public Report copy() {
        return new Report(tresc, tytul);
    }
}
