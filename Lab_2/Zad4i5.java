public class Zad4i5 {
    static void main() {
        Car c1 = new Car("Toyota", "Yaris", 2004, 10000);
        Car c2 = new Car("Hyundai", "Tuscon", 2007);
        Car c3 = new Car("Subaru", "Impreza");

        c1.drive(100.5);
        c3.drive(25.7);
        c2.drive(-20);
        c1.showInformation();
        c2.showInformation();
        c3.showInformation();

        Car c3copy = new Car(c3);
        c3copy.productionYear = 2004;

        c3copy.showInformation();
    }
}
