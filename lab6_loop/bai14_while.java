package lab6_loop;

import java.util.Scanner;

// bài 14: vòng lặp while loop
public class bai14_while {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      // vòng lặp  
        int x=0;
        while (x<=6) {
            System.out.println("x + "+x);
            x++;
        }
    
        System.out.println("nhập số nguyên 1 đến 99");
        int n=sc.nextInt();
        while (n<1||n>99) {
            System.out.println("nhập sai nhập lại");
            n=sc.nextInt();
        }
        System.out.println(n);
        sc.close();
    //    bảng cửu chương
        int i=1;
        while (i<=10) {
            System.out.println("bảng cửu chương "+i);
            int j=1;
            while (j<=10) {
                System.out.println(i+" x "+j+" = "+(i*j));
                j++;
            }
            i++;
        }
        
    }
}
