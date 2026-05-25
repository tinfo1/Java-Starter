package lab16_OOP.Abstract_class.Vehicle;

public class Bicycle  extends Vehicle {
    public Bicycle(Company company, String typeVehicle) {
        super(typeVehicle, company);
    }
    @Override
    public double getSpeed() {
        // Implementation for bicycle speed
        return 20;
    }
}
