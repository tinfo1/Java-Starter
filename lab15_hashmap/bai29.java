package lab15_hashmap;

import java.util.HashMap;

public class bai29 {
    public static void main(String[] args) {
         // 1.khai báo của hashmap
    HashMap<Integer,String> map = new HashMap<>();
    HashMap<Integer,Float> map2=new HashMap<>();
    // 2. thêm phần tử Hashmap
        map.put(1,"hihi");
        map.put(2,"haha");
        map.put(3,"hoho");
    // 3.lấy giá trị phần tử
        String value =map.get(1);
        String value2 =map.get(2);
        String value3 =map.get(3);
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);
    // 4.xóa pt khỏi hashmap
        map.remove(2);
        System.out.println(map.get(2));
    // 5. kt phần tử có tồn tại hay không
        boolean check=map.containsKey(4);
        System.out.println("kq =" +check);
    // 6.kt xem 1 giá trị có tồn tại hay không
        boolean checkvl=map.containsValue("huhu");
        System.out.println("kq = "+checkvl);
    // 7.kt hashmap có rỗng hay không
        boolean bien=map.isEmpty();
        System.out.println(bien);
    // 8.lấy số lượng pt trong hashmap
        int soluong=map.size();
        System.out.println(soluong);
    // 9.duyệt hashmap
        for (Integer key : map.keySet()) {
            String vl =map.get(key);
            System.out.println(key + " : "+vl);
        }
    }
   
}
