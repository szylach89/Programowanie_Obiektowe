public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name,
               String breed,
               int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark() {
        System.out.println("Wow wow");
    }

    public void showInformation() {
        System.out.printf("Imie: %s%n", name);
        System.out.printf("Rasa: %s%n", breed);
        System.out.printf("Wiek: %d%n", age);
    }
}