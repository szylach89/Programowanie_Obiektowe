package zad10;

import animals.*;

public class Main {
    static void identify(Animal animal) {
        System.out.println("Animal");
    }

    static void identify(Dog dog) {
        System.out.println("Dog");
    }

    static void main() {
        Animal animal = new Dog();

        identify(animal); // Wyświetli Animal
        animal.makeSound(); // Wyświetli Woof!

        /*
        Przeciążenie jest wybierane w czasie kompilacji na podstawie typu referencji
        dlatego identify wypisuje Animal
        animal.makeSound() Używa metody nadpisaniej z klasy Dog
        dlatego wypisuje Woof!
         */
    }
}
