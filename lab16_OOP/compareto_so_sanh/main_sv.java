package lab16_OOP.compareto_so_sanh;

import java.util.Arrays;

public class main_sv {
    public static void main(String[] args) {
        sinhvien sv1 = new sinhvien("Tin foo", "lop 1", "001", 9);
        sinhvien sv2 = new sinhvien("Le Huynh Dc    ", "lop 2", "005", 7);
        sinhvien sv3 = new sinhvien("   Apex tran   ", "lop 3", "003", 5);

        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);

        System.out.println("so sanh ma sinh vien sv1 va sv2 : "+sv1.compareTo(sv2)+sv1.getTen()+" " + sv2.getTen());
        System.out.println("so sanh ma sinh vien sv1 va sv3 :"+sv1.compareTo(sv3)+sv1.getTen() +" "+ sv3.getTen());
        System.out.println("so sanh ma sinh vien sv2 va sv3 :"+sv2.compareTo(sv3)+sv2.getTen() + " "+sv3.getTen());
        // sắp xếp sinh viên dựa theo masv or tên sv
        sinhvien sv[] = new sinhvien[]{sv1,sv2,sv3};
        System.out.println("kiem tra mang sinh vien : "+Arrays.toString(sv));
            // phải có hàm compareto mới thực hiện được sort
        Arrays.sort(sv);
        System.out.println("sắp xếp sv :"+Arrays.toString(sv));
        // tìm kiếm sinh viên
        int index = Arrays.binarySearch(sv, sv3);
        if (index>=0) {
            System.out.println("tìm thấy sinh viên tại vị trí "+index);
            System.out.println("sinh viên có thông tin  "+sv[index]);
        } else 
            System.out.println("không tìm thấy sinh viên");
    }
}
