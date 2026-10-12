import java.util.Scanner;

public class Zad3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int[] tablica = new int[10];
        for (int i = 0; i < 10; i++) {
            tablica[i] = scanner.nextInt();
        }

        System.out.printf("Max: %d%n", max(tablica));
        System.out.printf("Min: %d%n", min(tablica));

        int suma = 0;
        for (int liczba : tablica) {
            suma += liczba;
        }
        System.out.printf("Suma: %d%n", suma);
    }

    static int max(int[] tab) {
        int max_liczba = tab[0];
        for (int liczba : tab) {
            if (liczba > max_liczba) {
                max_liczba = liczba;
            }
        }
        return max_liczba;
    }

    static int min(int[] tab) {
        int min_liczba = tab[0];
        for (int liczba : tab) {
            if (liczba < min_liczba) {
                min_liczba = liczba;
            }
        }
        return min_liczba;
    }
}
