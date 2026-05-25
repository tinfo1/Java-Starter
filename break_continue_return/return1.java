package break_continue_return;

public class return1 {
    public static void main(String[] args) {
        // return dùng để thoát khỏi phương thức hiện tại ở đây là (main) và trả về giá trị nếu có
        for (int i = 1; i <= 10; i++) {
            if (i==5) {
                return;
            }
            System.out.println(i);
            
        }

    }
}
