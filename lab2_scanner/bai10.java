package lab2_scanner;

import java.util.Scanner;

//  bài 10 Scanner
public class bai10 {
    public static void main(String[] args) {
        // khởi tạo đối tượng Scanner
        Scanner sc=new Scanner(System.in);
        // cho phép nhập chuỗi
        System.out.println("mời nhập mk cấp 1 ");
        String mk1=sc.nextLine();// đọc dữ liệu từ bàn phím
        System.out.println("mật khẩu cấp 1 là "+mk1);
        //  nhập số nguyên
        System.out.println("mời nhập số nguyên");
        int a =sc.nextInt();
        System.out.println("số nguyên a = "+a);
        // nhập số thực
        System.out.println("mời nhập số thực ");
        float b=sc.nextFloat();
        System.out.println("số thực b = "+b);

        sc.close();
    }
}
