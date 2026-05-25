package lab14_List;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class baitap_list_1 {
    public static void main(String[] args) {
        /* tạo 1 list có n phần tư từ bàn phím, pt là random
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("number list = ");
        int n=sc.nextInt();
        // random 
        Random rd=new Random();
        // tạo 1 list là các số nguyên
        ArrayList<Integer> list=new ArrayList<>();
        // tạo cái phần tử random và thêm vào list
        for (int i = 0; i <n; i++) {
            int ngaunhien=rd.nextInt(101);
            list.add(ngaunhien);
        }
        // in ra list
        System.out.println(list);
    }
}
