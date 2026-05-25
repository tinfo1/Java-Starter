package lab7_Exception;
// bài 19: xử lý ngoại lệ
public class try_catch_finally {
    public static void main(String[] args) {
        int a=0;
        int b=10;
        try {
             int c=b/a;
             System.out.println(c);
        } catch (ArithmeticException e) {
           System.out.println("lỗi rồi code error");
           e.printStackTrace();
        } 
        finally {
            System.out.println("đây là finally, luôn được thực thi dù có lỗi hay không");   
        }
        System.out.println("đoạn code phía sau");
    }
  }