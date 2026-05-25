package lab8_hamtrongjava;

import java.util.Scanner;

public class baitap_21 {
    public static void main(String[] args) {
        /* viết ct nhập vào a và b
        -nhập + : tính a+b;
        -nhập - : tính a-b;
        -nhập * : tính a*b;
        -nhập / : tính a/b;
        -kiểm tra ngoại lệ các số khi có số 0
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập a =");
            double a=sc.nextDouble();
        System.out.println("nhập b =");
            double b=sc.nextDouble();
        
        while (true) {
        System.out.println("mời nhập phép tính + - * /");
        Scanner scString=new Scanner(System.in);
        String nhap=scString.nextLine();
           switch (nhap) {
            case "+":
                cong(a, b);
                /*Lệnh return thoát khỏi toàn bộ phương thức (method) chứa vòng lặp đó, và do đó, thoát luôn cả vòng lặp while (true)
                  Lệnh break chỉ thoát khỏi vòng lặp while và tiếp tục các câu lệnh sau vòng lặp.  
                */
                return;
            case "-":
                tru(a, b);
                return;
            case "*":
                nhan(a, b);
                return;
            case "/":
                chia(a, b);
                return;  
            default:   
                System.out.println("nhập sai hãy nhập lại");
                break;
            }  
            
        }
             
      
    }
    public static void cong(double a,double b){
        double kq=a+b;
        System.out.println(kq);
        
    }
    public static void tru(double a,double b){
        double kq=a-b;
        System.out.println(kq);
    }
     public static void nhan(double a,double b){
        double kq=a*b;
        System.out.println(kq);
    }
     public static void chia(double a,double b){
        
            // if (b==0) {
            //     System.out.println("không thể chia cho số 0");
            //     System.out.println("mời nhập lại b");
            //         b=new Scanner(System.in).nextDouble();
            // }else {
            //     double kq=a/b;
            //     System.out.println(kq);
            // }
            while (true) {
                if (b==0) {
                System.out.println("không thể chia cho số 0");
                System.out.println("mời nhập lại b");
                    b=new Scanner(System.in).nextDouble();
                    double kq=a/b;
                     System.out.println(kq);    
                }else
                    break;
    }
}
}
