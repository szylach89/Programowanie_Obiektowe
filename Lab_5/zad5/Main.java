package zad5;

import animals.Animal;
import animals.Dog;

public class Main {
    static void main() {
        Dog dog = new Dog();
        Animal animal = dog;

        dog.makeSound();
        animal.makeSound();

        // animal.rasa = "Owczarek"; <- Nie można

        animal.imie = "Szako";

        System.out.println(dog.imie);

        // Upcasting nie tworzy nowego obiektu
    }
}
