public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(Person other) {
        name = other.name;
    }

    public void introduceYourself() {
        System.out.printf("Hej, jestem %s.%n", name);
    }
}
