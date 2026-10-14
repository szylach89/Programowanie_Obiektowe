public class Car {
    String brand;
    String model;
    int productionYear;
    double mileage;

    public Car(String brand, String model, int productionYear, double mileage) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
    }

    public Car(String brand, String model, int productionYear) {
        this(brand, model, productionYear, 0);
    }

    public Car(String brand, String model) {
        this(brand, model, 0, 0);
    }

    public Car(Car other) {
        brand = other.brand;
        model = other.model;
        productionYear = other.productionYear;
        mileage = other.mileage;
    }

    public void drive(double distance) {
        if (distance > 0) {
            mileage += distance;
        }
    }

    public void showInformation() {
        System.out.printf("Marka: %s%n", brand);
        System.out.printf("Model: %s%n", model);
        System.out.printf("Rok produkcji: %d%n", productionYear);
        System.out.printf("Przebieg: %f%n", mileage);
    }

}
