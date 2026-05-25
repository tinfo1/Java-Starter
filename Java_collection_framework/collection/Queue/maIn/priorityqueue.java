package Java_collection_framework.collection.Queue.maIn;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue {
    public static void main(String[] args) {
          Queue<String> dssv= new PriorityQueue<String>();
        dssv.offer("Tinfoo 1");
        dssv.offer("tran thanh phong");
        dssv.offer("le huynh duc");
        dssv.offer("Tinfoo 2");
        while (true) {
            String ten=dssv.poll(); // => lấy ra và xóa khỏi queue
            // String ten=dssv.peek();//=> lấy ra nhưng không xóa
            if(ten==null) {break;}
            System.out.println(ten);
        }
    }
}
