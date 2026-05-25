package lab1;
// bài 9 toán tử logic và toán tố ,hậu tố
public class bai9_logic_and_tiento_hauto {
    public static void main(String[] args) {
        int i=7;
        // phép &&
        System.out.println(i>0 && i<10);
        // phép ||
        System.out.println(i>0 ||i<10);
        // phủ định
        System.out.println(!(i<-1 ||i>10));

        // toán tử tiền tố , hậu tố
        int x=100;
        int y=90;
        int z=80;
        int t=70;
        x++;//postfix (cộng sau khi gán)
        ++y;//prefix (cộng trước rồi gán)
        z--;
        --t;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);

        int a=1;
        int b=2;
        int c=a++ - ++b +1;
        // thực hiện prefix -> các phép tính ->gán giá trị cho biến bên trái dấu = -> postfix
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
