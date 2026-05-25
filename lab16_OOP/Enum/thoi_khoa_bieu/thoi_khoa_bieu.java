package lab16_OOP.Enum.thoi_khoa_bieu;

public class thoi_khoa_bieu {
    private day thu;
    private String monhoc;
    public thoi_khoa_bieu(day thu,String monhc){
        this.thu=thu;
        this.monhoc=monhc;
    }
    public day getDay(){
        return this.thu;
    }
    public void setDay(day thu){
        this.thu=thu;
    }
    public String getMonhoc(){
        return this.monhoc;
    }
    public void setMonhoc(String monhc){
        this.monhoc=monhc;
    }
    @Override
    public String toString(){
        return "Thời khóa biểu thứ "+thu +" môn học "+monhoc ;
    }

}
