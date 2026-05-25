package java_input_output.create_file;

import java.io.File;
import java.io.IOException;

public class create_File {
    public static void main(String[] args) {
        // lưu ý 
        /*
            MS window  : \ => ví dụ C:\\thumuc1\\thumuc2\\taptin.txt.....
            linux, MacOS: / ví dụ :/thumuc1/thumuc2/thumuc3/taptin.txt  
        */ 
        File f1=new File("C:\\Users\\ADMIN\\AppData\\Local\\Programs\\Microsoft VS Code");
        File f2=new File("C:\\Users\\ADMIN\\AppData\\Local\\Programs\\Microsoft VS Code 2");

        System.out.println("check file f1 :"+f1.exists());
        System.out.println("check file f2 :"+f2.exists());

        //  Tạo thư mực
        //  hàm mkdir => make directory
        File d1=new File("C:\\Users\\ADMIN\\Documents\\linh_tinh\\java\\java_input_output\\directory");
        d1.mkdir();

        //  hàm mkdirs => tạo nhiều thư mục 
        File d2=new File("C:\\Users\\ADMIN\\Documents\\linh_tinh\\java\\java_input_output\\directory\\directory2\\directory3\\directory4");
        d2.mkdirs();

        //  tạo tập tin (có phần mở rộng .txt .pdf .doc .exe)
        File file = new File("C:\\Users\\ADMIN\\Documents\\linh_tinh\\java\\java_input_output\\directory\\vidu.txt");
        //  khi tạo file phải đặt hàm .createNewFle() vào try catch 
        try {
            file.createNewFile();
        } catch (IOException e) {
            // khi tạo file gặp những lỗi
            // không có quyền tạo tập tin ( ADMIN permission)
            // ổ cứng bị đầy 
            // đường dẫn sai 
            e.printStackTrace();
        }
    }
}
