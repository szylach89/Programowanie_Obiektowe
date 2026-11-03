package zad7;

public class Laptop extends Computer {
    int batteryCapacityWh;

    public Laptop(String manufacturer, int ramGb, int batteryCapacityWh) {
        super(manufacturer, ramGb);
        this.batteryCapacityWh = batteryCapacityWh;
    }

    public void close() {
        System.out.println("Zamykanie laptopa");
        sleep();
    }
}
