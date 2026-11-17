package animals;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Miau!");
    }

    public void climb() {
        System.out.println("Kot się wspina.");
    }
}
