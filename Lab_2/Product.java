public class Product {

    String name;
    double price;

    // Konstructor tworzy się przez public Nazwa_Klasy(). Trzeba usunąć void
    public Product(String name, double price) {
        // brakuje this -> powinno być this.name = name; oraz this.price = price;
        this.name = name;
        this.price = price;
    }

    public void show() {
        System.out.println(name + ": " + price);
    }
}
