package lab16_OOP.congty;

public class congTy {
    public static void main(String[] args) {
        // nhanVien nv1=new nhanVien("Duc", "Q12", 123456789);
        // double luongnv1 = nv1.tinhLuong();
        // System.out.println("luong nv1 = "+luongnv1);

        // tạo nv hành chính
        nhanVienhanhchinh nvhc1=new nhanVienhanhchinh("hanh chinh 1", "bac ninh", 33333);
        double luonghc1=nvhc1.tinhLuong();
        System.out.println("luong nvhc1 = "+luonghc1);
        // tạo nv đi ca
        nhanViendica dc1=new nhanViendica("di ca 1", "da nang", 5555);
        double luongdc1=dc1.tinhLuong();
        System.out.println("luong dc1 = "+luongdc1);

        nhanViendica dc2=new nhanViendica("di ca 2 ", "ha noi", 66671, 1);
        double luongdc2=dc2.tinhLuong();
        System.out.println("luong dc2 = "+luongdc2);
        System.out.println("ca cua dc2 la "+dc2.ca);


    }
}
