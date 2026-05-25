package lab16_OOP.tinhdahinh;

public class phophong extends nhansu {

    @Override
    double tinhluong(int ngaycong) {
       return 40*ngaycong;
    }
    public phophong(String ten,String que,int cccs){
        super(ten, cccs, que);
    }
    public phophong(String ten, int cccd) {
        super(ten, cccd);
    }
    public phophong() {
    }

}
