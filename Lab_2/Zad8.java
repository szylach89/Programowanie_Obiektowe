public class Zad8 {
    static void main() {
        Counter c1 = new Counter(0);
        Counter c2 = new Counter(2);

        c1.increaseOther(c2);
        c2.increaseOther(c1);

        System.out.printf("%d%n", c1.value);
        System.out.printf("%d%n", c2.value);

        // Ponieważ do metody przekazujemy referencję do obiektu
    }
}
