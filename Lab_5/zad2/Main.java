package zad2;

import animals.*;

public class Main {
    static void main() {
        Animal[] animals = {
                new Cat(),
                new Dog(),
                new Sheep(),
                new Cow()
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
