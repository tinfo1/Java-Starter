package lab13_mang_Array;


import java.util.Arrays;
import java.util.Scanner;

public class baitap_27 {
    /* viết ct tạo mảng 1 chiều gồm các phần tử là số nguyên nhập từ bàn phím
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập phần tử của mảng");
        int n =sc.nextInt();
        // tạo mảng có n phần tử 
        int[] m =new int[n];
        // nhập dữ liệu cho từng phần tử mảng
        System.out.println("số phần tử mảng : "+m.length);
        for (int i = 0; i <n; i++) {
            System.out.println("m ["+i+"] =");
            // nhập phần tử từ bàn phím
            m[i]=sc.nextInt();
        }
        // xuất mảng
        System.out.println("màng vừa nhâp là : ");
        System.out.println(Arrays.toString(m));
        // tổng các phần tử trong mảng
        int tong=0;
        for (int i = 0; i < m.length; i++) {
            tong+=m[i];
        }
        System.out.println("tổng các phần tử trong mảng là : "+tong);
        sc.close();
    }
}
