package lab3_if_else;

import java.util.Scanner;

public class baitap_11_ngayTrongThang {
    // tính ngày trong tháng
    /*
    tháng 1,3,5,7,8,10,12 có 31 ngày
    tháng 4,6,9,11 có 30 ngày
    tháng 2 có 28 ngày nếu năm không nhuận và 29 ngày nếu năm nhuận
    năm nhuận là năm chia hết cho 4 và không chia hết cho 100 hoặc chia hết cho 400
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("mời nhập vào 1 tháng dương lịch : ");
        int month=sc.nextInt();
        // logic nếu 1,3,5,7,8,10,12 có 31 ngày,4,6,9,11 có 30 ngày .nếu là tháng 2 thì tìm năm nhuận
        if (month==1 ||month==3||month==5||month==7||month==8||month==10||month==12 ) {
            System.out.println("tháng "+month+" có 31 ngày");
        } else if (month==4 ||month==6||month==9||month==11) {
            System.out.println("tháng "+month+" có 30 ngày");
        } else if (month==2) {
            System.out.println("mời nhập năm :");
            int year = sc.nextInt();
            if ((year%4==0 )&& ((year%100!=0)||(year%400==0))) {
                System.out.println("năm "+year+" là năm nhuận");
                System.out.println("tháng "+month +" có 29 ngày");
            } else {
                System.out.println("năm "+year+" là không phải năm nhuận");
                System.out.println("tháng "+month+" có 28 ngày");
            }
        }
        else 
            System.out.println("nhập sai tháng");

        sc.close();
    }
}
