package shapes;

public class Triangle extends Shape{
    private double a;
    private double h;

    public Triangle(double a, double h) {
        super("Triangle");
        this.a = a;
        this.h = h;
        System.out.println("Konstruktor trojkata");
    }

    @Override
    public double area() {
        return 0.5 * a * h;
    }
}
