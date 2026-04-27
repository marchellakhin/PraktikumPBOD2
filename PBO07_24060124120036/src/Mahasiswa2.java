/* Nama File    : Mahasiswa2.java
 * Deskripsi    : Berisi Polimorfisme AD HOC Coersion
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Senin, 27 April 2026
*/

public class Mahasiswa2 extends CivitasAkademika {
    private String NIM;
    private Dosen Dosenwali;

    public Mahasiswa2(String Nama, String NIM) {
        super(Nama);
        this.NIM = NIM;
    }

    @Override
    public String getNomor() {
        return NIM;
    }

    public void setWali(Dosen d) {
        this.Dosenwali = d;
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        if (Dosenwali != null) {
            System.out.println("Dosen Wali: " + Dosenwali.getNama());
        }
        System.out.println();
    }
}