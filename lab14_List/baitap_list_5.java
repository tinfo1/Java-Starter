package lab14_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class baitap_list_5 {
    public static void main(String[] args) {
        ArrayList<Integer> lst=new ArrayList<>(List.of(1,9,3,14,5,27,8));
        // tạo 1 list giống với list ban đầu
        ArrayList<Integer> copy=new ArrayList<>(lst);
            System.out.println(copy);
            // sắp xếp
            Collections.sort(copy);
            System.out.println("list sau sắp xếp "+copy);

            // in ra số nhỏ thứ 2 và số lớn thứ 2 
            int solont2=copy.get(copy.size()-2);
            int sonhot2=copy.get(1);
            System.out.println("so lon t2 trong list "+solont2);
            System.out.println("so nho t2 trong list "+sonhot2);
            // vi tri index trong list
            System.out.println("vi tr cua so lon t2 trong list "+lst.indexOf(solont2));
            System.out.println("vi tr cua so nho t2 trong list "+lst.indexOf(sonhot2));


    }
}
