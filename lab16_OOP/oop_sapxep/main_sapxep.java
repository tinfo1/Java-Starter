package lab16_OOP.oop_sapxep;

import java.util.ArrayList;
import java.util.Collections;

public class main_sapxep {
    public static void main(String[] args) {
        //  tạo list 
        ArrayList<sanpham> ds=new ArrayList<>();
        // khởi tạo đối lượng sp
        sanpham sp=new sanpham("samsum", "1", 15);
        sanpham sp2=new sanpham("apple ", "2", 30);
        sanpham sp3=new sanpham("xiaomi", "3", 10);
        sanpham sp4=new sanpham("razer", "4", 12);
        ds.add(sp4);
        ds.add(sp);
        ds.add(sp2);
        ds.add(sp3);
        // xem ds sản phẩm
        for (sanpham sanpham : ds) {
            System.out.println(sanpham);
        }

        // gọi pt sắp xếp
        Collections.sort(ds);
        System.out.println("danh sach sp sau sap xep ");
        for (sanpham sanpham : ds) {
            System.out.println(sanpham);
        }
    }
}
