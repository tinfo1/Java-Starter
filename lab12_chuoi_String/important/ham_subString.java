package lab12_chuoi_String.important;

public class ham_subString {
    public static void main(String[] args) {
        //  hàm subString dùng để cắt chuỗi con
        String s = "Xin chào các bạn mình là tinfoo";
        String s1 = s.substring(5);
        String s2 = s.substring(5,   20);
        System.out.println("s1 : "+s1);
        System.out.println("s2 : "+s2);
    }
}
