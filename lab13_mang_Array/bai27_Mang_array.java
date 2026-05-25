package lab13_mang_Array;

import java.util.Arrays;

public class bai27_Mang_array {
    public static void main(String[] args) {
        // 1. khai báo mảng
        String[] array; //có thể viết  String array[]
        
        // 2. khởi tạo mảng kèm kích thước
        String[] st=new String[5];
        int[] mangnguyen=new int[3];


        // 3. khởi tạo mảng kèm giá trị ban đầu
        String[] st3=new String[]{"hihi","haha","huhu","hoho"};
        int[] st4=new int[]{1,3,4,5,6,8,10};

        // 4. truy xuất phần tử mảng tại vị trí index
        System.out.println(st4[4]);
        System.out.println(st3[1]);
        // test
        System.out.println(st[2]);
        System.out.println(mangnguyen[2]);
        // test2
        array=new String[]{"hello","holle"};
        System.out.println(array[1]);
        // lenght
        System.out.println(st4.length);

        // 5. Duyệt mảng
        // c1
            int[] mang4=new int[]{1,2,3,4,5,6,7,8};
            for (int i = 0; i < mang4.length; i++) {
                System.out.println(mang4[i]);
            }
        // c2
            for (int i : mang4) {
                System.out.println(i);
            }
        
        // update mảng
        st3[0]="huynhduc";
        for (int i = 0; i < st3.length; i++) {
            System.out.println(st3[i]);
        }
        // mảng4 tăng thêm 5 đơn vị 
        for (int i = 0; i < mang4.length; i++) {
            mang4[i]+=5;
            System.out.println(mang4[i]);
        }
        // 6. sắp xếp mảng 
        int[] mang8=new int[]{8,9,10,20,46,1,2,3};
        Arrays.sort(mang8);
        System.out.println("mảng 8 sau sắp xếp là : ");
        System.out.println(Arrays.toString(mang8));

        // 7. đảo ngược mảng
        int[] mang9=new int[]{8,9,10,20,46,1,2,3};
        for (int i = 0,j=mang9.length-1; i < j; i++,j--) {   
                int temp=mang9[i];
                mang9[i]=mang9[j];
                mang9[j]=temp;
        }
        // sau khi đảo ngược 
        System.out.println("mảng 9 sau khi đảo là ");
        System.out.println(Arrays.toString(mang9));

        // 8. Gán mảng (copy mảng) cách 1 
        int[] mang10=new int[]{8,9,10,20,46,1,2,3};
        int[] mang11=mang10;
        System.out.println("mảng 10 : "+ Arrays.toString(mang10));
        System.out.println("mảng 11 : "+ Arrays.toString(mang11));
        // 9. Clone
         int[] mang12=new int[]{8,9,10,20,46,1,2,3};
         int[] mang13=mang12.clone();
         mang12[0]=100;
         
         System.out.println("mảng 12 : " +Arrays.toString(mang12));
         System.out.println("mảng 13 : " +Arrays.toString(mang13));
    }
}
