/* Nama File    : Mahasiswa.java
 * Deskripsi    : Berisi Polimorfisme AD HOC Coersion
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Senin, 27 April 2026
*/

public class Mahasiswa {
    private String NIM;
    private String Nama;
    private String Programstudi;

    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.Programstudi = "n/a";
    }

    public Mahasiswa(String NIM, String Nama, String Programstudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }

    public Mahasiswa(Mahasiswa m) {
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.Programstudi = m.Programstudi;
    }

    public void setProgramstudi() {
        this.Programstudi = "Kosong";
    }

    public void setProgramstudi(String prodi) {
        this.Programstudi = prodi;
    }

    public void setProgramstudi(Mahasiswa m) {
        this.Programstudi = m.Programstudi;
    }

    public void tampil() {
        System.out.println(NIM + " | " + Nama + " | " + Programstudi);
    }
}