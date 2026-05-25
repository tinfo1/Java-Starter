package lab16_OOP.Abstract_class.Vehicle;

public class Aircraft extends Vehicle {
    private String fuel;
    public Aircraft(Company company, String typeVehicle, String fuel) {
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
        // Implementation for aircraft speed
        return 500;
    }
    public void fly() {
        System.out.println("Aircraft is flying");
    }
    public void land() {
        System.out.println("Aircraft is landing");
    }
}
