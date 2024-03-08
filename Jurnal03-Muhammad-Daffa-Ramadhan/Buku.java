public class Buku {
    String judul;
    String penulis;
    String tahunTerbit;

    public Buku(String judul, String penulis, String tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    @Override
    public String toString() {
        return "Buku [judul=" + judul + ", penulis=" + penulis + ", tahunTerbit=" + tahunTerbit + "]";
    }
    
    

}
