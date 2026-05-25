package lab16_OOP.Film;

public class main_film {
    public static void main(String[] args) {
        Date date1 = new Date(12, 5, 2020);
        Date date2 = new Date(20, 10, 2021);
        Date date3 = new Date(1, 1, 2022);

        Company company1 = new Company("Company A", "Viet Nam");
        Company company2 = new Company("Company B", "USA");
        Company company3 = new Company("Company C", "Japan");

        Film film1 = new Film("Film 1", date1, company1, 2020, 10.0);
        Film film2 = new Film("Film 2", date2, company2, 2021, 15.0);
        Film film3 = new Film("Film 3", date3, company3, 2022, 20.0);

        // So sánh giá vé của film1 với film2
        System.out.println("Film 1 has a higher ticket price than Film 2: " + film1.checkpriceWotherFilm(film2));
        System.out.println("Film 1 has a higher ticket price than Film 3: " + film1.checkpriceWotherFilm(film3));
        System.out.println("Film 3 has a higher ticket price than Film 2: " + film3.checkpriceWotherFilm(film2));

        // Lấy tên công ty sản xuất của film3
        System.out.println("The company that produced Film 3 is: " + film3.getNameComp());

        // Tính giá vé sau khi giảm giá 20% cho film2
        System.out.println("The ticket price of Film 2 after a 20% discount is: " + film2.priceAfterDiscount(20));
        System.out.println("The ticket price of Film 3 after a 10% discount is: " + film3.priceAfterDiscount(10));
        System.out.println("The ticket price of Film 1 after a 5% discount is: " + film1.priceAfterDiscount(5));
    }
}
