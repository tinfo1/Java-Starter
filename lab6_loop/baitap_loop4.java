package lab6_loop;

import java.util.Scanner;

public class baitap_loop4 {

    /* viết chương trình tìm các số chia hết cho 3
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập n = ");
        int n=sc.nextInt();
        for (int i = 0; i <=n; i++) {
            if (i%3==0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
