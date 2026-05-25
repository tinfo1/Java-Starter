package lab15_hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class baitap_hashmap_1 {
    public static void main(String[] args) {
        HashMap<String,String> user=new HashMap<>();
        user.put("user1", "123456");
        user.put("user2", "123456");
        user.put("user3", "123456");
        user.put("user4", "123456");
        user.put("user5", "123456");
        user.put("user6", "123456");
        user.put("user7", "123456");
        user.put("user8", "123456");
        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("nhâp user ");
        String username=sc.nextLine();
        System.out.println("nhâp password");
        String pw=sc.nextLine();
        // kiểm tra
        if (!user.containsKey(username)) {
            // nếu không đúng key trong hashmap user thì user không tồn tại
            System.out.println("user không đúng");

        }else if (!user.get(username).equals(pw)) {
            // sai mật khẩu
            System.out.println("pass sai");
        }else {
            System.out.println("login thanh cong");
            break;
            }
        System.out.println("nhập lại");
        }
        sc.close();

    }
}
