package lab6_loop;

import java.util.Scanner;

public class baitap_loop7 {
    // tìm số nguyên tố
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        // vòng lặp vĩnh cửu
        while (true) {
            // nhập N
             System.out.println("nhập n =");
             int n =sc.nextInt();
            // kiểm tra dương
             while (n<=0) {
                System.out.println("nhập sai mời nhập lại");
                n=sc.nextInt();
            }
            System.out.println("nhập n = "+n);
            //  logic số ngto là so chia hết cho 1 và chính nó
            int dem=0;
            for (int i = 1; i <=n; i++) {
                if (n%i==0) {
                    System.out.println(i);
                    dem++;
                }
            }
            if (dem==2) {
                System.out.println(n+" là số ngto");
            }else 
                System.out.println(n+"không phải số ngto, mời nhập lại");

            // dùng break để dừng vòng lặp vĩnh cửu
            System.out.println("bạn có muốn thoát không");
            String traloi=new Scanner(System.in).nextLine();
            if (traloi.equals("y")||traloi.equals("Y")) {
                break;
              
            }
           
        } 
        sc.close();
        
    }
}
