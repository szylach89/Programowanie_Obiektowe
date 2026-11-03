package zad7;

public class Computer extends Device {
    int ramGb;

    public Computer(String manufacturer, int ramGb) {
        super(manufacturer);
        this.ramGb = ramGb;
    }

    public void sleep() {
        System.out.println("System uśpiony");
    }
}
