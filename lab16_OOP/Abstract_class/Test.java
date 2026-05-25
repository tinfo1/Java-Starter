package lab16_OOP.Abstract_class;

public class Test {
    public static void main(String[] args) {
        ToaDo toaDo = new ToaDo(5, 5);
        ToaDo toaDo2 = new ToaDo(7, 12);
        ToaDo toaDo3 = new ToaDo(3, 8);

        // Hinh hinh = new Hinh(toaDo);  //=> lỗi vì Hinh là lớp trừu tượng, không thể khởi tạo đối tượng từ lớp trừu tượng
        Hinh hinh1 = new HinhTron(toaDo2, 10);
        Hinh hinh2 = new HinhChuNhat(toaDo3, 8, 6);
        Hinh hinh3 = new Diem(toaDo);

        System.out.println("DT1  = " + hinh1.tinhDienTich());
        System.out.println("DT2  = " + hinh2.tinhDienTich());
        System.out.println("DT3  = " + hinh3.tinhDienTich());
    }
}
