package lab14_List;
//  bài 28 : collection

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bai28 {
    public static void main(String[] args) {
    // 1 khai báo ArrayList
    ArrayList<Integer> list = new ArrayList<>();
    // 1.1 khai báo số lượng Arraylist
    ArrayList<Double> list2= new ArrayList<>(5);
    // 1.2 khởi tạo list các phần tử ban đầu
    ArrayList<Integer> list3=new ArrayList<>(List.of(1,3,4,5,6,7));

    // xuất list
    System.out.println(list);
    System.out.println(list2);
    System.out.println(list3);
    
    // 2 Add thêm pt
    ArrayList<Integer> list4 = new ArrayList<>();
    // 2.1 add
    list4.add(99);
    list4.add(20);
    list4.add(10);
    System.out.println("add list4 : "+list4);
    
    // 2.2  size() trả về số lượng phần tử
    System.out.println("số lương ptu list4 =" +list4.size());

    // 2.3 trả về giá trị list tại vị trí index :  get(int index)
        System.out.println(list4.get(2));

    // 2.4 remove(index) xóa theo vị trí index
    list4.remove(2);
    System.out.println("list4 sau khi remove : "+list4);
    // remove 1 phần tử 
    ArrayList<Double> list5=new ArrayList<>(List.of(1.1,1.2,1.3,1.4,1.5,1.6,1.4));
    System.out.println("list5 = " + list5);
    list5.remove(Double.valueOf(1.4));
    System.out.println("list5 sau remove = "+list5);

    // 2.5 thay đổi giá trị phần tử set(index element)
    ArrayList<Integer> list6=new ArrayList<>(List.of(1,3,4,5,6,7));
    System.out.println("list6 :"+list6);
    list6.set(2, 99);
    System.out.println("list6 sau khi set "+list6);

    // 2.6 kt pt có tồn tại không contain()
    ArrayList<Integer> list7=new ArrayList<>(List.of(1,3,4,5,6,7));
    boolean kt=list7.contains(7);
    System.out.println(kt);
    
    // 2.7 sắp xếp tăng dần collection.sort(list)
    ArrayList<Integer> list8=new ArrayList<>(List.of(13,3,54,5,6,27));
    Collections.sort(list8);
    System.out.println("list6 sau khi sort "+list8);

    // 2.8 tìm vị trí đầu tiên của phần tử  indexof()
    ArrayList<Integer> list9=new ArrayList<>(List.of(1,3,4,5,6,7));
    System.out.println("kt ptu trong list9 là "+list9.indexOf(4));

    // 3 Duyệt list
    // cách 1 
    ArrayList<Integer> list10=new ArrayList<>(List.of(1,3,4,5,6,7));
        System.out.println("list10 dùng duyệt for "+list10);
        for (int vl : list10) {
            System.out.println(vl);
        }

        System.out.println("--------------------------------------------");
    // cách 2 khi cần sử dụng các chỉ số index
    ArrayList<Integer> list11=new ArrayList<>(List.of(1,3,4,5,6,7)); 
        for (int i = 0; i < list11.size(); i++) {
            int vl=list11.get(i);
            System.out.println("gia tri list11 : "+vl);
        }
    }
}

