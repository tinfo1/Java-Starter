package Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class ds_sv {
    // arraylist chứa đối tượng là sinh viên
    private ArrayList<sinhvien> dssv;

    // tạo thêm constructor rỗng để lưu trữ dữ liệu vào sau
    public ds_sv(){
        this.dssv= new ArrayList<sinhvien>();
    }
    // constructor ds_sv
    public ds_sv(ArrayList<sinhvien> dssv){
        this.dssv=dssv;
    }
    //1. thêm sinh viên vào danh sách
    public void themsv(sinhvien sv){
        this.dssv.add(sv);
    }
    // 2. In danh sách sinh viên ra màn hình.
    public void indssv(){
        for (sinhvien sinhvien : dssv) {
            System.out.println(sinhvien);
        }
    }
    // 3. Kiểm tra xem danh sách có rỗng hay không.
    public boolean ktrong(){
       return this.dssv.isEmpty();
    }
    // 4. Lấy ra số lượng sinh viên trong danh sách.
    public int soluongsv(){
        return this.dssv.size();
    }
    // 5. Làm rỗng danh sách sinh viên.
    public void lamRongDanhSach(){
         this.dssv.removeAll(dssv);
    }
    // 6. kiểm tra tồn tại 
       /* cách 1 dùng vòng lặp */
    public boolean ktTonTai(String masv){
        for (sinhvien sv : dssv) {
            if(sv.getMasv().equals(masv)){
                return true;
            }
        }
        return false;
    }
    /* cách 2 dùng compareto  */
    public boolean kttontai2(sinhvien sv){
        return this.dssv.contains(sv);
    }

    // 7. xóa một sinh viên 
    public void xoaSinhvien(sinhvien sv){
        this.dssv.remove(sv);    
        }
    // 8. tìm kiếm 
    public void timkiemtheoten(String ten){
        for (sinhvien sinhvien : dssv) {
            if (sinhvien.getHovaten().indexOf(ten)>0) {
                System.out.println(sinhvien);
            }
        }
    }
    // 9. sắp xếp 
    public void sapxep(){
         //muốn sử dụng Comparator thì phải override phương thức compare để so sánh 2 đối tượng sinh viên với nhau dựa vào điểm trung bình
        Collections.sort(this.dssv,new Comparator<sinhvien>() {
        //  override phương thức compare để so sánh 2 đối tượng sinh viên với nhau dựa vào điểm trung bình
            @Override
            public int compare(sinhvien sv1, sinhvien sv2) {
                if (sv1.getDiemtrungbinh()>sv2.getDiemtrungbinh()) {
                    return -1;
                }else if (sv1.getDiemtrungbinh()<sv2.getDiemtrungbinh()) {
                    return 1;
                }else
                    return 0;
            }
            
        });
    }
}
