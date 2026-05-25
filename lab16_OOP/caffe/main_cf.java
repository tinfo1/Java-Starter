package lab16_OOP.caffe;

public class main_cf {
    public static void main(String[] args) {
        // Tạo các hóa đơn cà phê
        hoaDoncaffe hd1 = new hoaDoncaffe("Caffe trung nguyên", 100000, 1.5);
        hoaDoncaffe hd2 = new hoaDoncaffe("Caffe trung nguyên", 100000, 5);
        // Tính tổng tiền của mỗi hóa đơn
        System.out.println("Tổng tiền của hóa đơn 1: " + hd1.tongtien());
        System.out.println("Tổng tiền của hóa đơn 2: " + hd2.tongtien());
        // Kiểm tra khối lượng cà phê
        System.out.println("Hóa đơn 1 có khối lượng lớn hơn 1 kg: " + hd1.checkKhoiLuong(1));
        System.out.println("Hóa đơn 2 có khối lượng lớn hơn 1 kg: " + hd1.checkKhoiLuong(1));
        // Kiểm tra tổng tiền có lớn hơn 500k hay không
        System.out.println("Hóa đơn 1 có tổng tiền lớn hơn 500k: " + hd1.checkTongtienlonhon500k());
        System.out.println("Hóa đơn 2 có tổng tiền lớn hơn 500k: " + hd2.checkTongtienlonhon500k());
        // Tính giảm giá nếu tổng tiền lớn hơn 500k
        System.out.println("giam gia cua hoa don 1 : "+hd1.giamGia(10));
        System.out.println("giam gia cua hoa don 2 : "+hd2.giamGia(10));
        // Tính số tiền phải thanh toán sau khi giảm giá
        System.out.println("Số tiền phải thanh toán của hóa đơn 1 sau khi giảm gia : " + hd1.thanhToan(15));
        System.out.println("Số tiền phải thanh toán của hóa đơn 2 sau khi giảm gia : " + hd2.thanhToan(15));

    }
}
