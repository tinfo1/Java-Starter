package lab12_chuoi_String.important;

public class ham_concat {
    public static void main(String[] args) {
        String s1 = "tin";
        String s2 = "foo";

        String s3 = s1+s2;
        // hàm concat nối chuỗi 
        String s4 = s1.concat(s2);
        
        System.out.println("s3 = "+ s3);
        System.out.println("s4 = "+ s4);
    }
}
