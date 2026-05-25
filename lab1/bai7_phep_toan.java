package lab1;
// bài 7 các phép toán cơ bản
public class bai7_phep_toan {
    public static void main(String[] args) {
        int x=11;
        int y=5;
        // phép cộng
        System.out.println(" a + b ="+ (x+y));
        // phép trừ
        System.out.println(" x - y ="+ (x-y));
        // phép nhân
        System.out.println(" x * y ="+ (x*y));
        // phép chia lấy dư
        System.out.println(" x % y ="+ (x%y));
        // phép chia 
        System.out.println(" a / y ="+ ((double)x/y));
        // gán biến
        int kq=x+y;
        System.out.println(kq);

        // bài tập
         //khởi tạo  biến
        int i1=2;
        int i2=5;
        int i3=-3;
        double d1=2.0;
        double d2=5.0;
        double d3=-0.5;
        //tính toán
        int a= i1+(i2*i3);
        int b= i1*(i2+i3);
        double c= (double) i1/(i2+i3);
        double e= (double) i1/i2+i3;
        double g= 3+4+(double)(5/3);
        double i= (double) (3+4+5)/3;
        double k= d1+(d2+d3);
        double l= d1+d2*d3;
        double m= d1/d2-d3;
        double n= d1/(d2-d3);
        double o= d1+d2+d3/3;
        double p= (d1+d2+d3)/3;
        double q= d1+d2+(d3/3);
        double r= 3*(d1+d2)*(d1-d3);
        //xuất ra màn hình
        System.out.println("a=" +a);
        System.out.println("b=" +b);
        System.out.println("c=" +c);
        System.out.println("e=" +e);
        System.out.println("g=" +g);
        System.out.println("i=" +i);
        System.out.println("k=" +k);
        System.out.println("l=" +l);
        System.out.println("m=" +m);
        System.out.println("n=" +n);
        System.out.println("o=" +o);
        System.out.println("p=" +p);
        System.out.println("q=" +q);
        System.out.println("r=" +r);


    }
}
