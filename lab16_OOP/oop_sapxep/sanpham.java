package lab16_OOP.oop_sapxep;

public class sanpham implements Comparable<sanpham> {
    // thuộc tính 
    private String ten;
    private String masp;
    private double gia;
    // contructor
      public sanpham(String ten, String masp, double gia) {
        this.ten = ten;
        this.masp = masp;
        this.gia = gia;
    }
    // phương thức 
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getMasp() {
        return masp;
    }
     public void setMasp(String masp) {
        this.masp = masp;
    }
    public double getGia() {
        return gia;
    }
    public void setGia(double gia) {
        this.gia = gia;
    }
// override
    // @Override
    // public int compareTo(sanpham o) {
    //    if (this.gia>o.gia) {
    //     return -1;
    //    }if (this.gia<o.gia) {
    //     return 1;
    //    }
    //    return 0;
    // }
    @Override
    public String toString() {
       
        return masp+"\t"+ten+"\t"+gia;
    }
    @Override
    public int compareTo(sanpham o) {
       return this.ten.compareToIgnoreCase(o.ten);
    }
  

}
