/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam class Bangun Datar
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 17 Maret 2026
*/

public class Main{
    public static void main(String[] args) {
        BangunDatar B1 = new BangunDatar();
        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L1 = new Lingkaran (14)
        System.out.println("Jumlah Sisi = " + M.getJmlSisi());
        System.out.println("Luas Persegi = " + M.getLuas());
        System.out.println("Keliling Persegi = " + M.getKeliling());
        System.out.println("Luas Lingkaran = " + L.getLuas());
        System.out.println("Keliling Lingkaran = " + L.getKeliling());
    }
}