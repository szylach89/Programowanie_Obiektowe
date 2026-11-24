package zad9;

public class Main {
    static void main() {
        Sparrow sparrow = new Sparrow();
        Eagle eagle = new Eagle();
        Penguin penguin = new Penguin();

        eagle.fly();
        sparrow.fly();
        penguin.eat();

        /*
        Nowy projekt jest lepszy ponieważ Penguin teraz nie dziedziczy zachowania którego nie powinien posiadać.
         */
    }
}
