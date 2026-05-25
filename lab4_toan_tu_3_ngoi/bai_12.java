package lab4_toan_tu_3_ngoi;

import java.util.Scanner;

// bài 12 : toán tử 3 ngôi
public class bai_12 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số n ");
        int n = sc.nextInt();
        // logic : nếu điều kiện trong ngoặc đúng thì in ra sau dấu ? nếu sai in ra sau dấu :
        String traloi=(n%2==0)?"chan":"le";
        System.out.println(traloi);

        sc.close();
    }
}