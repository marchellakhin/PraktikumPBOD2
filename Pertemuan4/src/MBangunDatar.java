/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam class Bangun Datar
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 10 Maret 2026
*/

public class MBangunDatar {
    public static void main(String[] args) {
        Persegi M = new Persegi(4, "Hitam", "Putih");
        M.printInfo();
        System.out.println("Jumlah Sisi = " + M.getJmlSisi());
        System.out.println("Luas Persegi = " + M.getLuas());
        System.out.println("Keliling Persegi = " + M.getKeliling());
    }
}

