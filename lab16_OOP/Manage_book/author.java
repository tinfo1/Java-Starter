package lab16_OOP.Manage_book;

public class author {
    private String name;
    private Date birthdate;
    public author(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
