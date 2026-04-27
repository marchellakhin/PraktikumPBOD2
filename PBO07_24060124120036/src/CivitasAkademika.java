/* Nama File    : CivitasAkademika.java
 * Deskripsi    : Berisi Polimorfisme AD HOC Coersion
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Senin, 27 April 2026
*/

public abstract class CivitasAkademika {
    protected String Nama;

    public CivitasAkademika(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public abstract String getNomor();
}