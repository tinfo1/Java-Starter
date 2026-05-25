package lab7_Exception;

import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=0;
        try {
        System.out.println("nhập số nguyên A = ");
        A=sc.nextInt();
        } catch (Exception e) {
            System.out.println("lỗi nhập sai dữ liệu");
        }
        System.out.println("giá trị A = "+A);
        System.out.println("kết thúc chương trình");
        sc.close();
    }
}
