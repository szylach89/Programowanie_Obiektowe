package vechicle;

public class Vechicle {
    private String brand;
    private String model;

    public Vechicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Trzeba było zrobić settery by uzyskać dostęp w podklasie do pól private

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
