package lab16_OOP.Computer;

public class Country {
    private String nameCountry;
    private String code;
    public Country(String nameCountry, String code) {
        this.nameCountry = nameCountry;
        this.code = code;
    }
    public String getName() {
        return nameCountry;
    }
    public void setName(String nameCountry) {
        this.nameCountry = nameCountry;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
}
