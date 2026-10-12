public class Zad5 {
    public static void main(String[] args) {
        int x = 2;
        int wynik = 0;

        for (int i = 0; i < 4; i++) {
            wynik += x;
            x *= 2;
        }

        int[] kolejne_i = {0, 1, 2, 3};
        int[] kolejne_x = {2, 4, 8, 16, 32};
        int[] kolejne_wynik = {0, 2, 6, 14, 30};

        System.out.println(x);
        System.out.println(wynik);
    }
}
