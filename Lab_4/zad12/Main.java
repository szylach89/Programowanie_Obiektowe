package zad12;

public class Main {
    static void main() {
        StandardAccount std_u = new StandardAccount("Jan Kowalski", "jkowal");
        PremiumAccount pr_u = new PremiumAccount("Kuba Nowak", "NowaK");
        AdministratorAccount admin = new AdministratorAccount("Michał Kowal", "Admin");

        std_u.postMessage("Wiadomość");
        pr_u.postMessage("Wiadomość");
        admin.postMessage("Wiadomość");
        admin.updateAccount(pr_u, "Jakub Nowak");
    }
}
