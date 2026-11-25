package zad6;

public class Main {
    static void main() {
        int minimumLength = 5;

        // minimumLength = 10; <- wyrzuca błąd

        class Validator {

            public boolean isValid(
                    String value
            ) {
                return value != null
                        && value.length()
                        >= minimumLength;
            }
        }
    }
}

/*
effectively final to zmienna która po inicjalizacji nie jest już ponownie przypisywana
 */