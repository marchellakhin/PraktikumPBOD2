/* Nama File    : Burung.java
 * Deskripsi    : Berisi Class Burung
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 28 April 2026
*/

public class Burung extends Anabul {
    public Burung(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + "bergerak dengan terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + "cuit");
    }


}