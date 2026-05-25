package lab16_OOP.vd_interface.maytinhbotui;

public class test {
    public static void main(String[] args) {
        vinacal500 m = new vinacal500();
        casioFX570 m2 = new casioFX570();

        System.out.println("\nMáy tính Vinacal 500:");
        System.out.println("Cộng: " + m.cong(5, 3));
        System.out.println("Trừ: " + m.tru(5, 3));
        System.out.println("Nhân: " + m.nhan(5, 3));
        System.out.println("Chia: " + m.chia(5, 0));

        System.out.println("\nMáy tính Casio FX570:");
        System.out.println("Cộng: " + m2.cong(5, 3));
        System.out.println("Trừ: " + m2.tru(5, 3));
        System.out.println("Nhân: " + m2.nhan(5, 3));
        System.out.println("Chia: " + m2.chia(5, 0));

        double[] arr = new double[]{1,7,5,3,9};
        double[] arr2=new double[]{2,5,6,4,9};
        sxchen chen=new sxchen();
        sxchon chon=new sxchon();
            chen.sapxepgiam(arr);
            for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]+ " ");
            }
            System.out.println("");
            chon.sapxepgiam(arr2);
            for (int i = 0; i < arr2.length; i++) {
                 System.out.print(arr2[i]+ " ");
            }
            System.out.println("");
            System.out.println("câu c");
            phanmem pm=new phanmem();
            System.out.println("Cộng: " + pm.cong(5, 3));
            System.out.println("Trừ: " + pm.tru(5, 3));
            System.out.println("Nhân: " + pm.nhan(5, 3));
            System.out.println("Chia: " + pm.chia(5, 0));
            double[] arr3 = new double[]{0,5,8,2,4,1};
            pm.sapxepgiam(arr3);
            System.out.println(" pm giảm ");
            for (int i = 0; i < arr3.length; i++) {
                System.out.print(  arr3[i]+ " ");
            }
            pm.sapxeptang(arr3);
            System.out.println("\n pm tang");
            for (int i = 0; i < arr3.length; i++) {
                System.out.print(arr3[i]+ " ");
            }
    }
}
