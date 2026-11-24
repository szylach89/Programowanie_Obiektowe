package zad13i14;

public class Main {
    static void main() {
        Storage db = new DatabaseStorage();
        Storage f = new FileStorage();
        Storage c = new ConsoleStorage();
        ReportService r = new ReportService(db);
        r.generateReport();
        r.storage = f;
        r.generateReport();
        r.storage = c;
        r.generateReport();
    }
}
