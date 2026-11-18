package shapes;

public class Rectangle extends Shape{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        super("Rectangle");
        this.a = a;
        this.b = b;
        System.out.println("Konstruktor prostokata");
    }

    @Override
    public double area() {
        return a * b;
    }
}
