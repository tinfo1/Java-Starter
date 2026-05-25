package lab16_OOP.Enum.thoi_khoa_bieu;

public class mAin {
    public static void main(String[] args) {
        thoi_khoa_bieu d1 = new thoi_khoa_bieu(day.monday, "Van Su Dia");
        thoi_khoa_bieu d2 = new thoi_khoa_bieu(day.tuesday, "Toan ly Hoa");
        thoi_khoa_bieu d3 = new thoi_khoa_bieu(day.wednesday, "GDCD QP Tin");
        System.out.println("hello");
        System.out.println(d3.toString());
        System.out.println(d2.toString());
        System.out.println(d1.toString());
    
        String x = thang.thang_1.Songay();
        System.out.println(x);
    }
}
