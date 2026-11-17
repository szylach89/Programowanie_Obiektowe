package animals;

public class Dog extends Animal {
    public String rasa;

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void digHole() {
        System.out.println("Pies kopie dziure,");
    }
}
