package lab16_OOP.tinhdahinh;

public abstract  class nhansu {
    // thêm các thuộc tính
    private String ten;
    private int cccd;
    private String que;
    // phương thức tính lương
    abstract  double tinhluong(int ngaycong);
    public nhansu(String ten, int cccd, String que) {
        this.ten = ten;
        this.cccd = cccd;
        this.que = que;
    }
     public nhansu(String ten, int cccd) {
        this.ten = ten;
        this.cccd = cccd;
    }
     public nhansu() {
       
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
     public String getQue() {
         return que;
     }
     public void setQue(String que) {
         this.que = que;
     }
    
}
