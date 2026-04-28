/* Nama File    : Main.java
 * Deskripsi    : Berisi Class Main
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 28 April 2026
*/

public class Main {
    public static void main(String[] args) {
        // Datum berisi Anggora (keturunan Kucing/Anabul)
        Datum<Anggora> datumAnggora = new Datum<>();
        datumAnggora.setIsi(new Anggora("Kitty", 3.5));
        System.out.println("Datum Anggora             : " + datumAnggora.getIsi().getNama()
                + " (bobot: " + datumAnggora.getIsi().getBobot() + " kg)");
        datumAnggora.getIsi().Bersuara();
        datumAnggora.getIsi().Gerak();
    }
}