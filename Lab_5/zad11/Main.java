package zad11;

import animals.*;

public class Main {
    static void main() {
        Animal animal = new GuideDog();

        System.out.println(animal instanceof Animal); // True
        System.out.println(animal instanceof Dog); // True
        System.out.println(animal instanceof GuideDog); // True
        System.out.println(animal.getClass() == Animal.class); // False
        System.out.println(animal.getClass() == Dog.class); // False
        System.out.println(animal.getClass() == GuideDog.class); // True
    }
}
