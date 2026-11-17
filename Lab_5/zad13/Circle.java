package zad13;

public class Circle extends Shape{

    @Override
    public double area() {
        return 3.14 * 3 * 3;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
