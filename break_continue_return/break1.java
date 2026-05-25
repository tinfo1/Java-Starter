package break_continue_return;
public class break1 {
    public static void main(String[] args) {
        // break dùng để thoát khỏi vòng lặp for, while, do-while
        for (int i = 1; i <= 10; i++) {
            if (i==5) {
                break;
            }
            System.out.println(i);
        }
        // break với label (đặt tên cho vòng lặp) để thoát khỏi vòng lặp ngoài
        outer: for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i==3 && j==3) {
                    break outer;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
