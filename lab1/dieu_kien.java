package lab1;

import java.util.Scanner;

public class dieu_kien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a = ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số b = ");
        int b = sc.nextInt();

        System.out.println("---------------");
        System.out.println("cả hai điều kiện đều đúng: " + (a>0 && b>0));
        System.out.println("ít nhất một điều kiện đúng: " + (a>0 || b>0));
        System.out.println("phủ định của ít nhất một điều kiện đúng: " + !(a>0 || b>0));
        
        sc.close();
    }
}
