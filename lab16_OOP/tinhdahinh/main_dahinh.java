package lab16_OOP.tinhdahinh;

public class main_dahinh {
    public static void main(String[] args) {
        nhansu ns1=new phophong("le huynh duc", "Q12", 123559);
        System.out.println("ns1 đang lam pp");
        // lương phó phòng
        double luongns1=ns1.tinhluong(21);
        System.out.println(ns1.getTen()+ ns1.getCccd());
        System.out.println(luongns1);

        // thay đổi chức vụ
        ns1=new truongphong(ns1.getTen(),ns1.getCccd(),ns1.getQue());
        System.out.println("ns1 dang lam tp");
        System.out.println(ns1.getTen()+ns1.getCccd());
        // lương trưởng phòng
        System.out.println(ns1.tinhluong(21));
    }
}
