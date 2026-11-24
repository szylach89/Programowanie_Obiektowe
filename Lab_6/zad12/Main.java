package zad12;

public class Main {
    static void main() {
        PaymentMethod p1 = new CardPayment();
        PaymentMethod p2 = new BlikPayment();
        PaymentMethod p3 = new TransferPayment();

        OrderService o1 = new OrderService(p1);
        OrderService o2 = new OrderService(p2);
        OrderService o3 = new OrderService(p3);

        o1.checkout(100);
        o2.checkout(200);
        o3.checkout(300);
    }
}
