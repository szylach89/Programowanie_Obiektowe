package zad7;

public class Device {
    String manufacturer;

    public Device(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public  void turnOn() {
        System.out.println("Urządzenie włączone");
    }

    public void turnOff() {
        System.out.println("Urządzenie wyłączone");
    }
}
