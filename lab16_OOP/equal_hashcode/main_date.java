package lab16_OOP.equal_hashcode;

public class main_date {
    public static void main(String[] args) {
        date mydate = new date(10, 8, 2025);
        date mydate2 = new date(10, 8, 2025);
        date mydate3 = new date(16, 8, 2021);
        // System.out.println("Ngày: " + mydate.getDay());

        // mydate.setDay(32);
        // System.out.println("Ngày sau khi cập nhật: " + mydate.getDay());

        // System.out.println("Tháng: " + mydate.getMonth());
        // mydate.setMonth(14);
        // System.out.println("Tháng sau khi cập nhật: " + mydate.getMonth());
        // mydate.setMonth(11);
        // System.out.println("Tháng sau khi cập nhật: " + mydate.getMonth());

        // toString method
        System.out.println("Ngày tháng năm: " + mydate.toString());
        System.out.println("Ngày tháng năm: " + mydate2.toString());
        System.out.println("Ngày tháng năm: " + mydate3.toString());
        // equals method
        System.out.println("mydate có bằng mydate2 không? " + mydate.equals(mydate2));
        System.out.println("mydate có bằng mydate3 không? " + mydate.equals(mydate3));
        // hashCode method
        System.out.println("Hashcode của mydate: " + mydate.hashCode());
        System.out.println("Hashcode của mydate2: " + mydate2.hashCode());
        System.out.println("Hashcode của mydate3: " + mydate3.hashCode());
    }
}
