package lab3_if_else;

import java.util.Scanner;

public class bai_11_timquytrongnam {
    // tìm quý trong năm
    /*
    1 năm có 4 quý chia đều cho 12 tháng
        quý 1: tháng 1,2,3
        quý 2: tháng 4,5,6
        quý 3: tháng 7,8,9
        quý 4: tháng 10,11,12
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        // logic 1 năm 4 quý chia đều cho 12 tháng
        while (true) {
        System.out.println("nhập tháng ");
        int month=sc.nextInt();
        if(month ==1 ||month==2||month==3){
            System.out.println("tháng "+ month+" quý 1");
            break;
        }else if (month==4||month==5||month==6) {
               System.out.println("tháng "+ month+" quý 2");
            break;
        } else if (month==7||month==8||month==9){
             System.out.println("tháng "+ month+" quý 3");
             break;
        } else if (month==10||month==11||month==12) {
             System.out.println("tháng "+ month+" quý 4");  
            break;
        } else {
        System.out.println("nhap sai thang");
        }
        }
      sc.close();
    }
}