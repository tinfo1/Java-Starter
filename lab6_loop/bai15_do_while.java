package lab6_loop;


// bài 15 do while loop
public class bai15_do_while {
    public static void main(String[] args) {
   
        int a=1;
        int tong=0;
        do {
            System.out.println(tong+"+"+a);
            tong+=a;
            a++;
        } while (a<=7);
        System.out.println("tong = "+tong);
        // bảng cửu chương
        int i=1;
        do {
            System.out.println("bảng cửu chương "+i);
            int j=1;
            do {
                System.out.println(i+" x "+j+" = "+(i*j));
                j++;
            } while (j<=10);
            i++;
        } while (i<=10);
    }
}
