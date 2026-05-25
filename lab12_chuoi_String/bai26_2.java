package lab12_chuoi_String;

import java.util.Scanner;

public class bai26_2 {
    public static void main(String[] args) {
        /* nhập vào 1 chuỗi từ bàn phím 
        đếm ký tự trong chuỗi 
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời nhập vào chuỗi");
        String n=sc.nextLine();
        int demso=0;
        int deminhoa=0;
        int deminthuong=0;
        int demspace=0;
        for (int i = 0; i < n.length(); i++) {
            char s=n.charAt(i);
            if(Character.isLowerCase(s)){
                deminthuong++;
            }else if (Character.isUpperCase(s)) {
                deminhoa++;
            }else if (Character.isDigit(s)) {
                demso++;
            }else if(Character.isWhitespace(s)){
                demspace++;
            }
        }
        System.out.println("số lượng ký tự"+n.length());
        System.out.println("số lượng ký số "+demso);
        System.out.println("số lượng ký thường "+deminthuong);
        System.out.println("số lượng ký hoa "+deminhoa);
        System.out.println("số lượng ký space "+demspace);

        sc.close();
    }
}
