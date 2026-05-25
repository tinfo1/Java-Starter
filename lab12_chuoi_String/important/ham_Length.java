package lab12_chuoi_String.important;

import java.util.Scanner;

public class ham_Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.println(" mời nhập chuỗi ");
        n=sc.nextLine();
        System.out.println("-------------------------");
        //  hàm Length => trả về  độ dài chuỗi
        System.out.println(n.length());
        sc.close();
    }
}
