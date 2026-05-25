package lab12_chuoi_String;

import java.util.Scanner;

public class baitap_String_2 {
    public static void main(String[] args) {
        /*
        viết ct kiểm tra mật khẩu
        -mk có ít nhất 6 kí tự
        -mk chứa ít nhất 1 chữ cái ( hoa thường đều được)
        -mk chứa ít nhất 1 số
        -người dùng nhập mk sai 5 lần khóa đăng nhập và thoát
         */
        Scanner sc =new Scanner(System.in);
        String password="";
        // kiểm tra tính hợp lệ
        while (true) {
            System.out.println(" mời thiết lập password ");
            System.out.println(" password có ít nhất 6 ký tự và ít nhất 1 chữ cái, ít nhất 1 số. ");
            String pass=sc.nextLine();
            if (checkMK(pass)) {
                password=pass;
                System.out.println("password đã được thiết lập " + password);
                break;
            }else
                System.out.println("password không hợp lệ ");
        }
        // giới hạn số lần 
        int count=0;
        String login="";
        while (true) {
            // nhập mk login
            System.out.println("mời nhập pass");
            login=sc.nextLine();
            // so sánh 2 pass
            if (login.equals(password)) {
                System.out.println("nhập pass thành công "+login);
                break;
            }else{
                count++;
                System.out.println("sai pass " +count + " lần nhập");
            }
            if (count==5) {
                System.out.println("nhập quá 5 lần");
                break;
            }
        }
        sc.close();
    }
    // kiểm tra hợp lệ của mk 
    public static boolean checkMK(String password){
        // kiểm tra độ dài
        if (password.length()<6) {
            return false;
        }
        // kiểm tra mk chứa ít nhất 1 chữ cái ( hoa thường đều được)
        boolean hasletter=false;
        // tách password ra 1 mảng chứa từng kí tự
        for (char letter : password.toCharArray()) {
            if (Character.isLetter(letter)) {
                hasletter=true;
                break;
            }
        }
        if (hasletter==false) {
            return false;
        }
        // kiểm tra mk chứa 1 số
        boolean hasdigit=false;
        for (char num : password.toCharArray()) {
            if (Character.isDigit(num)) {
                hasdigit=true;
                break;
            }
        }
        if(hasdigit==false){
            return false;
        }
        return true;
    }
}
