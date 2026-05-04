/* Nama File    : Datum.java
 * Deskripsi    : Berisi Class Datum
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 28 April 2026
*/

public class Datum<G> {
    private G isi;

    public Datum(G isi) {
        this.isi = isi;
    }

    public G getIsi() {
        return isi;
    }

    public void setIsi(G isibaru) {
        this.isi = isibaru;
    }
}
