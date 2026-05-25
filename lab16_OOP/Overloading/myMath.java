package lab16_OOP.Overloading;

public class myMath {

    // Overloading (nạp chồng phương thức) là một tính năng trong lập trình hướng đối tượng cho phép chúng ta định nghĩa nhiều phương thức cùng tên 
    // nhưng khác nhau về kiểu dữ liệu hoặc số lượng tham số. Điều này giúp tăng tính linh hoạt và khả năng tái sử dụng mã nguồn.
    public  int timMin(int a, int b) {
        return (a < b) ? a : b;
    }
    public double timMin(double a, double b) {
        return (a < b) ? a : b;
    }
    public double tinhTong(double a, double b) {
        return a + b;
    }
    public double tinhTong(double a[]) {
        double tong = 0;
        // khai bao vòng lặp for-each để tính tổng các phần tử trong mảng a
        // duyệt qua từng phần tử num trong mảng a và cộng nó vào biến tong
        for (double num : a) {
            tong += num;
        }
        return tong;
    }
}
