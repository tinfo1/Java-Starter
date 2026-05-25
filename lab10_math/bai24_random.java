package lab10_math;

import java.util.Random;

// bài 24: random
public class bai24_random {
    public static void main(String[] args) {
        // khởi tạo
        Random rd=new Random();
        // lấy 1 số nguyên
        int songuyen=rd.nextInt(0,50);
        System.out.println("số nguyên "+songuyen);
        // lấy 1 số thực
        double sothuc=rd.nextDouble(-100,100);
        System.out.println("số thực "+ sothuc);


    }
}
