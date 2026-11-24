package zad13i14;

public class FileStorage implements Storage{
    @Override
    public void save(String data) {
        System.out.println("Zapis do pliku:" + data);
    }
}
