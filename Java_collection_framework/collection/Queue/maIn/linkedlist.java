package Java_collection_framework.collection.Queue.maIn;

import java.util.LinkedList;
import java.util.Queue;

public class linkedlist {
    public static void main(String[] args) {
        Queue<String> dssv= new LinkedList<String>();
        dssv.offer("Tinfoo");
        dssv.offer("le huynh duc");
        dssv.offer("tran thanh phong");
        dssv.offer("tinfoo2");
        while (true) {
            String ten=dssv.poll(); // => lấy ra và xóa khỏi queue
            // String ten=dssv.peek();//=> lấy ra nhưng không xóa
            if(ten==null) {break;}
            System.out.println(ten);
        }
    }
}
