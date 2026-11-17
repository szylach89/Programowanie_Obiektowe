package zad8;

import animals.*;

public class Main {
    public static void makeSound(
            Animal animal
    ) {
        animal.makeSound();
    }

    static void main() {
        Cow cow = new Cow();
        Dog dog = new Dog();
        Cat cat = new Cat();

        makeSound(cow);
        makeSound(dog);
        makeSound(cat);
    }
}
