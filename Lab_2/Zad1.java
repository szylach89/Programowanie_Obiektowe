public class Zad1 {
    static void main() {
        Dog pies1 = new Dog("Szako", "Mieszaniec", 11);
        Dog pies2 = new Dog("Diana", "Owczarek Niemiecki", 5);

        pies1.bark();
        pies1.showInformation();
        pies2.bark();
        pies2.showInformation();
    }
}
