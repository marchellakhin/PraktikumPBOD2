/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 03 Maret 2026
*/
import java.util.ArrayList;

public class Dosen {
    //atribut
    private String nip;
    private String nama;
    private String prodi;

    //method
    //konstruktor dengan parameter nip, nama, dan prodi
    Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Dosen() {
    //     (this.nip: "0", nama: "0", prodi: "0");
    // }

    //Selektor dan mutator untuk masing-masing atribut
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
