public class Student {
    private String name;
    private int albumNumber;
    private String adres;
    private static int studentCount;
    public static final int MAX_STUDENTS = 50;

    /*
    Dane studenta (imie, nr albumu, adres są private ponieważ to są dane które nie powinny być możliwe do zmiany bez żadnej walidacji)
    studentCount mierzy liczbę stworzonych obiektów student, stąd potrzebny jest static
    MAX_STUDENTS jest maksymalnym limitem ile studentów możemy mieć, stąd static.
    Final jest żeby MAX_STUDENTS nie można było zmienić po przypisaniu pierwszej wartości
     */

    public Student(int albumNumber, String name, String adres) {
        if (studentCount < MAX_STUDENTS) {
            this.albumNumber = albumNumber;
            this.name = name;
            this.adres = adres;
            studentCount++;
        }
        else {
            System.out.println("Osiągnięto maksumalną liczbę studentów!!!");
        }
    }

    public int getAlbumNumber() {
        return albumNumber;
    }

    public String getName() {
        return name;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public String getAdres() {
        return adres;
    }

    public void updateInfo(String name) {
        if (!this.name.isBlank()) {
            this.name = name;
        }
    }

    public void updateInfo (String name, String adres) {
        updateInfo(name);
        if (!this.adres.isBlank()) {
            this.adres = adres;
        }
    }
}
