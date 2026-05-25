package lab16_OOP.caffe;

public class hoaDoncaffe {
    private String nameCaffe;
    private double priceCaffe;
    private double khoiLuongCaffe;
    public hoaDoncaffe(String ten, double gia, double kl) {
        this.nameCaffe = ten;
        this.priceCaffe = gia;
        this.khoiLuongCaffe = kl;
    }
    public String getNameCaffe() {
        return nameCaffe;
    }
    public void setNameCaffe(String nameCaffe) {
        this.nameCaffe = nameCaffe;
    }
    public double getPriceCaffe() {
        return priceCaffe;
    }
    public void setPriceCaffe(double priceCaffe) {
        this.priceCaffe = priceCaffe;
    }
    public double getKhoiLuongCaffe() {
        return khoiLuongCaffe;
    }
    public void setKhoiLuongCaffe(double khoiLuongCaffe) {
        this.khoiLuongCaffe = khoiLuongCaffe;
    }
    

    public double tongtien() {
        return this.priceCaffe * this.khoiLuongCaffe;
    }
    public boolean checkKhoiLuong(double kl) {
        return this.khoiLuongCaffe > kl;
    }
    public boolean checkTongtienlonhon500k() {
        return this.tongtien() >= 500000;
    }
    public double giamGia(double phanTramGiam) {
       if (tongtien()>=500000) {
         return (phanTramGiam/100 )* this.tongtien();
       } else {
         return 0;
       }
    }
    public double thanhToan(double phanTramGiam) {
        return this.tongtien() - giamGia(phanTramGiam);
    }
}
