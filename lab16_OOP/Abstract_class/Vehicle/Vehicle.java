package lab16_OOP.Abstract_class.Vehicle;

public abstract class Vehicle {
    protected String typeVehicle;
    protected Company company;
    public Vehicle(String typeVehicle, Company company) {
        this.typeVehicle = typeVehicle;
        this.company = company;
    }
    public String getTypeVehicle() {
        return typeVehicle;
    }
    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }

    // method get name company
    public String getNameComp(){
        return company.getNameCom();
    }
    public void Start(){
        System.out.println("Vehicle is starting");
    }
    public void inCreaseSpeed(){
        System.out.println("Vehicle is increasing speed");
    }
    public void Stop(){
        System.out.println("Vehicle is stopping");
    }
    public abstract double getSpeed();
}
