package lab12_chuoi_String;

public class baitap_String_4 {
    public static void main(String[] args) {
        /*
        cho chuỗi a="tôi chăm chỉ tôi đẹp trai";
        đếm từ tôi trong chuỗi
         */
        String a="tôi chăm chỉ tôi đẹp trai";
        // tách chuôi
        String[] n = a.split(" ");
        
        // khởi tạo biến đếm 
        int count=0;
        // duyệt từng từ trong mảng tách ra
        for (String string : n) {
            if(string.equals("tôi")==true){
                count++;
            }
        }
        System.out.println("số lượng từ tôi là : "+count);
    }
}
