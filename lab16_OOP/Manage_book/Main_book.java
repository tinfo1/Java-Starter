package lab16_OOP.Manage_book;

public class Main_book {
    public static void main(String[] args) {
        Date d1 = new Date(15, 8, 1995);
        Date d2 = new Date(20, 10, 1990);
        Date d3 = new Date(5, 5, 1980);

        author a1 = new author("Nguyen Van A", d1);
        author a2 = new author("Le Thi B", d3);
        author a3 = new author("Nguyen Van A", d2);

        Book b1 = new Book("Java Programming", a1, 2005, 29.99);
        Book b2 = new Book("Python Programming", a2, 2003, 150.0);
        Book b3 = new Book("C++ Programming", a3, 2005, 200.0);

        // hiển thị thông tin sách
        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();

        // kiểm tra sách cùng năm xuất bản
        System.out.println("b1 and b2 same publication yearr ? "+ b1.isSamePublicationYear(b2));
        System.out.println("b1 and b3 same publication yearr ? "+ b1.isSamePublicationYear(b3));
        System.out.println("b2 and b3 same publication yearr ? "+ b2.isSamePublicationYear(b3));
        // tính giá sau khi giảm giá
        System.out.println("Giá sau khi giảm 10% của b1: " + b1.calculateDiscount(10));
        System.out.println("Giá sau khi giảm 20% của b2: " + b2.calculateDiscount(20));
        System.out.println("Giá sau khi giảm 15% của b3: " + b3.calculateDiscount(15));
    }
}
