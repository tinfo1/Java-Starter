package lab16_OOP.Film;

public class Company {
    private String nameCom;
    private String address;
    public Company(String nameCom, String address) {
        this.nameCom = nameCom;
        this.address = address;
    }
    public String getNameCom() {
        return nameCom;
    }
    public void setNameCom(String nameCom) {
        this.nameCom = nameCom;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    
}
