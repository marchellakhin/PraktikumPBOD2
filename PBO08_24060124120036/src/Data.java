/* Nama File    : Data.java
 * Deskripsi    : Berisi Class Data
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Senin, 04 Mei 2026
*/

public class Data<G> {
    private G[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        ruang = (G[]) new Object[100];
        banyak = 0;
    }

    public G getIsi(int posisi) {
        if (posisi >= 1 && posisi <= 100) {
            return ruang[posisi - 1];
        } else {
            System.out.println("Indeks diluar jangkauan");
            return null;
        }
    }

    public void setIsi(int posisi, G objek) {
        if (posisi >= 1 && posisi <= 100) {
            if (ruang[posisi - 1] == null) {
            banyak++;
            }
            ruang[posisi - 1] = objek;
        } else {
            System.out.println("Indeks diluar jangkauan");
        }
    }

    public int getSize() {
        return banyak;
    }
}