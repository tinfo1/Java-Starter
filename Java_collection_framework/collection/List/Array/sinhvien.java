package Array;

import java.util.Objects;

public class sinhvien implements Comparable<sinhvien>{
    private String masv;
    private String hovaten;
    private int namsinh;
    private double diemtrungbinh;
    // thêm constructor có mã sinh viên để kiểm tra tồn tại ở câu 6
    public sinhvien(String masv){
        this.masv=masv;
    }
    public sinhvien(String masv, String hovaten, int namsinh, double diemtrungbinh) {
        this.masv = masv;
        this.hovaten = hovaten;
        this.namsinh = namsinh;
        this.diemtrungbinh = diemtrungbinh;
    }
    public String getMasv() {
        return masv;
    }
    public void setMasv(String masv) {
        this.masv = masv;
    }
    public String getHovaten() {
        return hovaten;
    }
    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }
    public int getNamsinh() {
        return namsinh;
    }
    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    public double getDiemtrungbinh() {
        return diemtrungbinh;
    }
    public void setDiemtrungbinh(double diemtrungbinh) {
        this.diemtrungbinh = diemtrungbinh;
    }
    @Override
    public String toString() {
        return "sinhvien masv=" + masv + ", hovaten=" + hovaten + ", namsinh=" + namsinh + ", diemtrungbinh="
                + diemtrungbinh + "";
    }
    @Override
    public int compareTo(sinhvien o) {
       return this.masv.compareTo(o.masv);
    }
    // câu 6 và câu 7 phải override phương thức equals để so sánh 2 đối tượng sinh viên với nhau dựa vào mã sinh viên 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        sinhvien other = (sinhvien) obj;
        // return masv.equals(other.masv);
        return Objects.equals(masv,other.masv);
    }
}
