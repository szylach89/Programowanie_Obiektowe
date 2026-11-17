package zad7;

import animals.*;

public class Main {
    public static void specialAction(Animal animal) {
        if (animal instanceof Dog dog) {
            dog.digHole();
        }
        if (animal instanceof Cat cat) {
            cat.climb();
        }
    }

    static void main() {
        Dog d = new Dog();
        Cat c = new Cat();

        specialAction(d);
        specialAction(c);
    }
}
