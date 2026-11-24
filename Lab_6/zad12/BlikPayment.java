package zad12;

public class BlikPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Płatność BLIK: " + amount);
    }
}
