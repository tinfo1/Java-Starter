package lab5_switch_case;

import java.util.Scanner;

public class timSongaycuathang {
    // bài 12 : tìm số ngày của tháng
    /*
    Viết chương trình Java để nhập vào một tháng (dưới dạng số nguyên) và in ra số ngày của tháng đó. 
    Sử dụng câu lệnh switch-case để giải quyết bài toán này. Lưu ý rằng tháng 2 có thể có 28 hoặc 29 ngày tùy thuộc vào năm nhuận.
    */
    public static void main(String[] args) {
        // khai báo biến Scanner để nhập dữ liệu từ bàn phím
        Scanner sc=new Scanner(System.in);
        // khai báo biến boolean để kiểm tra điều kiện nhập đúng tháng hay không
        boolean check=true;
        while (check) {
        System.out.println("mời nhập vào tháng : ");
        int month=sc.nextInt();
        // logic nếu tháng nhập vào không hợp lệ thì yêu cầu nhập lại
            if (month<1 || month >12) {
                System.out.println("tháng không hợp lệ, mời nhập lại");
                // sử dụng continue để quay lại đầu vòng lặp và yêu cầu nhập lại tháng
                continue;
            }
        // nếu tháng nhập vào hợp lệ thì yêu cầu nhập năm để xác định số ngày của tháng 2
        System.out.println("mời nhập vào năm : ");
        int year=sc.nextInt();

        // logic sử dụng switch case để tìm số ngày của tháng, nếu tháng 2 thì tìm năm nhuận để xác định số ngày của tháng 2
        switch (month) {
            case 1,3,5,7,8,10,12:
                System.out.println("tháng "+month+" có 31 ngày");
                // gán giá trị false cho biến check để thoát khỏi vòng lặp nếu nhập đúng tháng
                check=false;
                break;
            case 4,6,9,11:
                System.out.println("tháng "+month+" có 30 ngày");
                check=false;
                break;
            case 2:
                if (year%4==0 && (year%100!=0 || year%400==0)) {
                    System.out.println( year+" là năm nhuận, tháng "+month+" có 29 ngày");
                } else {
                    System.out.println( year+" không phải là năm nhuận, tháng "+month+" có 28 ngày");
                }
                check=false;
                break;
    }
    sc.close();
}
}
}