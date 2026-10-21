public class Product {
    String name;
    int price;
    static int numberOfProducts;

    public static final int MAX_PRODUCTS = 5;

    public Product() {
        if (numberOfProducts < MAX_PRODUCTS) {
            numberOfProducts++;
        }
        else {
            throw new IllegalStateException("Osiągnięto limit produktów");
        }
    }

    static int getNumberOfProducts() {
        return numberOfProducts;
    }
}
