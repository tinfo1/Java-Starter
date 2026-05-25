package lab16_OOP.quanLydiem;

public class khoatoan  extends namHoc2025{

    public khoatoan(String ten, int cccd) {
        super(ten, cccd);
    }
  // override
    @Override
    public void tinhDTB() {
         System.out.println("day là diem trung binh khoa toan ");
    }
}
