package lab5_switch_case;

import java.util.Scanner;

public class baitap_13_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("mời bấm phím");
        System.out.println("bấm 1: tìm theo tên");
        System.out.println("bấm 2: tìm theo tác giả");
        System.out.println("bấm 3: tìm theo xuất bản");
        System.out.println("bấm 4: tìm theo tiêu đề");
        // logic nhập từ bàn phím 
        boolean check=true;
        while (check) {
        int so =sc.nextInt();
        switch (so) {
            
            case 1:
                 System.out.println("bấm 1: tìm theo tên");
                    check=false;
                break;
            case 2:
                System.out.println("bấm 2: tìm theo tác giả");
                    check=false;
                 break;
            case 3:
                 System.out.println("bấm 3: tìm theo xuất bản");
                    check=false;
                break;
            case 4:
                System.out.println("bấm 4: tìm theo tiêu đề");
                check=false;
                break;
            default:
                System.out.println("không hợp lệ");
        }
    }
        sc.close();
    }
}