package lab16_OOP;

public class OOP_1 {
    public static void main(String[] args) {
        HocSinh sv1 =new HocSinh();
        HocSinh sv2 =new HocSinh();
        HocSinh sv3 =new HocSinh("teo");
        HocSinh sv4 =new HocSinh("ti",9.0);
        sv1.hienThithongtin();
        sv2.hienThithongtin();
        sv3.hienThithongtin();
        sv4.hienThithongtin();
        // thay đổi tên sv4
        sv4.setHoten("Duc");
        sv4.getDiem();
        System.out.println(sv4.getDiem());
        sv4.hienThithongtin();

        // phương thức có kiểu trả về 
        double dtbsv4=sv4.tinhdtb(7, 6);
        System.out.println("return method = "+dtbsv4);

        // phương thức ToString
        System.out.println(sv4+ " "+ dtbsv4);

        // support method và service method 
        sv4.setDiem(25);
        sv4.checkHoplediem();

        // overloading phương thức có cùng tên nhưng khác signature
        double testD=sv4.tinhdtb(5, 7);
        System.out.println("overloading method testD = "+testD);
        double testD2=sv4.tinhdtb(5, 7,9);
        System.out.println("overloading method testD2 = "+testD2);

        // parametter list method
        double kq = sv4.tongDiem(3.5,4.6,9,7,8);
        double kq2 = sv4.tongDiem(3.5,4.6,9,7,8,10,20,30);
        System.out.println("parametter list method kq = "+kq);
        System.out.println("parametter list method kq2 = "+kq2);

    }
}
