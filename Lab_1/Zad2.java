import java.util.Scanner;

public class Zad2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj n: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Liczba jest parzysta.");
        }
        else {
            System.out.println("Liczba jest nieparzysta.");
        }

        if (n % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 3.");
        }
        else {
            System.out.println("Liczba nie jest podzielna przez 3.");
        }

        int suma = 0;
        for (int i = 0; i <= n; i++) {
            suma += i;
        }
        System.out.printf("Suma: %d%n", suma);

        int parzyste = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                parzyste++;
            }
        }

        System.out.printf("Liczb parzystych: %d%n", parzyste);

        scanner.close();
    }
}
