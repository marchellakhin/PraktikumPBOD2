/* Nama File    : Anabul.java
 * Deskripsi    : Berisi Class Anabul
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 28 April 2026
*/

public abstract class Anabul {
    private String Nama;

    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public abstract void Gerak();
    public abstract void Bersuara();
}