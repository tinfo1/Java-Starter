package lab12_chuoi_String.important;

public class ham_compareto {
    public static void main(String[] args) {
        
        // hàm compareto => so sánh > < = dựa trên bảng mã ASCII
        String sv1 ="nguyen van a ";
        String sv2 ="nguyen van b ";
        String sv3 ="nguyen van ";
        String sv4 ="nguyen van a ";
        System.out.println("sv1 compareto sv2 "+sv1.compareTo(sv2));
        System.out.println("sv1 compareto sv3 "+sv1.compareTo(sv3));
        System.out.println("sv1 compareto sv4 "+sv1.compareTo(sv4));
        // hàm comparetoIgnoCase => tương tự compareto nhưng không phân biệt hoa thường
        System.out.println("sv1 compareToIgnoreCase sv2 "+sv1.compareToIgnoreCase(sv2));
        System.out.println("sv1 compareToIgnoreCase sv3 "+sv1.compareToIgnoreCase(sv3));
        System.out.println("sv1 compareToIgnoreCase sv4 "+sv1.compareToIgnoreCase(sv4));
        
    }
}
