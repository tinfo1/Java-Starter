package lab10_math;
//  bài 23 : math
public class bai23 {
    public static void main(String[] args) {
        System.out.println("PI = "+Math.PI);
        // phép trị tuyệt đối
        int a=8;
        System.out.println("trị tuyệt đối của |a| = "+Math.abs(a));
        // min/max
        System.out.println("Min(a,b) = "+Math.min(4,  7));
        System.out.println("Max(a,b) = "+Math.max(4,  7));
        // hàm ceiling (làm tròn lên)
        System.out.println("Ceiling của 3.2 = "+Math.ceil(3.2));
        // hàm floor (làm tròn xuống)
        System.out.println("Floor của 3.8 = "+Math.floor(3.8));
        // căn bậc 2 sqrt
        System.out.println(Math.sqrt(8));
        // lũy thừa a^b pow
        System.out.println(Math.pow(4, 2));
        // sin/cos.tan
        int goc=90;
        double sin=Math.sin(Math.PI*goc/180);
        double cos=Math.cos(Math.PI*goc/180);
        double tan=Math.tan(Math.PI*goc/180);
        System.out.println("sin 90"+ sin);
        System.out.println("cos 90"+ cos);
        System.out.println("tan 90"+tan );

    }
}
