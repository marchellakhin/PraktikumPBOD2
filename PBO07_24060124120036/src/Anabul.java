/* Nama File    : Anabul.java
 * Deskripsi    : Berisi Polimorfisme AD HOC Coersion
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Senin, 27 April 2026
*/

public abstract class Anabul {
    private String Nama;

    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public abstract void Gerak();
    public abstract void Bersuara();
}