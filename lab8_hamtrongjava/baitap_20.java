package lab8_hamtrongjava;

import java.util.Scanner;

public class baitap_20 {
    public static void main(String[] args) {
        /* viết CT giải PTB2 với a=1,b=2,c=3
                                 a=1,b=2,c=1
                                 a=1,b=2,c=-3
         */
        String kq =PTB2(1, 2, 3);
        String kq2 =PTB2(1, 2, 1);
        String kq3 =PTB2(1, 2, -3);
        System.out.println(kq);
        System.out.println(kq2);
        System.out.println(kq3);
        //  nhập a,b,c từ bàn phím
        Scanner sc=new Scanner(System.in);
        System.out.println("mời nhập a =");
            double a=sc.nextDouble();
        System.out.println("mời nhập b =");
                double b=sc.nextDouble();
        System.out.println("mời nhập c =");
                double c=sc.nextDouble();
        String kq4=PTB2(a, b, c);
        System.out.println(kq4);
        

        sc.close();
    }
    public static String PTB2(double a,double b,double c){
        if (a==0) {
            if (b==0 && c==0) {
                return "pt bậc 1 vô số nghiệm";
            } else if (b==0 && c!=0) {
                return "pt bậc 1 vô nghiệm";
            } else
                return "pt có nghiệm :" + (-c/b);
        }else {
            // giải ptb2
            double delta=(b*b)-(4*a*c);
            if (delta<0) {
                return "ptb2 vô nghiệm";
            }else if (delta==0) {
                double x=(-b/(2*a));
                return "pt có nghiệm kép x=" + x;
            }else {
                double x1=(-b+Math.sqrt(delta))/(2*a);
                double x2=(-b-Math.sqrt(delta))/(2*a);
                return "pt có 2 nghiệm x1 = "+ x1 +" và x2 =" +x2;
            }
        }
    }
    
}
