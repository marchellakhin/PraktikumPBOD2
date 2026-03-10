/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam class Bangun Datar
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 10 Maret 2026
*/

public class Lingkaran extends BangunDatar {
    private double jari;
    
    public Lingkaran() {
        
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(1, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Jari: " + getJari());
    }
}
