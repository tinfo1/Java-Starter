package lab12_chuoi_String;

public class baitap_String_1 {
    public static void main(String[] args) {
        /*  
        String = "English = 78 Science = 83 Math = 68 History = 65
        1. Tính tổng  các số trong chuỗi
        2. Tính trung bình cộng 
         */
        String str= "English = 78 Science = 83 Math = 68 History = 65";
        int sum= 0; // biến tổng
        int count =0;// biến đếm 
        //  tách chuỗi ra thành từng phần tử ra mảng
        String[] part =str.split(" "); 
         
        // duyệt mảng bằng for-each 
        for (String st : part) {
            System.out.println(st);
            // nếu là số thì cộng và đếm tăng 
            try {
                // chuyển ký tự trong chuỗi sang số nguyên bằng parsInt() thường dùng trong javas
                int num =Integer.parseInt(st);
                // tính tổng các số
                sum=sum+num;
                count++;
            } catch (NumberFormatException e) {
                // nếu không là số thì bỏ qua
            }
        }
        // tính TBC 
        double tbc=(double)sum/count;
        System.out.println("tổng các số là "+ sum);
        System.out.println("Trung bình cộng = " +tbc);
    }
}
