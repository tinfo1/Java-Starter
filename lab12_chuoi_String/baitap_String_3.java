package lab12_chuoi_String;

import java.util.Scanner;

public class baitap_String_3 {
    public static void main(String[] args) {
        /*
        viết ct chuyển mã tin nhắn
        a="abcdefghijklmnopqrstuvwxyz"
        b="zxcvbnmasdfghjklqwertyuiop"
         */
        // tạo bảng mã 
        String a="abcdefghijklmnopqrstuvwxyz";
        String b="zxcvbnmasdfghjklqwertyuiop";
        // nhập mess
        Scanner sc=new Scanner(System.in);
        System.out.println("input mess :");
            String input=sc.nextLine();
        // biến lưu tin nhắn 
            String output="";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            System.out.println(c);
            // tìm vị trí của kí tự trong chuỗi a
            int index =a.indexOf(c);
            // nếu ký tự không có trong chuỗi a thì in ra
            if (index== -1 ) {
                output+=c;
            }else
            // nếu ký tự có trong biến a thì lấy ra ký tự từ chuỗi b  tại vị trí tương ứng
            {
                output+=b.charAt(index);
            }
        }
        System.out.println("output mess = "+output);

        sc.close();
    }
}
