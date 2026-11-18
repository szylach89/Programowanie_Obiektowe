package zad5;

public class Main {
    static void main() {
        Report report = new Report();
        Printable printable = report;
        Exportable exportable = report;
        Savable savable = report;

        report.print();
        report.export();
        report.save();

        printable.print();
        // printable.export();
        // printable.save();

        // exportable.print();
        exportable.export();
        // exportable.save();

        // savable.print();
        // savable.export();
        savable.save();
    }
}
