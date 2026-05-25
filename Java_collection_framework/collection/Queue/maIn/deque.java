package Java_collection_framework.collection.Queue.maIn;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<String> dssv=new ArrayDeque<String>();
        dssv.offer("Tinfoo 1");
        dssv.offer("le huynh duc");
        dssv.offer("le thanh nhan");
        dssv.offer("Tinfoo 2");
        dssv.offerLast("Tinfoo 3");
        dssv.offerFirst("Tinfoo 0");

        while(true ){
            String ten =dssv.poll();
            if(ten==null){break;}
            System.out.println(ten);
        }
    }
}
