package java_input_output.create_file;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter file name : ");
        String tenFile=sc.nextLine();
        String luachon="";
        FileCheck fCheck =new FileCheck(tenFile);
        do {
            System.out.println("----------------");
            System.out.println("MENU------------");
            System.out.println("1. Kiểm tra file có thể thực thi");
            System.out.println("2. Kiểm tra file có thể đọc");
            System.out.println("3. Kiểm tra file có thể ghi");
            System.out.println("4. In đường dẫn");
            System.out.println("5. In tên file");
            System.out.println("6. Kiểm tra file là thư mục hay tập tin");
            System.out.println("7. In ra danh sách các file con ");
            System.out.println("8. In ra cây thư mục ");
            System.out.println("0. Exit ");
            System.out.println("-----------------");

            System.out.println("Enter your choose :");
            luachon=sc.nextLine();
            switch (luachon) {
                case "1":
                    System.out.println("Your choose "+luachon + " Check file  can Execute ");
                    System.out.println(fCheck.ktThucThi());
                    break;
                case "2":
                    System.out.println("Your choose "+luachon + " Check file  can Read ");
                    System.out.println(fCheck.ktDoc());
                    break;
                case "3":
                    System.out.println("Your choose "+luachon + " Check file  can Write ");
                    System.out.println(fCheck.ktGhi());  
                    break;
                case "4":
                    System.out.println("Your choose is display link");
                    fCheck.getLink();
                    break;
                case "5":
                    System.out.println("Your choose is display file name");
                    fCheck.getName();
                    break;
                case "6":
                    System.out.println("Your choose is checking Folder or file");
                    fCheck.checkFileOrFolder();  
                    break;
                case "7":
                    System.out.println("Your choose is display sub-file");
                    fCheck.displaySubFile(); 
                    break;
                case "8":
                    System.out.println("Your choose is display directory tree");
                    fCheck.displayDirectoryTree();       
                default:
                    break;
            }
        } while (!luachon.equals("0"));
        sc.close();
    }
}
