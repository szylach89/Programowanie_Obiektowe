package shapes;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
        System.out.println("Konstruktor kola");
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}
