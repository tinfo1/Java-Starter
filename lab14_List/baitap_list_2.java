package lab14_List;

import java.util.ArrayList;
import java.util.Scanner;

public class baitap_list_2 {
    public static void main(String[] args) {
        /* nhập vào list
        -tính bình phương các phần tử
        -có bao nhiêu pt lớn hơn 50
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("input list = ");
        int n=sc.nextInt();
        //  cho người dùng nhập
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("moi nhap vao pt "+(i+1));
            int sonhap=sc.nextInt();
            list.add(sonhap);
        }
        System.out.println(list);
        // tính bình phương các pt
        ArrayList<Integer> list2=new ArrayList<>();
        for (Integer x : list) {
            list2.add(x*x);
        }
        System.out.println("bình phuong cua list 1 = "+list2);
        //  tìm pt lơn hơn 50
        String vitri="";
        int count=0;
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i)>50) {
                count++;
                vitri+=i+" ";
                
            }
        }
        System.out.println("so luong pt lon hon 50 : "+count +" o vi tri "+ vitri);
    }
}
