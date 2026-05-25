package lab16_OOP.Computer;

public class main_computer {
    public static void main(String[] args) {
        Date date = new Date(1, 1, 2020);
        Date date1 = new Date(2, 2, 2021);
        Date date2 = new Date(3, 3, 2022);

        Country country = new Country("Viet Nam", "VN");
        Country country1 = new Country("USA", "US");
        Country country2 = new Country("Japan", "JP");

        Company company = new Company("Company A", country);
        Company company1 = new Company("Company B", country1);
        Company company2 = new Company("Company C", country2);

        Computer computer = new Computer(company, date, 1000, 2);
        Computer computer1 = new Computer(company1, date1, 1500, 3);
        Computer computer2 = new Computer(company2, date2, 2000, 4);    

        // So sánh giá của computer với computer
        System.out.println("Computer 1 has a higher price than Computer 2: " + computer.checkPriceWithOtherComputer(computer1));
        System.out.println("Computer 1 has a higher price than Computer 3: " + computer.checkPriceWithOtherComputer(computer2));
        System.out.println("Computer 3 has a higher price than Computer 2: " + computer2.checkPriceWithOtherComputer(computer1));
        // Lấy tên quốc gia của computer1
        System.out.println("The country of Computer 1 is: " + computer.getCountryName());
        System.out.println("The country of Computer 2 is: " + computer1.getCountryName());
        System.out.println("The country of Computer 3 is: " + computer2.getCountryName());
    }
}
