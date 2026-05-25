package java_input_output.move_Coppy__Rename_File;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class copy_File {

    public static void copyAll(Path path,Path path2) throws IOException {
        try {
            // trước hết copy cái vỏ ngoài trước
            Files.copy(path, path2, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // copy thứ bên trong dùng File 
        if (Files.isDirectory(path)) {
            try( DirectoryStream<Path> chill=Files.newDirectoryStream(path)){
                for (Path p : chill) {
                Path new_file=path2.resolve(p.getFileName());
                System.out.println("File duoc tao : "+new_file.toAbsolutePath()+ ", file name : "+p.getFileName());
                copyAll(p, new_file);
                }
            }
            
        }
    }
    public static void main(String[] args) {


        Path path = Paths.get("C:\\Users\\ADMIN\\Documents\\linh_tinh\\java\\java_input_output\\move_Coppy__Rename_File\\fo");
        Path path2 = Paths.get("C:\\Users\\ADMIN\\Documents\\linh_tinh\\java\\java_input_output\\move_Coppy__Rename_File\\fo_copy");
        try {
            Files.copy(path, path2, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
           e.printStackTrace();
        }


        try {
            copy_File.copyAll(path, path2);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
