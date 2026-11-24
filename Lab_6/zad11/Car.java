package zad11;

public class Car {
    Engine engine;
    Gearbox gearbox;

    public Car() {
        this.engine = new Engine();
        this.gearbox = new Gearbox();
    }

    public void start() {
        engine.start_engine();

        System.out.println("Car running");
    }
}
