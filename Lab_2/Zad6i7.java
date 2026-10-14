public class Zad6i7 {
    static void main() {
        Person first = new Person("Anna");
        Person second = new Person(first);

        second.name = "Maria";

        first.introduceYourself();
        second.introduceYourself();

        // Zad 6
        // Powstał 1 obiek Person
        // Są 2 referencje
        // Ponieważ first i second odwołują się do tego samego obiektu

        // Zad 7
        // W pierwszym przypadku w second przypisywaliśmy referencję do obiektu który też ma first,
        // w drugim przypadku do second przypisujemy referencje do nowego obiektu z danymi z first
    }
}
