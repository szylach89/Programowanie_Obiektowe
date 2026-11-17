package zad13;

public class Triangle extends Shape{
    @Override
    public double area() {
        return 0.5 * 4 * 5;
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}
