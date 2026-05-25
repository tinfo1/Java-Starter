package lab5_switch_case;

import java.util.Scanner;

//  bài 13: switch case
public class bai13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("mời nhập số n ");
        int n =sc.nextInt();
        // logic tìm số dư , nếu số dư = 0 -> số chẵn -> số lẻ
        int x=n%2;
        switch (x) {
            case 0:
                System.out.println("là số chẵn");
                break;
            default:
                System.out.println("là số lẻ");
                break;
        }
        // khai báo biến boolean để kiểm tra điều kiện nhập đúng thứ trong tuần hay không
        boolean dayofweek=true;
        // sử dụng vòng lặp while để kiểm tra điều kiện nhập đúng thứ trong tuần hay không nếu sai sẽ yêu cầu nhập lại
        while (dayofweek) {
             System.out.println("mời nhập thứ trong tuần ");
        int day =sc.nextInt();
        /*
        logic : 1 nếu nhập đúng thứ trong tuần thì in ra thứ trong tuần tương ứng 
                2 gán giá trị false cho biến dayofweek để thoát khỏi vòng lặp nếu nhập sai sẽ yêu cầu nhập lại
         */
        switch (day) {
            case 1:
                System.out.println("thứ 2");
                dayofweek=false;
                break;
            case 2:
                System.out.println("thứ 3");
                dayofweek=false;
                break;
            case 3:
                System.out.println("thứ 4");
                dayofweek=false;
                break;
            case 4:
                System.out.println("thứ 5");
                dayofweek=false;    
                break;
            case 5:
                System.out.println("thứ 6");
                dayofweek=false;    
                break;
            case 6:
                System.out.println("thứ 7");
                dayofweek=false;
                break;
            case 7:
                System.out.println("chủ nhật");
                dayofweek=false;
                break;
            default:
                System.out.println("nhập sai thứ trong tuần");
                System.out.println("mời nhập lại thứ trong tuần");
            }
        }
        sc.close();
    }
}
