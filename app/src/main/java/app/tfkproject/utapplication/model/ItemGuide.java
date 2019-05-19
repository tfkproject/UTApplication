package app.tfkproject.utapplication.model;

/**
 * Created by taufik on 15/05/18.
 */

public class ItemGuide {
    String judul, keterangan;
    int gambar;

    public ItemGuide(String judul, int gambar, String keterangan){
        this.judul = judul;
        this.gambar = gambar;
        this.keterangan = keterangan;
    }

    public String getJudul() {
        return judul;
    }

    public int getGambar() {
        return gambar;
    }

    public String getKeterangan() {
        return keterangan;
    }
}
