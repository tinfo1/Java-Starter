package break_continue_return;

public class continue1 {
    public static void main(String[] args) {
        // continue dùng để skip (bỏ qua) vòng lăp (for, while, do-while) 
        for (int i = 1; i <= 10; i++) {
            if (i%2==0) {
                continue;
            }
            System.out.println(i);
        }
            // continue với label (đặt tên cho vòng lặp) để bỏ qua vòng lặp ngoài
        outer: for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i==3 && j==3) {
                    continue outer;
                }
                System.out.println(i+" "+j);
            }       
       }
    }
}