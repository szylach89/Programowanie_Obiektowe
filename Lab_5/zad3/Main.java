package zad3;

import animals.Animal;
import animals.Cat;
import animals.Cow;
import animals.Dog;

public class Main {
    public static void present(Animal animal) {
        System.out.println(animal);
        animal.makeSound();
    }

    static void main() {
        present(new Dog());
        present(new Cat());
        present(new Cow());
    }

    // Nie potrzebujemy 3 różnych metod present,
    // ponieważ typ referencyjny animal to Animal,
    // i używa implementacji metody typu rzeczywistego
}
