package lab16_OOP.compareto_so_sanh;

public class sinhvien implements Comparable<sinhvien>{
    private String hoVaten;
    private String lop;
    private String masv;
    private double dtb;
    public sinhvien(String hoVaten,String lop, String masv,double dtb ){
        this.hoVaten=hoVaten;
        this.lop=lop;
        this.masv=masv;
        this.dtb=dtb;
    }
    public String getHovaten(){
        return this.hoVaten;
    }
    public void setHovaten(String hoVaten){
        this.hoVaten=hoVaten;
    }
     public String getLop(){
        return this.lop;
    }
    public void setLop(String lop){
        this.lop=lop;
    }
     public String getMasv(){
        return this.masv;
    }
    public void setMasv(String masv){
        this.masv=masv;
    }
     public double getDtb(){
        return this.dtb;
    }
    public void setDtb(double dtb){
        this.dtb=dtb;
    }
    public String getTen(){
        String s = hoVaten.trim() ;
        if(s.indexOf(" ")>=0){
            int vt = s.lastIndexOf(" ");
            return s.substring(vt+1);
        }else
            return s;
    }


    @Override
    public String toString() {
        return "sinhvien [hoVaten=" + hoVaten + ", lop=" + lop + ", masv=" + masv + ", dtb=" + dtb + "]";
    }
    @Override
    public int compareTo(sinhvien o) {
    //   trả về kq  > , < , =
    // so sánnh masv  để sắp xếp sv theo masv
        return this.masv.compareTo(o.masv);
    // so sánh ho và tên để sắp xếp theo tên
        // String tenThis=this.getTen();
        // String tenO = o.getTen();
        // return tenThis.compareTo(tenO);
    }
}
