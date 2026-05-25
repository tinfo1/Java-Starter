package lab3_if_else;

import java.util.Scanner;

// bài 11 : câu điều kiện if else
public class bai11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("mời nhập vào điểm trung bình : ");
        double dtb=sc.nextDouble();
        //  điều kiện
        if(dtb>=8 && dtb<10){
            System.out.println("xếp loại Giỏi");
            System.out.println("chúc mừng bạn");
        }
        else if (dtb<8 &&dtb>=7) {
            System.out.println("xếp loại khá"); 
        }
        else if (dtb<7&&dtb>=5) {
            System.out.println("xếp lại trung bình");
        }
        else 
            System.out.println("rớt");
            sc.close();
    }
}
