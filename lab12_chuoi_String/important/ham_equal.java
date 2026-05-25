package lab12_chuoi_String.important;

public class ham_equal {
    public static void main(String[] args) {
        String n = "huynhduc";
        String m = "huynhduc";
        String s = "HUYNHDUC";
        // hàm equal so sánh 2 chuỗi giống nhau, phân biệt hoa thường
        System.out.println("n equals m :"+n.equals(m));
        System.out.println("n equals s :"+n.equals(s));
        //  hàm equalsIgnoCase, so sánh không phân biệt hoa thường
        System.out.println("n IgnoCase s : "+n.equalsIgnoreCase(s));
        System.out.println("n IgnoCase m : "+n.equalsIgnoreCase(m));
    }
}
