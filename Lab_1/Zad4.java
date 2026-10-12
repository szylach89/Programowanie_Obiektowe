import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        // Brakuje średnika
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        // Brakuje =, powinno być ==
        if (liczba % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            // Brakuje średnika
            System.out.println("Liczba jest nieparzysta");
        }

        // Nieskończona pętla, zmiana i-- na i++
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
