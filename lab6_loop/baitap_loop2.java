package lab6_loop;

import java.util.Scanner;
// bài 2: nhập số nguyên A, nếu A là số chẵn thì tính tổng các số chẵn, nếu A là số
/*
    - nhập từ bàn phím số nguyên A .
    nếu A là số chẵn thì tính tổng các số chẵn, 
    nếu A là số lẻ in ra màn hình và end 
*/
public class baitap_loop2 {
    public static void main(String[] args) {
        /*  nhập từ bàn phím số nguyên A .
         nếu A là số chẵn thì tính tổng các số chẵn, 
         nếu A là số lẻ in ra màn hình và end */
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập A = ");
        int A=sc.nextInt();
        int tong=0;
        if (A%2 !=0) {
            System.out.println(A+" là số lẻ  ");
        } else {
            for (int i = 0; i <=A; i+=2) {
                System.out.println(tong+" + "+ i);
                tong+=i;
                
            }
            System.out.println("số nguyên A có tổng chẵn =" + tong);
        }
        
        sc.close();

    }
}
