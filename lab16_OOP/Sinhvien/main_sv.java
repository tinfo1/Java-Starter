package lab16_OOP.Sinhvien;

public class main_sv {
    public static void main(String[] args) {
        Date d1= new Date(1, 1, 2002);
        Date d2= new Date(2, 2, 2001);
        Date d3= new Date(1, 1, 2002);

        Lop l1= new Lop("CTK43", "CNTT");
        Lop l2= new Lop("CTK44", "KT");
        Lop l3= new Lop("CTK45", "MKT");

        sinhvien s1= new sinhvien(1, "Nguyen Van A", d1, l1, 9.0);
        sinhvien s2= new sinhvien(2, "Le Thi B", d2, l2, 6.8);
        sinhvien s3= new sinhvien(3, "Tran Van C", d3, l3, 4.2);

        // lấy tên khoa của sinh viên 
        System.out.println("Tên khoa của sinh viên s1: " + s1.getTenKhoa());
        System.out.println("Tên khoa của sinh viên s2: " + s2.getTenKhoa());
        System.out.println("Tên khoa của sinh viên s3: " + s3.getTenKhoa());

        // kiểm tra điểm trung bình của sinh viên có đạt yêu cầu hay không
        System.out.println("Sinh viên s1 có đạt yêu cầu về điểm trung bình không? " + s1.checkGpa());
        System.out.println("Sinh viên s2 có đạt yêu cầu về điểm trung bình không? " + s2.checkGpa());
        System.out.println("Sinh viên s3 có đạt yêu cầu về điểm trung bình không? " + s3.checkGpa());
        // kiểm tra sinh viên có cùng ngày sinh hay không
        System.out.println("Sinh viên s1 và s2 có cùng ngày sinh không? " + s1.checkSamebirth(s2));
        System.out.println("Sinh viên s1 và s3 có cùng ngày sinh không? " + s1.checkSamebirth(s3));
        System.out.println("Sinh viên s2 và s3 có cùng ngày sinh không? " + s2.checkSamebirth(s3));
    }
}
