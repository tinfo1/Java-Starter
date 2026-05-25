package lab13_mang_Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class baitap_Array_1 {
    public static void main(String[] args) {
        /* viết ct tạo mảng 1 chiều số nguyên ramdom từ bàn phím sau đó 
        - xuất mảng
        - sắp xếp
        - đảo ngược 
        - tính tổng
        - người dùng nhập số bất kì kiểm tra có tồn tại hay không
         */
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        System.out.println("input so luong mang");
        int n = sc.nextInt();
        // tạo mảng có n phần tử
        int[] m = new int[n];
        System.out.println(Arrays.toString(m));
        // duyệt mảng ngẫu nhiên
        for (int i = 0; i < n; i++) {
            int ngaunhien=rd.nextInt(101);
            m[i]=ngaunhien;
        }
        // xuất ra màn hình
        System.out.println("mang vua nhap : "+Arrays.toString(m));
        // sắp xếp mảng
        Arrays.sort(m);
        System.out.println("sắp xếp mang : "+Arrays.toString(m));
        // đảo ngược mảng
        for (int i = 0,j=m.length-1; i <j; i++,j--) {
            int temp =m[i];
            m[i]=m[j];
            m[j]=temp;
        }
        System.out.println("mang sau khi reverse : " +Arrays.toString(m) );
        //  tính tổng các phần tử
        int tong=0;
        for (int pt : m) {
            tong+=pt;
        }
        System.out.println("tong cac phan tu :" + tong);
        //  int sum=0;
        // for (int i = 0; i < m.length; i++) {
        //     sum+=m[i];
        // }
        //   System.out.println("tong cac phan tu :" + sum);

        // kiểm tra tồn tại
        System.out.println("input number to check : ");
        int so =sc.nextInt();
        boolean check=false;
        String vitri="";
        for (int i = 0; i < m.length; i++) {
            if (m[i]==so) {
                check=true;
                vitri += (i+"");
            }
        }
        if (check) {
            System.out.println(so+" co trong mang voi vi tri : "+vitri);
        }else
            System.out.println(so+" khong ton tai trong chuoi");
        sc.close();

    }
}
