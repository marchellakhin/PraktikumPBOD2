/* Nama File    : AngkaSialException.java
 * Deskripsi    : Berisi Eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 24 Maret 2026
*/

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}