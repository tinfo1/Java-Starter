package lab16_OOP.Enum.sinhvien;

import java.util.ArrayList;

public class test_enum {
    public static void main(String[] args) {
        System.out.println(Xeploai.kha.ordinal());
        System.out.println(Xeploai.yeu.ordinal());

        // tạo list ds
        ArrayList<sv> ds=new ArrayList<>();
        // tạo sv
        sv sv1=new sv(1, "Duc", 8.8);
        sv sv2=new sv(2, "Huynh", 5.4);
        sv sv3=new sv(3, "cuong", 3.2);
        sv sv4=new sv(4, "long", 4.8);
        sv sv5=new sv(5, "thu", 9.1);
        sv sv6=new sv(6, "hang", 7.3);
        // thêm vào ds
        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);
        ds.add(sv4);
        ds.add(sv5);
        ds.add(sv6);

        for (sv SV : ds) {
            System.out.println(SV);
        }

    }
}
