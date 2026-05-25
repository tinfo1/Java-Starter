package lab16_OOP.Computer;

public class Company {
    private String nameCompany;
    private Country country;
    public Company(String nameCompany, Country country) {
        this.nameCompany = nameCompany;
        this.country = country;
    }
    public String getName() {
        return nameCompany;
    }
    public void setName(String nameCompany) {
        this.nameCompany = nameCompany;
    }
    public Country getCountry() {
        return country;
    }
    public void setCountry(Country country) {
        this.country = country;
    }
    public String getCountryName() {
        return this.country.getName();
    }
}
