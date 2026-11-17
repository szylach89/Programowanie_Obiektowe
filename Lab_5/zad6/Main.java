package zad6;

import animals.Animal;
import animals.Dog;
import animals.Cat;

public class Main {
    static void main() {
        Animal first = new Dog();
        Animal second = new Cat();

        Dog dog = (Dog) first;
        Cat cat = (Cat) second;

        dog.digHole();
        cat.climb();

        // Dog niepies = (Dog) second; <- Wyrzuca ClassCastException
    }
}
