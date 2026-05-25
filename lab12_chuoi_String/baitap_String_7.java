package lab12_chuoi_String;

import java.util.Scanner;

public class baitap_String_7 {
    public static void main(String[] args) {
        /*
        viết ct kiểm tra xem chuỗi vừa nhập có phải palydrome hay không
        là chuỗi đảo ngược cùng bằng chính nó vd: madam,radar...
        */
       Scanner sc=new Scanner(System.in);
       System.out.println("input : ");
       String str=sc.nextLine();
       StringBuilder chuoidao=new StringBuilder(str);
       chuoidao.reverse();
       String output=chuoidao.toString();
       if (output.equalsIgnoreCase(str)) {
        System.out.println("đây là chuỗi polydrome: "+output);
       }else
            System.out.println("không phải ");


        sc.close();    

    }
}
