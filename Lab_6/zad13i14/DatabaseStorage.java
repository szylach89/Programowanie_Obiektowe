package zad13i14;

public class DatabaseStorage implements Storage{
    @Override
    public void save(String data) {
        System.out.println("Zapis do bazy:" + data);
    }
}
