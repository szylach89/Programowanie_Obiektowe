package zad12;

public class CardPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Płatność kartą: " + amount);
    }
}
