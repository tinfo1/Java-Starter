package lab6_loop;

import java.util.Scanner;

public class bai17_for {
    public static void main(String[] args) {
        for (int i = 0; i <15; i+=2) {
            System.out.println("i ="+i);

        }
        // tính tổng số chẵn
        int tong =0;
        for (int i = 0; i <=10; i++) {
            if (i%2==0) {
                tong+=i;
            }
        }
        System.out.println("tong"+tong);

        // bảng cửu chương
        Scanner sc=new Scanner(System.in);
         System.out.println("nhập bảng cửu chương");
            int n = sc.nextInt();
            System.out.println("bảng cửu chương "+n);
            for (int i = 1; i <=10; i++) {
                System.out.println(n+" x "+i+" = "+(n *i));
            }
        sc.close();
    }
}
