public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals("")) {
            this.name = name;
        }
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        }
    }

    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        }
    }

    // Wydaje mi się że settery są potrzebne dla tych 3 wartości
    // Mamy warunki dla wartości które chcemy przypisać, a te zazwyczaj dajemy do setterów
    // Jednak to pozwala nam ustawić wiek na mniejszy niż jest lub zmienić ją z 13 na 25
    // w tym wypadku potrzebna by była funkcja która zmienia wiek o 1 niżeli setter
}
