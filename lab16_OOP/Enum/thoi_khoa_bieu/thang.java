package lab16_OOP.Enum.thoi_khoa_bieu;

public enum thang {
    thang_1("31 ngày"),
    thang_2("28 ngày"),
    thang_3("31 ngày"),
    thang_4("30 ngày"),
    thang_5("31 ngày"),
    thang_6("30 ngày"),
    thang_7("31 ngày"),
    thang_8("31 ngày"),
    thang_9("30 ngày"),
    thang_10("31 ngày"),
    thang_11("30 ngày"),
    thang_12("31 ngày");
    // attribute
    private final String songay;
    // constructor
    thang(String songay){
        this.songay=songay;
    }
    // method getter lấy số ngày 
    public  String Songay(){
        return  songay;
    }
}
