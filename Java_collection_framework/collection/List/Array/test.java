package Array;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ds_sv ds= new ds_sv();

        String luachon="";
        do {
            System.out.println("MENU ------------------");
            System.out.println("Vui lòng chọn chức năng : ");
            System.out.println("1. Thêm sinh viên vào danh sách.\n" +
                "2. In danh sách sinh viên ra màn hình.\n"+
                "3. Kiểm tra xem danh sách có rỗng hay không.\n"+
                "4. Lấy ra số lượng sinh viên trong danh sách.\n"+
                "5. Làm rỗng danh sách sinh viên.\n"+
                "6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"+
                "7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"+
                "8. Tìm kiếm tất cả sinh sinh viên dựa trên Tên được nhập từ bàn phím.\n"+
                "9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"+ 
                "0. Exit."
            );
            luachon=sc.nextLine();
            // khi nhập số sẽ bị lỗi vì sc.nextline() sẽ đọc cả phần enter nên phải thêm 1 sc.nextline() 
            // để đọc phần enter đó trong trường hợp nhập số
            // sc.nextLine();


            // 1. thêm sinh viên vào danh sách
            if (luachon.equals("1")) {
                System.out.println("Nhập mã sinh viên :");String masv=sc.nextLine();
                System.out.println("Nhập Họ và tên  :");String hovaten=sc.nextLine();
                System.out.println("Nhập năm sinh :");int namsinh=sc.nextInt();
                System.out.println("Nhập diểm trung bình :");double dtb=sc.nextDouble();
                sinhvien sv= new sinhvien(masv,hovaten,namsinh,dtb);
                ds.themsv(sv);
            
            }else  
                // 2. In danh sách sinh viên ra màn hình.
                if (luachon.equals("2")) {
                    ds.indssv();

            }else  
                // 3. kiểm tra danh sách có rỗng hay không
                if (luachon.equals("3")) {
                System.out.println("danh sách có rỗng hay không ?"+ds.ktrong());
            }else  
                // 4. lấy ra số lượng sinh viên trong danh sách
                if (luachon.equals("4")) {
                    System.out.println("số lượng sinh viên trong danh sách :"+ds.soluongsv());
                
            }else 
                // 5. làm rỗng danh sách sinh viên
                if (luachon.equals("5")) {
                  ds.lamRongDanhSach();
            }else  
                // 6. kiểm tra sinh viên có tồn tại ?
                if (luachon.equals("6")) {
                     System.out.println("nhập mã sinh viên kt:");
                    //  String svkt=sc.nextLine();
                    //  System.out.println("kt sinh viên có tồn tại hay không ? "+ds.ktTonTai(svkt));

                    // cách 2 dùng compareto
                    String masv =sc.nextLine();
                     sinhvien sv = new sinhvien(masv);
                     System.out.println("kt sinh viên có tồn tại hay không ? "+ ds.kttontai2(sv));
                    
            }else  
                // 7. xóa sv dựa vào mã sv
                if (luachon.equals("7")) {
                     System.out.println("nhập mã sinh viên kt:");
                     String masv=sc.nextLine();
                     sinhvien sv = new sinhvien(masv);
                     ds.xoaSinhvien(sv);
                     System.out.println("danh sách sau khi xóa :"+ds);
                 
            }else  
                // 8. tìm kiếm dựa theo tên nhập vào
                if (luachon.equals("8")) {
                 System.out.println("Nhập Họ và tên  :");String hovaten=sc.nextLine();
                 ds.timkiemtheoten(hovaten);
            }else  
                // 9. xuất ds theo điểm từ cao -> thấp
                if (luachon.equals("9")) {
                ds.sapxep();
                ds.indssv();
            }
        } while (!luachon.equals("0"));
        sc.close();
    }
}
