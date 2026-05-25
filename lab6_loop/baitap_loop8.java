package lab6_loop;

// for lồng nhau
public class baitap_loop8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                    System.out.print(i+""+j+" ");
            }
            System.out.println("");
        }
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("");
        //  vẽ chữ N
        for (int i = 1; i <=7; i++) {
            for (int j = 1; j <=7; j++) {
                if (j==1||j==7||i==j) {
                    System.out.print(i+""+j+"\t");
                }else
                    System.out.print(""+"\t");
            }
            System.out.println("");
        }
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("");
        // vẽ hình chữ nhật
         for (int i = 1; i <=7; i++) {
            for (int j = 1; j <=7; j++) {
                if (j==1||j==7||i==1||i==7) {
                    System.out.print(i+""+j+"\t");
                }else
                    System.out.print(""+"\t");
            }
            System.out.println("");
        }
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("");
        // vẽ hình tam giác
         for (int i = 1; i <=7; i++) {
               for (int j = 1; j <= i; j++) {
                    System.out.print(i+""+j+" ");
            }
            System.out.println("");
        }
    }
    
}
