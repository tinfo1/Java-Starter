package lab16_OOP.Sinhvien;

public class sinhvien {
    private int id;
    private String name;
    private Date dateOfBirth;
    private Lop lop;
    private double gpa;
    public sinhvien(int id, String name, Date dateOfBirth, Lop lop, double gpa) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.lop = lop;
        this.gpa = gpa;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Lop getLop() {
        return lop;
    }
    public void setLop(Lop lop) {
        this.lop = lop;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String getTenKhoa(){
        return this.lop.getTenKhoa();
    }
    public boolean checkGpa() {
        return this.gpa >= 5.0;
    }
    public boolean checkSamebirth(sinhvien other) {
        return this.dateOfBirth.equals(other.getDateOfBirth());
    }
}
