package lab16_OOP.congty;

public class nhanViendica extends nhanVien {
    protected int ca;
    public nhanViendica(String hoTen, String que, int cccd) {
        super(hoTen, que, cccd);
       
    }
    
    public nhanViendica(String hoTen, String que, int cccd, int ca) {
        super(hoTen, que, cccd);
        this.ca = ca;
    }

    @Override
    public double tinhLuong() {
      return luongcoban*1.05;
    }
    
}
