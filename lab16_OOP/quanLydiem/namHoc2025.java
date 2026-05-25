package lab16_OOP.quanLydiem;
public class namHoc2025 {
    // thuộc tính 
    protected String ten;
    protected int cccd;

    public namHoc2025(String ten,int cccd){
        this.ten=ten;
        this.cccd=cccd;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getCccd() {
        return cccd;
    }

    public void setCccd(int cccd) {
        this.cccd = cccd;
    }

    public void tinhDTB(){
        System.out.println("day là diem trung binh ");
    }
}