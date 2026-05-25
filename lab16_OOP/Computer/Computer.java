package lab16_OOP.Computer;

public class Computer {
    private Company company;
    private Date releaseDate;
    private double price;
    private double warrantyPeriod;
    public Computer(Company company, Date releaseDate, double price, double warrantyPeriod) {
        this.company = company;
        this.releaseDate = releaseDate;
        this.price = price;
        this.warrantyPeriod = warrantyPeriod;
    }
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }
    public Date getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getWarrantyPeriod() {
        return warrantyPeriod;
    }
    public void setWarrantyPeriod(double warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
    public boolean checkPriceWithOtherComputer(Computer otherComputer) {
        return this.price > otherComputer.getPrice();
    }

    public String getCountryName() {
        return this.company.getCountryName();
    }
}
