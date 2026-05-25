package lab16_OOP.Abstract_class;

public class HinhTron extends Hinh {
    private int banKinh;

    public HinhTron(ToaDo toaDo, int banKinh) {
        super(toaDo);
        this.banKinh = banKinh;
    }

    public int getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(int banKinh) {
        this.banKinh = banKinh;
    }
    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
}
