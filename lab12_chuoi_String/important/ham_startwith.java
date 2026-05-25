package lab12_chuoi_String.important;

public class ham_startwith {
    public static void main(String[] args) {
        String sdt = "0342495051";
        // startwith => hàm kt chuỗi bắt đầu bằng ..........
        System.out.println(sdt.startsWith("034"));
        System.out.println(sdt.startsWith("037"));
        // hàm endwith => kt chuỗi kết thúc bằng ........
        String file ="iloveyou.jpg";
        String file2="hocjava.pdf";

        if (file.endsWith("jpg")) {
            System.out.println("file này là file hình ảnh");
        }else if (file.endsWith("pdf")) {
            System.out.println("file này là file tài liệu");
        }

        if (file2.endsWith("jpg")) {
            System.out.println("file2 này là file hình ảnh");
        }else if (file2.endsWith("pdf")) {
            System.out.println("file2 này là file tài liệu");
        }
    }
}
