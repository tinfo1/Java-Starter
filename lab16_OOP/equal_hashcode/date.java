package lab16_OOP.equal_hashcode;
public class date {
    private int day;
    private int month;
    private int year;
    public date(int d,int m ,int y){
        if (d>=1 && d<=31) {
            this.day=d;
        } else {
            this.day=1;
        }

        if (m>=1 && m<=12) {
            this.month=m;
        } else {
            this.month=1;
        }
        if (y>0) {
            this.year=y;
        } else {
            this.year=2000;
        }
    }
    public void setDay(int d){
            if(d>=1 && d<=31)
                this.day=d;
    }
    public int getDay(){
        return this.day;
    }
    public void setMonth(int m){
        if(m>=1 && m<=12)
            this.month=m;
    }
    public int getMonth(){
        return this.month;
    }
    public void setYear(int y){
        if(y>0)
            this.year=y;
    }
    public int getYear(){
        return this.year;
    }
    //  toString method
    public String toString(){
        return this.day+"/"+this.month+"/"+this.year;
    }
    // equals method dùng để so sánh hai đối tượng có cùng giá trị hay không
    public boolean equals(Object obj) {
        // nếu hai đối tượng cùng tham chiếu đến một đối tượng thì trả về true
        if (this == obj) {
            return true;
        }
        // nếu obj là null hoặc hai đối tượng không cùng lớp thì trả về false
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        // ép kiểu obj về date để so sánh
        date other = (date) obj;
        if (this.day != other.day) {
            return false;
        }if (this.month != other.month) {
            return false;
        }
        if (this.year != other.year) {
            return false;
        }        
        return true;
        // return this.day == other.day && this.month == other.month && this.year == other.year;
    }
    // hashCode method dùng để trả về một giá trị băm (hash value) đại diện cho đối tượng
    // thường được sử dụng trong các cấu trúc dữ liệu như HashMap, HashSet để lưu trữ và truy xuất đối tượng một cách hiệu quả
    public int hashCode() {
        int result = 17; // một số nguyên dương bất kỳ
        result = 31 * result + this.day; // nhân với một số nguyên lẻ và cộng với giá trị của thuộc tính day
        result = 31 * result + this.month; // nhân với một số nguyên lẻ và cộng với giá trị của thuộc tính month
        result = 31 * result + this.year; // nhân với một số nguyên lẻ và cộng với giá trị của thuộc tính year
        return result; // trả về giá trị băm cuối cùng
    }
}
