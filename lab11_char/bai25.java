package lab11_char;

import java.util.Scanner;

// bài 25 kiểu ký tự char
public class bai25 {
    public static void main(String[] args) {
        // khởi tạo 
        char ch='a';
        char ch2=66;
        System.out.println(ch2);
        // khai báo
        char ch3;
        Scanner sc=new Scanner(System.in);
        System.out.println("mời nhập vào 1 ký tự");
        String s =sc.nextLine();
        char ch4=s.charAt(0);
        System.out.println("ký tự vừa nhập "+ch4);
        // so sánh 2 ký tự từ bảng ký tự ASI
        System.out.println(Character.compare('b', 'b'));
        System.out.println(Character.compare('a', 'b'));
        System.out.println(Character.compare('A', 'a'));

        // kiểm tra ký tự
        char ch5='1';
        char ch6='a';
        char ch7='A';
        char ch8=' ';

        System.out.println(Character.isDigit(ch5));// kt số
        System.out.println(Character.isLetter(ch6));//kt ký tự
        System.out.println(Character.isLowerCase(ch6));
        System.out.println(Character.isUpperCase(ch7));
        System.out.println(Character.isWhitespace(ch8));//khoảng trắng
    }
}
