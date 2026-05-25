package lab16_OOP.Abstract_class.Vehicle;

public class Car  extends Vehicle {
    private String fuel;
    public Car(Company company, String typeVehicle, String fuel) {
        super(typeVehicle, company);
        this.fuel = fuel;
    }
    public String getFuel() {
        return fuel;
    }
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
    @Override
    public double getSpeed() {
        // Implementation for car speed
        return 150;
    }
}
