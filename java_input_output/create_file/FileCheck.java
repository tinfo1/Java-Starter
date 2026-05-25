package java_input_output.create_file;

import java.io.File;

public class FileCheck {
    File file;
    // constructor 
    public FileCheck(String tenFile){
        // đưa về String để xuất ra tên file theo người dùng nhập vầo
        this.file= new File(tenFile);
    }
    public File getFile() {
        return file;
    }
    public void setFile(File file) {
        this.file = file;
    }
    public boolean ktThucThi(){
        return this.file.canExecute();
    }
    public boolean ktDoc(){
        return this.file.canRead();
    }
    public boolean ktGhi(){
        return this.file.canWrite();
    }
    public void getLink(){
        System.out.println(this.file.getAbsolutePath());
    }
    public void getName(){
        System.out.println(this.file.getName());
    }
    public void checkFileOrFolder(){
        if (this.file.isDirectory()) {
            System.out.println("This is Folder");
        }else if (this.file.isFile()) {
            System.out.println("This is File");
        }
    }
    public void displaySubFile(){
        if (this.file.isDirectory()) {
            System.out.println("The Sub-File is : ");
            File subFile[] = this.file.listFiles();
            for (File file : subFile) {
                System.out.println(file.getAbsolutePath());
            }
        }else if (this.file.isFile()) {
            System.out.println("This is File not Folder ! ");
        }
    }
    public void displayDirectoryTree(){
        this.displayDirectoryTreeDetail(this.file,1);
    }
    public void displayDirectoryTreeDetail(File f,int level){
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        System.out.print("|_");
        System.out.println(f.getName());
        if (f.canRead()&&f.isDirectory()) {
            File sub_array[]=f.listFiles();
            for (File file : sub_array) {
                displayDirectoryTreeDetail(file, level+1);
            }
        }
    } 
}
