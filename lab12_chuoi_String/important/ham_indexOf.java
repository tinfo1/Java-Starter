package lab12_chuoi_String.important;

public class ham_indexOf {
    public static void main(String[] args) {
        String s1 = "Hello every body, hello guys, Hello";
        String s2 = "Hello";
        String s3 = "Hello tinfo";
        char c1 = 'i';
        //  hàm indexOf 
        System.out.println("vị trí của s2 trong s1 là " +s1.indexOf(s2));
        System.out.println("vị trí của s3 trong s1 là " +s1.indexOf(s3));

        //  sử dụng vị trí bắt đầu 
        int dodai=s1.length();
        for (int i = 0; i< dodai ; i++) {
            System.out.println(" vi trí :" +i + " là "+s1.charAt(i));
        }
        System.out.println("vị trí của s2 trong s1 là "+s1.indexOf(s2,2));

        // tìm kiếm ký tự trong chuỗi
        System.out.println("vị trí của c1 trong s3 : "+s3.indexOf(c1));
        System.out.println("vị trí của c1 trong s1 : "+s3.indexOf(c1,9));

        // lastindexOf tìm kiếm từ phải sang trái
        System.out.println("vị trí của s2 trong s1 (từ phải sang trái) "+ s1.lastIndexOf(s2));
      
    }
}
