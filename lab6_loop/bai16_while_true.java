package lab6_loop;
//  bài 16 while true
public class bai16_while_true {
    public static void main(String[] args) {
        int n =0;
        while(true){
            n++;
            System.out.println("n ="+n);
            if(n==9)
                break;
        }
    }
}
