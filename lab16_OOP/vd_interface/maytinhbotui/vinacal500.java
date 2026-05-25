package lab16_OOP.vd_interface.maytinhbotui;

public class vinacal500  implements Imaytinhbotui {

    @Override
    public double cong(double a, double b) {
        return a+b;
    }

    @Override
    public double tru(double a, double b) {
        return a-b;
    }

    @Override
    public double nhan(double a, double b) {
        return a*b;
    }

    @Override
    public double chia(double a, double b) {
        if(b!=0){
            return a/b;
        }else{
            System.out.println("Lỗi: Không thể chia cho 0");
            return Double.NaN; // Trả về NaN để biểu thị lỗi
        }
        
    }
    
}
