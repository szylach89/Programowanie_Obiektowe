package vechicle;

public class Car extends Vechicle{
    int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public void showInformation() {
        System.out.println(getBrand());
        System.out.println(getModel());
        System.out.println(numberOfDoors);
    }
}
