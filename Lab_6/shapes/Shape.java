package shapes;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
        System.out.println("Konstruktor klasy abstrakcyjnej");
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public void showInformation() {
        System.out.println(getName() + ", area: " + area());
    }
}
