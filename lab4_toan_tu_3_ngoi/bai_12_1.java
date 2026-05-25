package lab4_toan_tu_3_ngoi;

import java.util.Scanner;

public class bai_12_1 {
    // tìm học lực
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập điểm = ");
        double i=sc.nextDouble();
        // logic 
        String traloi=(i>=8&&i<=10)?"gioi":(i<8 && i>6.5)?"kha":(i<=6.5&&i>=5)?"trung binh":(i<5)?"yeu":"nhap sai";
        System.out.println(traloi);
        
        sc.close();
    }
}
