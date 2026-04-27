/* Nama File    : Kucing.java
 * Deskripsi    : Berisi Polimorfisme AD HOC Coersion
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Senin, 27 April 2026
*/

public class Kucing extends Anabul {
    public Kucing(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + "bergerak dengan melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + "meong");
    }
}