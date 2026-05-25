package lab13_mang_Array;

import java.util.Arrays;

public class split_to_array {
    public static void main(String[] args) {

        // hàm split để cắt chuỗi String sang mảng array

        // cắt theo khoảng trắng
        String s = "xin chao cac ban, toi la tinfo";
        String a[]=s.split(" ");
        System.out.println("mảng "+ s+" split to array a = "+Arrays.toString(a));
        // cắt theo dấu phẩy
        String b[]=s.split(",");
        System.out.println("mảng "+ s +" split to array b = "+Arrays.toString(b));
        // cắt theo dấu phẩy và dấu chấm
        String x = "xin chao, toi ten la duc. rat vui duoc gap moi nguoi";
        String c[]=x.split("\\,|\\.");
        System.out.println("mảng "+x+ " split to array c = "+Arrays.toString(c));
        // cắt ra tên
        String sv="le huynh duc";
        String d[]=sv.split(" ");
        System.out.println("mảng d = "+Arrays.toString(d));
        System.out.println("lấy tên sv từ chuỗi "+sv +" ra từ array "+Arrays.toString(d) + " kq : "+d[d.length-1]);

    }
}
