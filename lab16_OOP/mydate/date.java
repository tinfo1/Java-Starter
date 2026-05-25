package lab16_OOP.mydate;

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
public String toString(){
        return this.day+"/"+this.month+"/"+this.year;
    }
}
