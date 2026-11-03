package zad8;

public class Book {
    String title;
    String author;
    int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    @Override
    public String toString() {
        return "'" + title + "', " + author + ", " + publicationYear;
    }
}
