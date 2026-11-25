package zad1;

public class Computer {
    private String model;

    static class Specification {
        int ramGb;
        int diskGb;
        String processor;

        public Specification(int ramGb, int diskGb, String processor) {
            this.ramGb = ramGb;
            this.diskGb = diskGb;
            this.processor = processor;
        }

        void print() {
            System.out.println("Ram [Gb]: " + ramGb);
            System.out.println("Disk [Gb]: " + diskGb);
            System.out.println("CPU: " + processor);
            // System.out.println("Model: " + model);  <- BŁĄD
            /*
            Zagnieżdżona klasa statyczna nie jest powiązana z z konkretną instancją klasy zewnętrznej
             */
        }
    }
}
