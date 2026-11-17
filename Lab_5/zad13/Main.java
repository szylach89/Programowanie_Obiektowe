package zad13;

public class Main {
    public static void printShape(Shape shape) {
        System.out.println(shape.getName() + " " + shape.area());
    }

    static void main() {
        Shape[] shapes = {new Circle(), new Triangle(), new Rectangle()};

        for (Shape shape : shapes) {
            printShape(shape);
        }
    }
}
