package lab14_List;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class baitap_list_4 {
    public static void main(String[] args) {
        // khởi tạo list
        ArrayList<Integer> list = new ArrayList<>();
        // nhập 
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap");
        int n  = sc.nextInt();
        // khởi tạo đối tượng ngẫu nhiên 
        Random rd = new Random();
        // duyệt và add vào list
        for (int i = 0; i < n; i++) {
           int  songaunhien =rd.nextInt(200);
           list.add(songaunhien);
        }
        // xuất các phần tử ra màn hình
        System.out.println("các phần tử chuỗi là");
        System.out.println(list);
        //  có bao nhiêu pt nho hơn 80
        int dem=0;
        String vitri="";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<80) {
                dem++;
                vitri+= i+" ";
            }
        }
        if (dem==0) {
            System.out.println("khong co pt nho hon 80");
        }else{
            System.out.println("so luong phan tu nho hon 80 la " + dem);
            System.out.println("vi tri index cua pt la "+vitri);

        }
    }
}
