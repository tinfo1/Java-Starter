package lab3_if_else;

import java.util.Scanner;

public class bai_11_ptb2 {
    // pt bậc 2  ax2 + bx+c =0
    /*
        ax^2 + bx + c = 0
         a = 0 => pt bậc 1
            nếu a=0 ptb1 bx+c=0 
             -> nếu b!=0 pt có nghiệm x=-c/b
             -> nếu b=0 và c=0 pt có vô số nghiệm
             -> nếu b=0 và c!=0 pt vô nghiệm
         a!=0 => pt bậc 2
            tìm delta = b^2 - 4ac
            nếu delta <0 -> vô nghiệm
            nếu delta ==0 -> nghiệm kép x1=x2=x=-b/2*a
            nếu delta >0 -> 2 nghiệm phân biệt x1=(-b+sqrt(delta))/2a 
                                               x2=(-b-Math.sqrt(delta))/(2*a)             
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("mời nhập A = ");
        double a=sc.nextDouble();
        System.out.println("mời nhập B = ");
        double b=sc.nextDouble();
        System.out.println("mời nhập C = ");
        double c=sc.nextDouble();

        System.out.println("giải pt bậc 2" + a+"x^2 + "+b+"x + "+c+"=0");
        // logic : nếu a=0 ptb1.tìm delta -> nếu delta <0 -> vô nghiệm -> nếu delta ==0 -> nghiệm kép x1=x2=x=-b/2*a ->2 nghiệm phân biệt
        if (a==0) {
            System.out.println("a = 0 giải pt bậc 1 "+b+"x + "+c+"=0");
            if(b==0&&c==0){
                System.out.println("pt co vo so nghiem");
            }else if(b==0 && c!=0||b!=0 && c==0){
                System.out.println("pt vô nghiem");
            }
            else {
                double x0=-c/b;
                System.out.println("pt có nghiem  x= "+ x0);
            }   
        }else{ 
        System.out.println("giai pt bac 2");
        double delta=Math.pow(b, 2)-(4*a*c);
        if (delta<0) {
            System.out.println("PT vo nghiem");
        } else if (delta==0) {
            double x =-b/(2*a);
            System.out.println("pt co nghiem kep x1=x2="+x);
        } else {
            double x1=(-b+Math.sqrt(delta))/(2*a);
            double x2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("pt có 2 nghiệm phân biệt ");
            System.out.println("x1 = "+ x1);
            System.out.println("x2 = "+ x2);

        }
        }   
        sc.close(); 
        
    }
}
