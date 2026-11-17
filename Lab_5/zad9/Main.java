package zad9;

public class Main {
    static void main() {
        Parent object = new Child();

        System.out.println(object.value); // Wyświetli Parent
        System.out.println(object.getValue()); // Wyświetli Child

        /*
        Pierwszy print wyświetla Parent ponieważ czyta pole z obiektu Parent
        Drugi print wyświetla Child ponieważ w obiekcie Child jest nadpisanie metody getValue()
        */
    }
}
