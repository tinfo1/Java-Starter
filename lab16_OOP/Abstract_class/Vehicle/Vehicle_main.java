package lab16_OOP.Abstract_class.Vehicle;

public class Vehicle_main {
    public static void main(String[] args) {
        Company c1 = new Company("Company 1 ", "Viet Nam");
        Company c2 = new Company("Company 2 ", "USA");
        Company c3 = new Company("Company 3 ", "Japan");

        Vehicle v1 = new Aircraft(c1, "AirCraft", "jet fuel");
        Vehicle v2 = new Car(c3, "Car", "gasoline");
        Vehicle v3 = new Bicycle(c2, "Bicycle");
//   get name company
        System.out.println("get name company: " + v1.getNameComp() + v1.getCompany().getCountry());
            // nếu v1 là instance của Aircraft thì ép kiểu về Aircraft để gọi phương thức getFuel() và các phương thức đặc trưng của Aircraft
            if (v1 instanceof Aircraft ) {
                Aircraft aircraft = (Aircraft) v1;
                System.out.println("Fuel type of " + v1.getTypeVehicle() + ": " + aircraft.getFuel());
                aircraft.fly();
                aircraft.land();
            }
            v1.Start();
            v1.inCreaseSpeed();
            v1.Stop();
            System.out.println("-----------------------------");
        System.out.println("get name company: " + v2.getNameComp() + v2.getCompany().getCountry());
            v2.Start();
            v2.inCreaseSpeed();
            v2.Stop();
            System.out.println("-----------------------------");
        System.out.println("get name company: " + v3.getNameComp() + v3.getCompany().getCountry());
            v3.Start();
            v3.inCreaseSpeed();
            v3.Stop();
            System.out.println("-----------------------------");
//  get speed
        System.out.println("Speed of " + v1.getTypeVehicle() + ": " + v1.getSpeed() + " km/h");
        System.out.println("Speed of " + v2.getTypeVehicle() + ": " + v2.getSpeed() + " km/h");
        System.out.println("Speed of " + v3.getTypeVehicle() + ": " + v3.getSpeed() + " km/h"); 
        System.out.println("-----------------------------");
//  AirCraft specific methods
        Aircraft aircraft = (Aircraft) v1;
        aircraft.fly();
        aircraft.land();
        aircraft.Stop();
       System.out.println(aircraft.getTypeVehicle() + " is flying at " + aircraft.getSpeed() + " km/h" );
       System.out.println(aircraft.getTypeVehicle() +" is "+aircraft.getNameComp() + aircraft.getCompany().getCountry()+ " is use fuel "+ aircraft.getFuel());
       System.out.println("ready to fly");
       aircraft.Start();
    }
}
