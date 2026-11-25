package zad2;

public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    class Transaction {
        String description;
        int amount;

        public Transaction(String description, int amount) {
            this.description = description;
            this.amount = amount;
        }

        void print() {
            System.out.println("Właściciel: " + owner);
            System.out.println("Balans: " + balance);
            System.out.println("Opis: " + description);
            System.out.println("Wartość: " + amount);
        }
    }
}
