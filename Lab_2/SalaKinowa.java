public class SalaKinowa {
    int nr_sali;
    int ilosc_miejsc;

    public SalaKinowa(int nr_sali, int ilosc_miejsc) {
        this.nr_sali = nr_sali;
        this.ilosc_miejsc = ilosc_miejsc;
    }

    public void show() {
        System.out.println("Numer sali: " + nr_sali);
        System.out.println("Ilość miejsc: " + ilosc_miejsc);
    }
}
