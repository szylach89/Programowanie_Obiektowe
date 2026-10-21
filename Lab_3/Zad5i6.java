public class Zad5i6 {
    static void main() {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();
        Product p5 = new Product();
        // Product p6 = new Product(); <- wyrzuca błąd, limit produktów = 5

        System.out.println(Product.getNumberOfProducts());

        // MAX_PRODUCTS odnosi się do klasy a nie do pojedyńczych obiektów
        // final by po przypisaniu nie można przypisać innego
        // numberOfProducts nie powinno być final ponieważ się zmienia(o 1 z każdym utworzonym obiektem pod limitem)
    }
}
