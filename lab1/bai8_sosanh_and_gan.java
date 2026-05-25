package lab1;
// bài 8 : toán tử gán và so sánh
public class bai8_sosanh_and_gan {
    public static void main(String[] args) {
        // gán cộng
        int x=8;
        x+=5; // x=x+5;
        System.out.println(x);

        // gán trừ
        int x2=8;
        x2-=5; //x=x-5;
        System.out.println(x2);
        // gán nhân
        int x3=8;
        x3*=5;//x=x*5
        System.out.println(x3);

        // phép so sánh
        int a=7;
        int b=9;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);


        // bài tập
        int c = 6;
        int d = 2;
        float kq1 = c += 3f;
        float kq2 = c -=5f;
        float kq3 = c *=2f;
        float kq4 = c %= 5f;
        float kq5 = c -=(d + 7);
        System.out.println("A: " + kq1);
        System.out.println("B: " + kq2);
        System.out.println("C: " + kq3);
        System.out.println("D: " + kq4);
        System.out.println("E: " + kq5);
    }
}
