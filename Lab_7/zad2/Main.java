package zad2;

public class Main {
    static void main() {
        BankAccount b = new BankAccount("Jan Kowalski", 14000);
        BankAccount.Transaction t = b.new Transaction("Transakcja", 1500);

        t.print();
    }
}
