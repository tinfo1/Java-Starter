package lab12_chuoi_String.important;

import java.util.Scanner;

public class ham_charAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.println(" mời nhập chuỗi ");
        n=sc.nextLine();
        System.out.println("-------------------------");
        
        // hàm charAt(vitri) => lấy ra 1 ký tự tại vị trí  
        int dodai=n.length();
        for (int i = 0; i < dodai; i++) {
            System.out.println("Vi tri : "+i+" là : "+ n.charAt(i));
        }

        sc.close();
    }
}
