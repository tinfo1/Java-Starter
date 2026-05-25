package lab12_chuoi_String;

public class bai26_String {
    public static void main(String[] args) {
        String s="hello world";
        System.err.println(s);

        // khai báo đối tượng string
        StringBuilder chuoi =new StringBuilder();
        // 7 phương thức thường dùng
        // 1 append : thêm vào cuối chuỗi
        chuoi.append("xin chào ");
        chuoi.append("mình mới học lập trình ");
        chuoi.append("rất vui được làm quen các bạn");
        System.out.println(chuoi);
        // 2 insert(vị trí index,chuỗi cần chèn) : chèn vào vị trí index 
        chuoi.insert(2," obama");
        System.out.println(chuoi);
        // 3 delete (start,end) xóa tất cả các ký tự từ vị trí bắt đầu đến cuối
        chuoi.delete(2, 7);
        System.out.println(chuoi);
        // 4 chuoi.lenght : trả về độ dài chuỗi tính cả space
        System.out.println(chuoi.length());
        // 5 indexof: kiểm tra vị trí xuất hiện đầu tiên của ký tư or chuỗi
        // trả về -1 nếu không tìm thấy
        String s7="tôi đi tìm tôi";
        System.out.println(s7.indexOf("tìm"));
        // 6 lastindexof : trả về vị trí xuất hiện cuối cùng của kí tự or chuỗi
        // trả về -1 nếu không tìm thấy
        System.out.println(s7.lastIndexOf("tôi"));
        // 7 contain: kiểm tra chuỗi con
        String s9=".mp3";
        String s10="tuhoc.mp4";
        // kiểm tra s10 có chứ ký tự của s9 không
        boolean check=s10.contains(s9);
        if(check)//check==true
            {
            System.out.println("có .pm3 trong chuỗi");
            } else
            System.out.println("không tìm thấy .mp3");
        // 8 subString: trích lọc chuỗi con từ chuỗi ban đầu, tách thành chuỗi từ vị trí này đến vị trí kia
        String s11="abcdefgh";
        String s12=s11.substring(4);
        System.out.println(s11);
        System.out.println(s12);
        String s13=s11.substring(4,7);
        System.out.println(s13);
        // 9 replace ("str old","str new ")
        String s14="tôi đi tìm tôi";
        String s15=s14.replace("tôi", "bạn");
        System.out.println(s14);
        System.out.println(s15);
        // 10 replacefirst("str old ", "str new")
        String s16=s14.replaceFirst("tôi", "bạn");
        System.out.println(s14);
        System.out.println(s16);
        // 11 trim():xóa toàn bộ khoảng trắng ở đầu và cuối
        String s18="                     lê huỳnh đức             ";
        String s19=s18.trim();
        System.out.println(s18);
        System.out.println(s19);
        // 12 trim(): xóa toàn bộ khoảng trắng ở cuối
        // cách 1:biểu thức chính quy regular expression
        String s20=s18.replaceAll("\\s+$", "");
        System.out.println(s18);
        System.out.println(s18.length());
        System.out.println(s20);
        System.out.println(s20.length());
        // cách 2:xóa khoảng trắng cuối chuỗi bằng vòng lặp
        String s21="                     lê huỳnh đức             ";
        while (s21.endsWith(" ")) {
            s21=s21.substring(0, s21.length()-1);
        }
        System.out.println(s21);
        // 13 trim() xóa khoảng trắng ở đầu chuỗi
        String s23="                     lê huỳnh đức             ";
        String s24=s23.replaceAll("^\\s+", "");
        System.out.println(s23);
        System.out.println(s24);
        // cách 2 bằng vòng lặp 
        String s25="                     lê huỳnh đức             ";
        while (s25.startsWith(" ")) {
            s25=s25.substring(1);

        }
        System.out.println(s25);
        // 14 so sánh 2 chuỗi dựa vào bảng ASI
        String s26="abc1234";
        String s27="abc1234";
        int x =s26.compareTo(s27);
        System.out.println("x ="+x);
        String s28="ABC1234";
        int x2=s28.compareTo(s27);
        System.out.println("x2= "+x2);
        // so sánh không phân biệt hoa thườn
        int x3= s28.compareToIgnoreCase(s27);
        System.out.println("x3= "+x3);
        //  15 đảo chuỗi
        String s29="123456789";
        //khai báo đối tượng cho Stringbuilder
        StringBuilder sb=new StringBuilder(s29);
        System.out.println(s29);
         sb.reverse();
         String y=sb.toString();//chuyển sang chuỗi
         System.out.println(y);
        // 16 split tách chuỗi 
        String s30="hello, world";
        String[] mang=s30.split(",");
        // duyệt mảng
        for (int i = 0; i < mang.length; i++) {
            System.out.println(mang[i]);
        }
        // 17 tolowercase() & touppercase()
        String s31="tôi học lập trình";
        String s32=s31.toUpperCase();
        System.out.println(s32);
        String s33=s32.toLowerCase();
        System.out.println(s33);
        // 18 tochararray tách chuỗi thành từng kí tự ,cho vào mảng
        String s34="sadxzcg12345";
        char[] mang2=s34.toCharArray();
        // duyệt mảng
        for (int i = 0; i < mang2.length; i++) {
            System.out.println(mang2[i]);
        }

    }
}
