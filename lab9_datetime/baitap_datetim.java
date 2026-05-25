package lab9_datetime;

import java.util.Calendar;
import java.util.Scanner;

public class baitap_datetim {
    public static void main(String[] args) {
        // nhập ngày tháng năm và tính tuổi
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập ngày"); 
        int date=sc.nextInt();
        System.out.println("nhập tháng"); 
        int month=sc.nextInt();
        System.out.println("nhập năm"); 
        int year=sc.nextInt();

        // khởi tạo 
        Calendar birthday=Calendar.getInstance();
        // set ngày tháng năm sinh
        birthday.set(year,month-1,date);
        // xuất ngày tháng năm
        int namsinh  =birthday.get(Calendar.YEAR);
        int thangsinh =birthday.get(Calendar.MONTH);
        int ngaysinh =birthday.get(Calendar.DAY_OF_MONTH);
        System.out.println("ngày tháng năm sinh " + namsinh +" "+(thangsinh+1)+" " +ngaysinh );
        // tính tuổi
        // năm hiện tại
        Calendar now =Calendar.getInstance();
        int namhientai=now.get(Calendar.YEAR);
        // tính 
        int tuoi =namhientai-namsinh;
        System.out.println("tuổi của bạn là "+tuoi);

    }
}
