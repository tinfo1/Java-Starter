package lab3_if_else;

import java.util.Scanner;

public class baitap_11_ptb1 {
// giải PT bậc 1
/*
     ax+b=0
       a!=0 => x=-b/a
        trường hợp a=0 và b=0 thì pt vô số nghiệm
        trường hợp a=0 và b khác 0 thì pt vô nghiệm
*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập tổng 2 số = ");
        double Tong=sc.nextDouble();
        System.out.println("nhập hiệu 2 số = ");
        double Hieu=sc.nextDouble();
        //  logic tính toán
        double x=(Tong+Hieu)/2;
        double y=Tong-x;
        // KQ
        System.out.println("X là :" + x);
        System.out.println("Y là :"+y);
// giải pt bậc 1
        Scanner sc1=new Scanner(System.in);
        System.out.println("nhập  số a = ");
        double a=sc1.nextDouble();
        System.out.println("nhập  số b = ");
        double b=sc1.nextDouble();
        // logic tính toán
        if (a != 0) {
            double z = -b / a;
            System.out.println("Nghiệm của phương trình là: " + z);
        } else {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        }
        sc.close();
        sc1.close();
    }
}