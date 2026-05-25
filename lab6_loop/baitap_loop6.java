package lab6_loop;

import java.util.Scanner;

public class baitap_loop6 {
/* nhập n và in ra những số hoàn hảo
 -từ 0 tới 1000 có bao nhiêu số hoàn hảo
 */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập n = ");
        int n =sc.nextInt();
        // logic số hoàn hảo là số mà tổng các ước số của nó = chính nó,
       
        for (int y = 0; y <=n; y++) {
             int tong=0;
            for (int i = 1; i <y; i++) {
            if (y%i==0) {
            // System.out.println(i);
                tong=tong+i;
                }
            }
        if (tong==y) {
            System.out.println(y);
        }  
    }
    sc.close();
    }
}