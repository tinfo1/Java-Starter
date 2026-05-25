package lab16_OOP.Enum.sinhvien;

public class sv {
    private int masv;
    private String ten;
    private double dtb;
    private Xeploai loai;


    public sv(int masv,String ten ,double dtb){
        this.masv=masv;
        this.ten=ten;
        this.dtb=dtb;
        this.loai=getLoai();
    }



    public int getMasv(){
        return masv;
    }
    public void setMasv(int masv){
        this.masv=masv;
    }

      public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten=ten;
    }

      public double getDTB(){
        return dtb;
    }
    public void setDTB(double dtb){
        this.dtb=dtb;
    }

    public Xeploai getLoai(){
        if (this.dtb>=8) {
            loai=Xeploai.gioi; 
        }else if (this.dtb>=6.5) {
            loai=Xeploai.kha;
        }else if (this.dtb>=5.0) {
            loai=Xeploai.trungbinh;
        }else if (this.dtb>=3.5) {
            loai=Xeploai.yeu;
        }else 
            loai=Xeploai.duoihoc;
        return loai;
    }
 public String toString(){
    return masv+"\t"+ten+"\t"+this.loai.mota();
 }
}
