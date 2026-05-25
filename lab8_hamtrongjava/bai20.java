package lab8_hamtrongjava;

public class bai20 {
    public static void main(String[] args) {
        int tong=tong(1, 2, 3);
        System.out.println(tong);
        Gioitinh("male");
        Gioitinh("female");
        Gioitinh("sđasad");
    }



    // hàm trả về phải có thành phần khai báo 
    public static int tong(int x,int y,int z){

        return x+y+z;
    }


    // hàm thủ tục
    public static void Gioitinh(String gt){
        if (gt.equals("male")) {
            System.out.println("tôi là nam");
         }else if (gt.equals("female")) {
            System.out.println("tôi là nữ");
         } else 
                System.out.println("bạn nhập sai");
    }
}
