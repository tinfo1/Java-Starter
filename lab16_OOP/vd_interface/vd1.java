package lab16_OOP.vd_interface;

public interface vd1 {
    // trong interface tập các thuộc tính chỉ được phép là hằng số
    static final double phuCap=15;
    // phương thức phải là trừu tượng 
    abstract void thongTin(String ten,int cccd,int namsinh);
    abstract double tinhLuong(double luongngay,int songaycong);
}
