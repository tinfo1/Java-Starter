package Java_collection_framework.collection.set.app_rut_tham_trung_thuong;

import java.util.Scanner;


public class app_rut_tham {
    public static void main(String[] args) {
        // thung_phieu_hashSet rt=new thung_phieu_hashSet();
        thung_phieu_treeSet rt=new thung_phieu_treeSet();
        Scanner sc=new Scanner(System.in);
        String luachon="";
        do {
            System.out.println("------------------------------");
            System.out.println("MENU");
            System.out.println("1. Thêm mã số dự thưởng");
            System.out.println("2. Xóa mã số dự thưởng");
            System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không");
            System.out.println("4. Xóa tất cả mã số dự thưởng");
            System.out.println("5. Số lượng mã số dự thưởng");
            System.out.println("6. Rút thăm trúng thưởng");
            System.out.println("7. In ra tất cả mã số dự thuỏng");
            System.out.println("0. Exit");
            
            System.out.println("nhap vao lua chon:");
            luachon=sc.nextLine();
            if (luachon .equals("1") ||luachon.equals("2")||luachon.equals("3")) {
                System.out.println("nhập vào mã số dự thưởng");
                String giatri=sc.nextLine();
                if(luachon.equals("1")){
                    rt.themphieu(giatri);
                }else if (luachon.equals("2")) {
                    rt.xoaphieu(giatri);
                }else if(luachon.equals("3"))
                    System.out.println("kiem tra ma so du thuong co hay khong ? "+rt.kiemtraphieu(giatri));
                } else if (luachon.equals("4")) {
                    rt.xoatatcaphieu();
                    System.out.println("da xoa tat ca ma so du thuong");
                }else if(luachon.equals("5")){
                    System.out.println("so luong ma so du thuong :"+rt.laysoluong());
                }else if(luachon.equals("6")){
                    System.out.println("ma so trung thuong la "+rt.rutmotphieu());
                }else if (luachon.equals("7")) {
                    System.out.println("các mã số dự thưởng");
                    rt.inthungphieu();
                }
        } while (!luachon.equals("0"));
        sc.close();
    }
}
