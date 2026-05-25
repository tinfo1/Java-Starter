package lab3_if_else;

import java.util.Scanner;

public class baitap_11_namNhuan {
    // tìm năm nhuận năm không nhuận
    /*
     năm nhuận là năm chia hết cho 4 và không chia hết cho 100 hoặc chia hết cho 400
     năm không nhuận là năm không chia hết cho 4 hoặc chia hết cho 100 nhưng không chia hết cho 400    

    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập năm dương lịch : ");
        int year=sc.nextInt();
        // logic nếu năm nhuận thì chia hết cho 4 và không chia hết cho 100 hoặc không chia hết cho 400
        if ((year%4==0 )&& ((year%100!=0)||(year%400==0))) {
            System.out.println("đây là năm nhuận");
        } else {
            System.out.println("năm không nhuận");
        }
        sc.close();
    }
}
