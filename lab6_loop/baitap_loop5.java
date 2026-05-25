package lab6_loop;

import java.util.Scanner;

public class baitap_loop5 {
    /* viết chương trình nhập n và S=1!+2!+....+n!
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập n =");
        int n = sc.nextInt();
        int tong=0;
        int gt=1;
        for (int i = 1; i <=n; i++) {
            System.out.println(gt+"*"+i);
            gt=gt*i;
            System.out.println(gt);
            tong=tong+gt;
        }
        System.out.println(tong);
        sc.close();
    }
}
