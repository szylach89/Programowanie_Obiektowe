package zadania;

import emp.Employee;

public class Zad1 {
    static void main() {
        Employee e = new Employee("jan", "kowalski", "kierownik");

        /*
        firstName nie jest dostępne ponieważ jest private i podklasy NIE mają bezpośredniego dostępu
        lastName kest dostępne jest protected i podklasy mają do niej dostęp
         protected nie jest zawsze lapsze niż private, przy private mamy dostęp do pola przez metody(setter, getter)
         */

        e.displayData();
    }
}
