package zad8;

public class TextDocument implements ReadWrite{
    @Override
    public void read() {
        System.out.println("Reading");
    }

    @Override
    public void write() {
        System.out.println("Writing");
    }
}
