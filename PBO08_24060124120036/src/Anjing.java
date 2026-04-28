/* Nama File    : Anjing.java
 * Deskripsi    : Berisi Class Anjing
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 28 April 2026
*/

public class Anjing extends Anabul {
    public Anjing(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + "  bergerak dengan melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " berbunyi: guk-guk");
    }
}