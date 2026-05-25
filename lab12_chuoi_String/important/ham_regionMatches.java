package lab12_chuoi_String.important;

public class ham_regionMatches {
    public static void main(String[] args) {
        //  regionMatches => so sánh một đoạn 
        String n = "tinfoo1";
        String m = "foo1";
        boolean check =n.regionMatches(3, m, 0, 4);
        System.out.println(check);
    }
}
