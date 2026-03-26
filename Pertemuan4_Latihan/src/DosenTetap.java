/* Nama File    : DosenTetap.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen Tetap
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Jum'at, 20 Maret 2026
*/

public class DosenTetap extends Dosen {
    private String NIDN;

    public DosenTetap() {
    }

    public DosenTetap(String NIP, String NIDN, String Nama, Date tanggalLahir, Date tmt,
    double gajiPokok, String fakultas) {
        super(NIP, Nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    public String getNIDN() {
        return NIDN;
    }

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    public int getBUP() {
        return 65;
    }

    public String hitungTanggalPensiun() {
        int tahun = getTanggalLahir().getTahun() + getBUP();
        int bulan = getTanggalLahir().getBulan() + 1;
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        return "1 " + namaBulan[bulan-1] + " " + tahun;
    }

    public double hitungTunjangan() {
        int masaKerja = hitungMasaKerjaTahun();
        return 0.02 * masaKerja * getGajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        int masaKerja = hitungMasaKerjaTahun();
        System.out.println("NIDN: " + NIDN);
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Masa Kerja: " + getMasaKerja());
        System.out.println("Tanggal Pensiun: " + hitungTanggalPensiun());
        System.out.println("Gaji Pokok: Rp " + getGajiPokok());
        System.out.println(
                "Tunjangan: 2% x " + masaKerja +
                " x Rp " + getGajiPokok() +
                " = Rp " + hitungTunjangan()
        );
    }
}