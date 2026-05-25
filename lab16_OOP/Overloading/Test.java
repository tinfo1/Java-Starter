package lab16_OOP.Overloading;

public class Test {
    public static void main(String[] args) {
        myMath math = new myMath();
        System.out.println("tim min 2 so : " + math.timMin(5, 10));
        System.out.println("tim min 2 so : " + math.timMin(5.5, 10.5));
        System.out.println("tinh tong 2 so : " + math.tinhTong(5, 10));
        double[] arr = new double[]{1.5, 2.5, 3.5};
        System.out.println("tinh tong mang so : " + math.tinhTong(arr));
    }
}
