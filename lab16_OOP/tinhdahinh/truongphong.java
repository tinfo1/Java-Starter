package lab16_OOP.tinhdahinh;

public class truongphong extends nhansu {

    @Override
    double tinhluong(int ngaycong) {
       return ngaycong*50;
    }

    public truongphong(String ten, int cccd, String que) {
        super(ten, cccd, que);
    }

    public truongphong(String ten, int cccd) {
        super(ten, cccd);
    }

    public truongphong() {
    }
  
}
