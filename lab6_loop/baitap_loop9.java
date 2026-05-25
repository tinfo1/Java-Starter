package lab6_loop;

import java.util.Scanner;

// chuyển đổi số nguyên sang nhị phân
/*
    - nhập số nguyên dương n từ bàn phím
    - chuyển đổi số nguyên dương n sang nhị phân
    - in ra màn hình 
*/
public class baitap_loop9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập n = ");
        int n = sc.nextInt();
        String nhiPhan="";
        /*
            chia n cho 2 lấy phần dư, phần dư sẽ là bit cuối cùng của số nhị phân
            lấy kq chia cho 2 tiếp tục lấy phần dư, phần dư sẽ là bit thứ 2 của số nhị phân
            tiếp tục chia cho 2 lấy phần dư cho đến khi kq chia cho 2 bằng 0
        */
       while (n>0) {
            nhiPhan=(n%2)+nhiPhan;
            n=n/2;
       }
         System.out.println("số nhị phân là : "+nhiPhan);
        sc.close();
    }
}
