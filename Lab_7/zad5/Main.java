package zad5;

public class Main {
    static void main() {
        String[] names = {"Jan", "Tomek", "Al", "", "  ", "    "};
        validateNames(names);
    }

    public static void validateNames(String[] names) {
        class NameValidator {
            public boolean isValid(String value) {
                if (value == null) {
                    return false;
                }
                if (value.isEmpty()) {
                    return false;
                }
                if (value.length() < 3) {
                    return false;
                }
                return true;
            }
        }
        NameValidator nv = new NameValidator();
        for (String s : names) {
            System.out.println(nv.isValid(s));
        }
    }
}
