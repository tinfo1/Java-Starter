package lab16_OOP.congty;

public class nhanVienhanhchinh extends nhanVien{

    public nhanVienhanhchinh(String hoTen, String que, int cccd) {
        super(hoTen, que, cccd);
       
    }

    @Override
    public double tinhLuong() {
        return luongcoban;
    }
    
}
