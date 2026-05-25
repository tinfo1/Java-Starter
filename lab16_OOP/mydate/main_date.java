package lab16_OOP.mydate;

public class main_date {
    public static void main(String[] args) {
        date mydate = new date(15, 8, 2021);

        System.out.println("Ngày: " + mydate.getDay());

        mydate.setDay(32);
        System.out.println("Ngày sau khi cập nhật: " + mydate.getDay());

        System.out.println("Tháng: " + mydate.getMonth());
        mydate.setMonth(14);
        System.out.println("Tháng sau khi cập nhật: " + mydate.getMonth());
        mydate.setMonth(11);
        System.out.println("Tháng sau khi cập nhật: " + mydate.getMonth());

        // toString method
        System.out.println("Ngày tháng năm: " + mydate.toString());
    }
}
