/* Nama File    : Burung.java
 * Deskripsi    : Berisi Polimorfisme AD HOC Coersion
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Senin, 27 April 2026
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