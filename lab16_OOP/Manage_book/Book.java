package lab16_OOP.Manage_book;

public class Book {
    private String title;
    private double price;
    private author author;
    private int publicationDate;
    public Book(String title, author author, int publicationDate, double price) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    public author getAuthor() {
        return author;
    }
    public int getPublicationDate() {
        return publicationDate;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setAuthor(author author) {
        this.author = author;
    }
    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }
// hiển thị thông tin sách
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author.getName());
        System.out.println("Publication Date: " + publicationDate);
        System.out.println("Price: $" + price); 
    }
    // kiêm tra sách cùng năm xuất bản
    public boolean isSamePublicationYear(Book other) {
        return this.publicationDate == other.publicationDate;
    }
    // tính giá sau khi giảm giá
    public double calculateDiscount(double percentage) {
        if (percentage < 0 || percentage > 100) {
            // nếu phần trăm giảm giá không hợp lệ, ném ra ngoại lệ
            throw new IllegalArgumentException("Percentage must be between 0 and 100");
        }
        return price * (1 - percentage / 100);
    }
}
