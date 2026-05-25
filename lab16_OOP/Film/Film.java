package lab16_OOP.Film;

public class Film {
    private String nameFilm;
    private Date dateRe;
    private Company company;
    private int yearRe;
    private double ticketPrice;
    public Film(String nameFilm, Date dateRe, Company company, int yearRe, double ticketPrice) {
        this.nameFilm = nameFilm;
        this.dateRe = dateRe;
        this.company = company;
        this.yearRe = yearRe;
        this.ticketPrice = ticketPrice;
    }
    public String getNameFilm() {
        return nameFilm;
    }
    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }
    public Date getDateRe() {
        return dateRe;
    }
    public void setDateRe(Date dateRe) {
        this.dateRe = dateRe;
    }
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }
    public int getYearRe() {
        return yearRe;
    }
    public void setYearRe(int yearRe) {
        this.yearRe = yearRe;
    }
    public double getTicketPrice() {
        return ticketPrice;
    }
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    public boolean checkpriceWotherFilm(Film otherFilm) {
        return this.ticketPrice > otherFilm.getTicketPrice();
    }
    public String getNameComp(){
        return this.company.getNameCom();
    }

    public double priceAfterDiscount(double discount) {
        return ticketPrice * (1 - discount / 100);
    }
}
