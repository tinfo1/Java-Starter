package lab16_OOP;

public class HocSinh {
    // 1. thuộc tính
    private String hoTen;  // hoTen,diem là biến toàn cục  global variable
    private Double diem;

    // 2. hàm tạo constructor
        // mặc định không đối số
    public HocSinh(){
        hoTen="no name";
        diem = 0.0;
    }
        // có đối số 
    public HocSinh(String hoTen){ 
        this.hoTen=hoTen;
    }
    public HocSinh(String hoTen,Double diem){
        // String hoTen và Double diem là biến cục bộ 
        this.hoTen=hoTen;
        this.diem=diem;
    }
    
    // 3. phương thức (các hàm)
        // phương thức không có kiểu trả về 
    public void hienThithongtin(){
        System.out.println(hoTen+" "+ diem +" ");
    }
        // phương thức có kiểm trả về return 
    public double tinhdtb(double diemtoan,double dienvan){
        return (diemtoan+dienvan)/2;
    }
    public double tinhdtb(double diemtoan,double dienvan,double diemAnh){
        return (diemtoan+dienvan+diemAnh)/3;
    }
     public double tinhdtb(double diemtoan,double dienvan,String abc){
        return (diemtoan+dienvan)/2;
    }
     public double tinhdtb(String abc,double diemtoan,double dienvan){
        return (diemtoan+dienvan)/2;
    }

    // 4. get và set
    public String getHoten(){
        return hoTen;
    }

    public Double getDiem(){
        return diem;
    }

    public void setHoten(String hoten){
        this.hoTen=hoten;
    }

    public void setDiem(double diem){
        this.diem=diem;
    }
  
    // 5. phương thức đặc biệt ToString để in ra kết quả dễ nhìn hơn
      @Override
    public String toString() {
        return "Sinhvien hoTen=" + hoTen ;
    }

    // 6. support method và service method 
        // 6.1 support method chỉ sử dụng trong class không truy suất từ bên ngoài 
            private boolean checkDiem(){
                return this.diem>=24;
            }
        
        // 6.2 service method truy suất được từ bên ngoài
            public void checkHoplediem(){
                if (checkDiem()==true ) {
                    System.out.println("điểm hợp lệ, nhap thong tin");
                }else 
                    System.out.println("kiem tra lai diem dau vao cua sinh vien ");
            }
    // 7. parametter list 
    public double tongDiem(double ... arr){
        double tong=0.0;
        for (double x : arr) {
            tong+=x;
        }
        return  tong;
    }


}
