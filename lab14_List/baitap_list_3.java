package lab14_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baitap_list_3 {
    public static void main(String[] args) {
        /* viết ct trả lời các phép tính
        quest={"2+5+7=","5*10","sqrt(16)","12%2"}
         */
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>(List.of("2+5+7=","5*10=","sqrt(16=","12%2="));
        // list đáp á
        ArrayList<Float> dapan=new ArrayList<>(List.of(14f,50f,4f,6f));
        for (int i = 0; i < list.size(); i++) {
            System.out.println("question "+list.get(i));
            System.out.println("answer : ");
            float kq =sc.nextFloat();
          if (kq == dapan.get(i)) { 
                System.out.println("correct");
            } else {
                System.out.println("wrong");
            }
        }


    }
}
