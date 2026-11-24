package zad13i14;

public class ReportService {
    Storage storage;

    public ReportService(Storage storage) {
        this.storage = storage;
    }

    public void generateReport() {
        String report = "Raport";

        storage.save(report);
    }

    /*
    1 - ReportService nie jest relacją IS-A
    2 - Ponieważ istnieje relacja między ReportService, a Database
     */
}
