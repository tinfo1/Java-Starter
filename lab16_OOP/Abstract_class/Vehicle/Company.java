package lab16_OOP.Abstract_class.Vehicle;

public class Company {
    private String nameCom;
    private String country;
    public Company(String nameCom, String country) {
        this.nameCom = nameCom;
        this.country = country;
    }
    public String getNameCom() {
        return nameCom;
    }
    public void setNameCom(String nameCom) {
        this.nameCom = nameCom;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    
}
