package java_input_output.move_Coppy__Rename_File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class move_File {
    public static void main(String[] args) {
        File f0=new File("C:\\Users\\ADMIN\\Documents\\linh_tinh\\java\\java_input_output\\move_Coppy__Rename_File\\f1.txt");
        Path path =Paths.get("C:\\Users\\ADMIN\\Documents\\linh_tinh\\java\\java_input_output\\move_Coppy__Rename_File\\fo\\f1.txt");
        Path path2 =Paths.get("C:\\Users\\ADMIN\\Documents\\linh_tinh\\java\\java_input_output\\move_Coppy__Rename_File\\f1.txt");

        try {
            Files.move(path2, path, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
