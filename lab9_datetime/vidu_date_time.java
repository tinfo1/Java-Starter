package lab9_datetime;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class vidu_date_time {
    public static void main(String[] args) {
        //  hàm lấy thời gian hiện tại 
        long t1=System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println(".....");
        }
        long t2=System.currentTimeMillis();

        System.out.println("thời gian trước khi For chạy "+t1);
        System.out.println("thời gian sau khi For chạy "+t2);
        System.out.println("thời gian chạy " +(t2-t1)+" mls");
        System.out.println("thời gian chạy " +((t2-t1)/100)+" s");

        // TimeUnit
            // tính năm ra giây
        System.out.println("3000 year :"+TimeUnit.DAYS.toSeconds(3000*365)+ " s");

        System.out.println("1.3h = "+TimeUnit.MINUTES.toSeconds(78)+"s");

        // Date
            // cũ
        Date d= new Date(System.currentTimeMillis());
        System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/" +(d.getYear()+1900));
        // Calendar 
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));

        c.add(Calendar.HOUR, 30);
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
        c.add(Calendar.DATE, 30);
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));

        // DateFormat
            // cũ
        DateFormat df= new SimpleDateFormat();
        // System.out.println(df.format(d));
            // hiện tại
        df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(d));
    }
}
