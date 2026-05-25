package lab6_loop;

import java.util.Scanner;
// bài 1: tính giai thừa của số nguyên dương n
/*
    - nhập n
    - tính n! = 1*2*3*4*...*n
    */

public class baitap_loop1 {
    public static void main(String[] args) {
        // nhập số nguyên và tính giai thừa của số đó  n!
        Scanner sc=new Scanner(System.in);
        System.out.println(" nhap so nguyen N = ");
        int n =sc.nextInt();
        // logic dùng vòng lặp chạy từ 1 tới n 
        int gt=1;
        for (int i = 1; i <= n; i++) {
            System.out.println(gt+" * "+i);
            gt=gt*i;
            System.out.println("kq = "+gt); 
        }
        // dùng while loop
        int x=1,kq=1;
        while (x<=n) {
            System.out.println(kq+"*"+x);
            kq=kq*x;
            x++;
            System.out.println(kq);
        }
        System.out.println(n+"!"+"="+kq);
        sc.close();
    }
}
