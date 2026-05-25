package lab13_mang_Array;

import java.util.Arrays;

public class Mang_array_2 {
    public static void main(String[] args) {
        int a[] = new int[]{1,8,5,2,4,3};
        int b[]=new int[15];

        // 
        System.out.println("mang a : "+Arrays.toString(a));

        // hàm sắp xếp tăng dần
        Arrays.sort(a);
        System.out.println("sap xep a : "+Arrays.toString(a));

        // hàm tìm kiếm trong mảng (chỉ thực hiện được sau khi sắp xếp mảng) trả về -1 nếu giá trị không có trong mảng
        System.out.println("vị trí trong mảng : "+Arrays.binarySearch(a, 8));
        System.out.println("vị trí trong mảng : "+Arrays.binarySearch(a, -1));

        // hàm fill điền giá trị 
        Arrays.fill(b, 5);
        System.out.println("mang b : "+Arrays.toString(b));

        // sắp xếp giảm dần
        Arrays.sort(a);
        a=Mang_array_2.reverse(a);
        System.out.println("mang a sau khi giam "+ Arrays.toString(a));

        
    }

    public static int[] reverse(int x[]){
        // tạo mảng có độ dài bằng mảng ban đầu
        int rs[]= new int[x.length];
        // biến index thể hiện vị trí bắt đầu điền mảng 
        int index = 0;
        // mảng đi từ dưới lên
        for (int i =x.length-1; i>=0; i--) {
            // mảng x tại vị trí i(cuối đi lên ) giá trị i gán cho mảng rs tại vị trí index = 0   
            rs[index]=x[i];
            // tăng index để điền vào vị trí kế tiếp của mảng rs 
            index++;
        }
        // trả về kq mảng 
        return rs;
    }
}
