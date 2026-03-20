/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Jum'at, 20 Maret 2026
*/

public class Dosen extends Pegawai {
    private String fakultas;

    public Dosen() {
    }

    public Dosen(String NIP, String Nama, Date tanggalLahir, Date tmt, double gajiPokok, String fakultas){
        super(NIP, Nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

}