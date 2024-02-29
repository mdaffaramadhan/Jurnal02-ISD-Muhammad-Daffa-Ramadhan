import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        daftar <ATK> daftarATK= new daftar<>(5);
        daftar <Bag> daftarBag= new daftar<>(5);

        daftarATK.addData(new ATK("A001", "Pulpen", "Pulpen pilot", 5));
        daftarATK.addData(new ATK("A002", "Pensil", "Pensil joyko", 5));
        daftarATK.addData(new ATK("A003", "Penghapus", "Penghapus FaberCastle", 5));
        daftarATK.addData(new ATK("B001", "Kertas", "HVS", 5));
        daftarATK.addData(new ATK("B002", "Buku Tulis", "Sinar dunia", 5));
        
        daftarBag.addData(new Bag("C001","Tas" ,"Tas Adidas" , 5));
        daftarBag.addData(new Bag("C002","Sepatu" ,"Sepatu Converse" , 3));
        daftarBag.addData(new Bag("C003","Tempat Pensil" ,"tempat pensil joyko" , 8));
        daftarBag.addData(new Bag("C004","Songkok" ,"Songkok Ahmad Dhani" , 9));
        daftarBag.addData(new Bag("C005","sarung" ,"Gajah Duduk" , 12));

        daftarATK.display();
        daftarBag.display();

    }

}