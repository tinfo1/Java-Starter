package Java_collection_framework.generic;

public class app {
    public static void main(String[] args) {
        box b=new box(10);
        System.out.println(b.getValue());

        box2<Integer> b1=new box2<Integer>(15);
        System.out.println("gia trị = "+b1.getValue());
        box2<String> b2 =new box2<String>("hello");
        System.out.println("gia trị ="+b2.getValue());
        box2<Double> b3=new box2<Double>(10.5);
        System.out.println("gia tri = "+b3.getValue());
    }
}
