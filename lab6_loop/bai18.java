package lab6_loop;
//  bài 18: break và continue
public class bai18 {
    public static void main(String[] args) {

        // tính tổng từ 1 đến 5 nhưng bỏ qua 3
        int tong=0;
        for (int i = 0; i <=5; i++) {
            if(i==3){
                continue;
            } tong+=i;

        }
        System.out.println(tong);
        int n=0;
        while (n<100) {
            System.out.println("n ="+n);
            if (n==15) 
                break;
           
            n++;
            
        }
    }
}
