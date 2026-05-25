package lab12_chuoi_String.important;

import java.util.Scanner;

public class ham_getChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.println(" mời nhập chuỗi ");
        n=sc.nextLine();
        System.out.println("-------------------------");
        // hàm getChars(vị trí ban đầu, vị trí kết thúc)
        // mảng lưu vị trí, vị trí bắt đầu lưu của mảng 
        char arrayChar[] = new char[15];
        n.getChars(2, 5, arrayChar, 0);
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.println("giá trị của mảng tại "+ i + "là : "+ arrayChar[i]);
        }
        sc.close();
    }
}
