/* Nama File    : Kucing.java
 * Deskripsi    : Berisi Class Kucing
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 28 April 2026
*/

public class Kucing extends Anabul {
    private double Bobot;

    public Kucing(String Nama, double Bobot) {
        super(Nama);
        this.Bobot = Bobot;
    }

    public double getBobot() {
        return Bobot;
    }

    public void setBobot(double Bobot) {
        this.Bobot = Bobot;
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