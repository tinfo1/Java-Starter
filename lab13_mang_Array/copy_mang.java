package lab13_mang_Array;

import java.util.Arrays;

public class copy_mang {
    public static void main(String[] args) {
        //  kiểu nguyên thủy 
        int mang1[] = new int[]{1,2,3};

            // copy mảng cách1 (khi thay đổi 1 mảng thì cả 2 mảng đều thay đổi)
        int mang1_a[]=mang1;
        mang1_a[0]=100;

        System.out.println("mang1 : "+Arrays.toString(mang1));
        System.out.println("mang1_a :"+Arrays.toString(mang1_a));

            // copy mảng cách 2  dùng hàm clone() => 
        int mang1_b[]=mang1.clone();
        mang1_b[0]=50;
        System.out.println("mang1_b"+Arrays.toString(mang1_b));

            // copy mảng cách 3 dùng System.arraycopy
        int man1_c[]=new int[mang1.length];
        System.arraycopy(mang1_b, 0, man1_c, 0, mang1.length);
        man1_c[0]=30;
        System.out.println("mảng c : "+Arrays.toString(man1_c));


        // kiểu dữ liệu đối tượng ( tham chiếu)
        String mang_doi_tuong[]= {"tin","foo","huynnh","duc"};

            String  mang_doi_tuong_a[]=mang_doi_tuong;
            mang_doi_tuong_a[1]="le";
            System.out.println("mang doi tuong :"+Arrays.toString(mang_doi_tuong));
            System.out.println("mang doi tuong a :"+Arrays.toString(mang_doi_tuong_a));

            String mang_doi_tuong_b[]=mang_doi_tuong.clone();
            mang_doi_tuong_b[3]="foo";
            System.out.println("mang doi tuong b : "+Arrays.toString(mang_doi_tuong_b));

            String mang_doi_tuong_c[]=new String[mang_doi_tuong.length];
            System.arraycopy(mang_doi_tuong, 0, mang_doi_tuong_c, 0,mang_doi_tuong.length);
            mang_doi_tuong_c[0]="apex";
            System.out.println("mang doi tuong c "+Arrays.toString(mang_doi_tuong_c));
    }
}
