package java_input_output.Delete_file;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Delete_File {
    /* 
    public static void deLeTeFile(File fx){
        // xóa nếu là tập tin
        if (fx.isFile()) {
            System.out.println("Da xoa : "+fx.getAbsolutePath());
            fx.delete();
        // xóa nếu là thư mục
        }else if (fx.isDirectory()) {
            // nếu thư mục không rỗng , lấy danh sách file con trong thư mục
            File arrayFile[]=fx.listFiles();
            // foreach để duyệt qua tệp trong thư mục 
            for (File f : arrayFile) {
                // xóa file con
                deLeTeFile(f);
            }
            // xóa bản thân thư mục sau khi xóa các file con
            System.out.println("Da xoa : "+fx.getAbsolutePath());
            fx.delete();
        }
    }
    
    */

   public static void xoaFile(Path fx )throws IOException{
    if (Files.isDirectory(fx)) {
        try (DirectoryStream<Path> chill = Files.newDirectoryStream(fx)) {
            for (Path f : chill) {
                xoaFile(f);
            }
        }
    }
    Files.delete(fx);
    System.out.println("Da Xoa"+fx.toAbsolutePath());
   }
    public static void main(String[] args) {

        // sử dụng class File để xóa thư mục
        File f0=new File("C:\\Users\\ADMIN\\Documents\\linh_tinh\\java\\java_input_output\\Delete_file\\f0");
        File f0_1=new File("C:\\Users\\ADMIN\\Documents\\linh_tinh\\java\\java_input_output\\Delete_file\\f0_1");
        File f=new File("C:\\Users\\ADMIN\\Documents\\linh_tinh\\java\\java_input_output\\Delete_file\\vidu.txt");
/* 
        f0.deleteOnExit(); // không xóa được vì không phải thư mục rỗng
        f0_1.deleteOnExit();// xóa được vì là thư mục rỗng
        f.deleteOnExit();// xóa được vì là tập tin , không xóa được nếu tệp đang mở

        System.out.println(f0_1.delete());//delete trả về true or false

        Delete_File.deLeTeFile(f0);
*/
        //  sử dụng class Files để xóa thư mục 
        Path p =f0.toPath();
        Path p0_1 =f0_1.toPath();
        Path pf =f.toPath();
        // khi xóa file sử dụng Files nhất định phải có try cath
        try {
            xoaFile(p);
            System.out.println("xoa thanh cong");
            Files.deleteIfExists(p0_1);
            Files.deleteIfExists(pf);
        } catch (IOException e) {

            e.printStackTrace();
        }


    }
}
