package zad10;

public class Document {
    String tresc;

    public Document(String tresc) {
        this.tresc = tresc;
    }

    public Document copy() {
        return new Document(tresc);
    }
}
