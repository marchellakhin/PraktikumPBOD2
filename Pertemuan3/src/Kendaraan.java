/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 03 Maret 2026
*/
import java.util.ArrayList;

public class Kendaraan {
    //atribut
    private String noPlat;
    private String jenis;

    //method
    //Konstruktor dengan parameter noPlat danjenis
    Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //Selektor dan mutator untuk masing-masing atribut
    public String getnoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setnoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
