package lab12_chuoi_String.important;

import java.util.Scanner;

public class ham_getByte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.println(" mời nhập chuỗi ");
        n=sc.nextLine();
        System.out.println("-------------------------");
        // hàm getbyte(vitri) => có 3 cách lấy ra vị trí của các ký tự thành một mảng từ bảng ASCII
        byte arraybyte[] =n.getBytes();
        for (byte b : arraybyte) {
            System.out.println(b);
        }
        sc.close();
    }
}
