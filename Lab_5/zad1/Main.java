package zad1;

import animals.*;

public class Main {
    static void main() {
        Animal first = new Dog();
        Animal second = new Cat();

        // 1. - typ referencji first - Animal
        // 2. - rzeczywisty typ - Dog
        // 3. - typu rzeczywistego, czyli dla first powinno wypisać Woof!, a dle second - Miau!
        // 4. - Nie ponieważ typ referencji jest Animal, więc mamy dostęp tylko do metod które występują w Animal

        first.makeSound();
        second.makeSound();
    }
}
