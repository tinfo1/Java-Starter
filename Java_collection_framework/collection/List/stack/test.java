package stack;

import java.util.Scanner;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String> stackchuoi=new Stack<>();
        // stackchuoi.push("gia tri");  => đưa giá tri vào stack
        // stackchuoi.pop() => lấy giá trị ra, xóa khỏi stack
        // stackchuoi.peek() => lấy giá trị ra, nhưng không xóa khỏi stack
        // stackchuoi.clear() => xóa tất cả phần tử trong stack
        // stackchuoi.contains("giá tị ") => xác định giá trị có tồn tại trong stack hay không
        // stackchuoi.size() => độ dài của stack

        //  ví dụ chuỗi đảo ngượcc 
        System.out.println("nhập vào chuỗi");
        String s=sc.nextLine();
        //  TINFOO
        for (int i = 0; i < s.length(); i++) {
            stackchuoi.push(s.charAt(i)+"");
        }

        System.out.println("chuỗi đảo ngược ");
        for (int i = 0; i < s.length(); i++) {
            System.out.println(stackchuoi.pop());       
         }


        //  chuyển từ thập phân sanng nhị phân
        Stack<String> stacksodu=new Stack<String>();
        System.out.println("nhập vào số thập phân");
        int n=sc.nextInt();
        while(n>0){
            int sodu=n%2;
            stacksodu.push(sodu+"");
            n=n/2;
        }
        System.out.println("số nhị phân là ");
        // cách 1 cố định số lần lặp bằng độ dài của stack, vì sau khi pop thì stack sẽ bị giảm đi 1 phần tử
        System.out.println("cách 1 cố định số lần lặp bằng độ dài của stack");
        int count=stacksodu.size();
        for (int i = 0; i < count; i++) {
            System.out.print(stacksodu.pop());
        }
        // cách 2 lặp đến khi stacksodu rỗng
        System.out.println("cách 2 lặp đến khi stacksodu rỗng");
        while (stacksodu.isEmpty()) {
            System.out.println(stacksodu.pop());
        }
        sc.close();
    }
}
