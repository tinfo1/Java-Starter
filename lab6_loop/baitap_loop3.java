package lab6_loop;

import java.util.Scanner;

public class baitap_loop3 {
    public static void main(String[] args) {
        /* nhập từ bàn phím số N 
        -tính tổng các số lẻ 
        -nhập N = 7 , tính tổng các số lẻ nhưng bỏ qua 3
        -dùng break khi vòng lặp chạy đến 3
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập N = ");
        int n = sc.nextInt();
        int tong=0;
        if (n%2 !=0) {
            for (int i = 1; i <= n; i+=2) {
                System.out.println(i+"+"+tong);
                // nếu tổng các số lẻ nhưng bỏ qua 3 
                if (i==3) {
                    continue;
                }
                // nếu chạy tới 3 thì dừng
                if (i==3) {
                    break;
                }
                tong+=i;
            }
            System.out.println(tong);
        }
        sc.close();
    }
}
