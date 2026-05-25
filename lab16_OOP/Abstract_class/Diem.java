package lab16_OOP.Abstract_class;

public class Diem extends Hinh {
    public Diem(ToaDo toaDo) {
        super(toaDo);
    }
    @Override
    public double tinhDienTich() {
        return 1;
    }
}
