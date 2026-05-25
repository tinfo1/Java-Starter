package lab16_OOP.congty;
public abstract class nhanVien {
    protected String hoTen;
    protected String que;
    protected int cccd;
    protected double luongcoban=850;
    public nhanVien(String hoTen,String que,int cccd){
        this.hoTen=hoTen;
        this.cccd=cccd;
        this.que=que;
    }
    
    public String getHoten(){
        return hoTen;
    }
    public void setHoTen(String hoten){
        this.hoTen=hoten;
    }
     public String getQue(){
        return que;
    }
    public void setQue(String que){
        this.que=que;
    }
     public int getCccd(){
        return cccd;
    }
    public void setHoTen(int cccd){
        this.cccd=cccd;
    }

    public abstract double tinhLuong();
}