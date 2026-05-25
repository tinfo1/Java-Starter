package lab1;
// bài 6 ép kiểu
public class bai6_ep_kieu {
    public static void main(String[] args) {
// ép kiểu ngầm định (ép kiểu rộng)
        int a=10;
        int b=15;
        double kq=(double)a/b;
        System.out.println(kq);
// ép kiểu hẹp (ép kiểu tường minh)
        int c=128;
        byte d=(byte)c;
        System.out.println(c);
        System.out.println(d);
        int e=15;
        byte f=(byte)e;
        System.out.println(e);
        System.out.println(f);

        float g=3.5f;
        float h=4.5f;
        System.out.println("g = "+g);
        System.out.println("h = "+h);
        
        int i=(int)g;
        int j=(int)h;
        System.out.println("i = "+i);
        System.out.println("j = "+j);
 //  ép kiểu char sang int
        char ch='A';
        int k=(int)ch;
        System.out.println("k = "+k);
//  ép kiểu giữ biến nguyên thủy và đối tượng
        int m=10;
        Integer n=(Integer)m;
        System.out.println("m = "+m);
        System.out.println("n = "+n);
        // ép kiểu ngược lại
        int p=n.intValue();
        System.out.println("p = "+p);
// ép kiểu giữa các đối tượng
        String s="123";
        int q=Integer.parseInt(s);
        System.out.println("s = "+s);
        System.out.println("q = "+q); 
    }
}
