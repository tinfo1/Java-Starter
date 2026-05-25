package lab16_OOP.Enum.sinhvien;

public enum Xeploai {
    gioi(" giỏi"),
    kha(" khá "),
    trungbinh(" trung bình "),
    yeu(" yếu"),
    duoihoc(" đuổi học");
    private String msg;
    Xeploai(String msg){
        this.msg=msg;
    }
    public String mota(){
        return this.msg;
    }
}
