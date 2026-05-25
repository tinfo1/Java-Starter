package lab2_scanner;

import java.util.Scanner;

public class baitap_10 {
    public static void main(String[] args) {
        // khai báo 
        double cv, dt;
        // n
        Scanner sc=new Scanner(System.in);
        System.out.println("mời nhập vào bán kính hình tròn");
        double r=sc.nextDouble();
        cv=2*Math.PI*r;
        dt=Math.PI*Math.pow(r, 2);

        // xuất kq hình tròn
        System.out.println("chu vi hình tròn là :"+ cv);
        System.out.println("chu vi hình tròn làm tròn :"+ Math.round(cv));
        System.out.println("chu vi hình tròn lấy 2 số thập phân :"+Math.round(cv*100.0)/100.0);  
        System.out.println("diện tích hình tròn là :"+ dt);
        System.out.println("diện tích hình tròn làm tròn :"+ Math.round(dt));
        System.out.println("diện tích hình tròn lấy 2 số thập phân :"+Math.round(dt*100.0)/100.0);

        // tính tình chữ nhật
        Scanner hcn = new Scanner(System.in);
        System.out.println("Moi nhap vao chieu dai:");
        double a= hcn.nextDouble();
        System.out.println("Moi nhap vao chieu rong:");
        double b= hcn.nextDouble();
        // Ket qua
        System.out.println("Dien tich la: "+(a*b));
        System.out.println("Chu vi la: "+Math.pow((a+b), 2));

        sc.close();
        hcn.close();
    }
}
