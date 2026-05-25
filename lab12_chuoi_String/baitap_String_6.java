package lab12_chuoi_String;

public class baitap_String_6 {
    public static void main(String[] args) {
        /*
        viết ct trích lọc String từ đường dẫn D:/hocjava/music/remix.mp3
        1.tách tên tệp bao gồm đuôi .mp3
        2.tách tên file remix
        */
       String path="D:/hocjava/music/remix.mp3";
       int lastSlashindex=path.lastIndexOf("/");
        //in vị trí index
        System.out.println(lastSlashindex);
        String filename=path.substring(lastSlashindex+1);
        System.out.println(filename);
        // in ra remix
        int lastDot=filename.lastIndexOf(".");
        // trích từ chuôi filename 
        String nameonly=filename.substring(0, lastDot);
        System.out.println(nameonly);
    }
}
