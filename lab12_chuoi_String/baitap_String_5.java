package lab12_chuoi_String;

import java.util.Scanner;

public class baitap_String_5 {
    public static void main(String[] args) {
        /*
        viêt ct tách chữ và số từ chuỗi nhập vào thành 2 chuỗi 
        */
       Scanner sc=new Scanner(System.in);
       System.out.println("input = ");
       String input = sc.nextLine();
       StringBuilder chu=new StringBuilder();
       StringBuilder so=new StringBuilder();
        //  duyệt chuỗi
        for (int i = 0; i < input.length(); i++) {
            char c =input.charAt(i);
            if (Character.isDigit(c)) {
                so.append(c);
            }else if (Character.isLetter(c)) {
                chu.append(c);
            }
        }
        System.out.println("output words = "+ chu);
        System.out.println("output num = "+ so);


        sc.close();
    }
}
