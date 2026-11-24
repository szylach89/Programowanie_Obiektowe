package zad13i14;

public class ConsoleStorage implements Storage{
    @Override
    public void save(String data) {
        System.out.println("Zapis do konsoli:" + data);
    }
}
