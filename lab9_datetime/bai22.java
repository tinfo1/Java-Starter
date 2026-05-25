package lab9_datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//  bài 22 : xem sửa và xuất ngày tháng năm
public class bai22 {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        System.out.println(cal);
        // lấy ngày tháng năm
        int nam=cal.get(Calendar.YEAR);
        int thang=cal.get(Calendar.MONTH)+1;
        int ngay=cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(nam);
        System.out.println(thang);
        System.out.println(ngay);
        // đặt ngày tháng năm theo ý muốn
        cal.set(Calendar.YEAR,1999);
        cal.set(Calendar.MONTH,10);// tháng chỉ chạy từ 0-11
        cal.set(Calendar.DAY_OF_MONTH,25);
        // kt ngày tháng sau khi set
        int namsinh=cal.get(Calendar.YEAR);
        int thangsinh=cal.get(Calendar.MONTH);
        int ngaysinh=cal.get(Calendar.DAY_OF_MONTH);
        // xuất kq
        System.out.println("ngày tháng năm sinh là "+ namsinh + " "+(thangsinh+1) +" "+ngaysinh);
        //  xuất theo định dạng mong muốn
        SimpleDateFormat dinhdang=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        Date d=cal.getTime();
        String s= dinhdang.format(d);
        System.out.println(s);
    }
}
