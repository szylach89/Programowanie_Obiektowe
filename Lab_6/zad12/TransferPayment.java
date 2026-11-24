package zad12;

public class TransferPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Przelew: " + amount);
    }
}
