/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 03 Maret 2026
*/
import java.util.ArrayList;

public class MataKuliah {
    //atribut
    private String idMatKul;
    private String nama;
    private int sks;

    //method
    //Konstruktor dengan parameter idMatKul,nama, dan sks
    MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // MataKuliah() {
    //     this.idMatKul: "0"
    //     this.nama: "0", 
    //     this.sks: 0;
    // }

    //Selektor dan mutator untuk masing-masing atribut
    public String getidMatKul() {
        return idMatKul;
    }

    public String getNama() {
        return nama;
    }

    public int getSKS() {
        return sks;
    }

    public void setidMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSKS(int sks) {
        this.sks = sks;
    }
}
