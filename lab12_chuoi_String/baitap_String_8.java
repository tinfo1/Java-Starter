package lab12_chuoi_String;

import java.util.Scanner;

public class baitap_String_8 {
    public static void main(String[] args) {
        /*
        nhập 1 chuỗi và tối ưu hóa chuỗi 
        1. không khoảng trắng dư thừa
        2. các từ cách nhau 1 khảng trắng 
        3. ký tự đầu tiên mỗi từ phải in hoa
        */
       Scanner sc=new Scanner(System.in);
       System.out.println("input");
       String input=sc.nextLine();
       System.out.println(chuanhoa(input));


       sc.close();
    }
public static String chuanhoa(String input){
    // loại bỏ khoảng trắng ở đầu và cuối chuỗi
    input=input.trim();
    // tách các từ trong chuỗi theo khoảng trắng ra mảng 
    String[] words=input.split("\\s+");
    for (int i = 0; i < words.length; i++) {
       words[i]=words[i].toLowerCase();
       String firstchar=words[i].substring(0,1);
       firstchar=firstchar.toUpperCase();
        words[i]=firstchar+words[i].substring(1);
    }
    return String.join(" ",words);
}
}
