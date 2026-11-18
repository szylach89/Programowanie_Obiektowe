package zad1i2;

import shapes.*;

public class Main {
    static void main() {
        Shape[] shapes = {
                new Circle(2),
                new Rectangle(2, 3),
                new Triangle(4, 5),
                new Rectangle(20, 4)
        };

        for (Shape shape : shapes) {
            shape.showInformation();
        }
    }
}
