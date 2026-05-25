package java_input_output.move_Coppy__Rename_File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class reName {
    public static void main(String[] args) {

        // tạo đối đượng file bằng File
        File f0=new File("C:\\Users\\ADMIN\\Documents\\linh_tinh\\java\\java_input_output\\move_Coppy__Rename_File\\fo.txt");
        File f1=new File("C:\\Users\\ADMIN\\Documents\\linh_tinh\\java\\java_input_output\\move_Coppy__Rename_File\\f1.txt");

        // // thay đổi tên file hoặc thư mục 
        // // dùng File
        f0.renameTo(f1);
        // // dùng Files để đổi tên 
        // // tạo đối tượng file bằng Files
        Path path = Paths.get("C:\\Users\\ADMIN\\Documents\\linh_tinh\\java\\java_input_output\\move_Coppy__Rename_File\\fo.txt");
        Path path2 = Paths.get("C:\\Users\\ADMIN\\Documents\\linh_tinh\\java\\java_input_output\\move_Coppy__Rename_File\\f1.txt");

        try {
            Files.move(path, path2,StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

     
    }
}
