package lab3_if_else;

import java.util.Scanner;

public class baitap_11_timBMI {
// tìm thể trạng cơ thể
/*
    BMI (body Mass Index) = cân nặng (kg) / chiều cao (m)^2
    BMI < 15: thân hình quá gầy
    15 <= BMI < 16: thân hình gầy
    16 <= BMI < 18.5: thân hình hơi gầy
    18.5 <= BMI < 25: thân hình bình thường
    25 <= BMI < 30: thân hình hơi béo
    30 <= BMI < 35: thân hình béo
    BMI >= 35: thân hình béo phì    
*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("mời nhập vào chiều cao (m) ");
        double hight=sc.nextDouble();
        System.out.println("mời nhập vào cân nặng (kg)");
        double weight=sc.nextDouble();
        // tính BMI (body Mass Index)
        double BMI=weight/(Math.pow(hight, 2));
        if (BMI<15) {
            System.out.println("thân hình quá gầy");
        }else if (BMI>=15 && BMI<16) {
            System.out.println("thân hình gầy");
        }else if (BMI>=16 && BMI<18.5 ) {
            System.out.println("thân hình hơi gầy");
        } else if (BMI>=18.5&&BMI<25) {
            System.out.println("thân hình bình thường");
        } else if (BMI>=25&& BMI <30) {
            System.out.println("thân hình hơi béo");
        } else if (BMI >=30 && BMI <35) {
            System.out.println("thân hình béo");
        } else {
            System.out.println("thân hình béo phì");
        }
        sc.close();
    }
}