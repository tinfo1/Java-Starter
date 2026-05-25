package Java_collection_framework.collection.set.app_rut_tham_trung_thuong;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class thung_phieu_hashSet {
    private Set<String> thungphieuduthuong = new HashSet<>();
 
    public thung_phieu_hashSet() {
    }
    public thung_phieu_hashSet(Set<String> thungphieuduthuong) {
        this.thungphieuduthuong = thungphieuduthuong;
    }
    public Set<String> getThungphieuduthuong() {
        return thungphieuduthuong;
    } 
    public void setThungphieuduthuong(Set<String> thungphieuduthuong) {
        this.thungphieuduthuong = thungphieuduthuong;
    }
    public boolean themphieu(String giatri){
        return this.thungphieuduthuong.add(giatri);
    }
    public boolean xoaphieu(String giatri){
        return this.thungphieuduthuong.remove(giatri);
    }
    public boolean kiemtraphieu(String giatri){
        return this.thungphieuduthuong.contains(giatri);
    }
    public void xoatatcaphieu(){
        this.thungphieuduthuong.clear();
    }
    public int laysoluong(){
        return this.thungphieuduthuong.size();
    }
    public String rutmotphieu(){
        String kq="";
        Random rd=new Random();
        int vitri=rd.nextInt(this.thungphieuduthuong.size());
        kq=(String) this.thungphieuduthuong.toArray()[vitri];
        return kq;
    }
    public void inthungphieu(){
        System.out.println(this.thungphieuduthuong);
    }

}
