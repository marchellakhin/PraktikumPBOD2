/* Nama File    : Seminar.java
 * Deskripsi    : Berisi Polimorfisme AD HOC Coersion
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Senin, 27 April 2026
*/

public class Seminar {
    private CivitasAkademika[] pesertas = new CivitasAkademika[100];
    private int banyakpeserta;

    public Seminar() {
        banyakpeserta = 0;
    }

    public void registrasi(CivitasAkademika c) {
        if (banyakpeserta < 100) {
            pesertas[banyakpeserta] = c;
            banyakpeserta++;
        } else {
            System.out.println("registrasi penuh");
        }
    }

    public int countPeserta() {
        return banyakpeserta;
    }

    public void tampilPeserta() {
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println(pesertas[i].getNomor() + " | " + pesertas[i].getNama());
        }
    }

    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa2) {
                count++;
            }
        }
        return count;
    }
}