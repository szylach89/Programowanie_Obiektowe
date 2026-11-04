package animals;

public class Dog extends Animal {
    public String rasa;
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
