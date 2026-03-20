/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atribut dan method dalam class Pegawai
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Jum'at, 20 Maret 2026
*/

public class Pegawai {
    private String NIP;
    private String Nama;
    private Date tanggalLahir;
    private Date tmt;
    private double gajiPokok;

    public Pegawai() {
    }

    public Pegawai(String NIP, String Nama, Date tanggalLahir, Date tmt, double gajiPokok) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }
    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Date getTmt() {
        return tmt;
    }

    public void setTmt(Date tmt) {
        this.tmt = tmt;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int hitungMasaKerjaTahun() {
        int tahunSekarang = 2025;
        return tahunSekarang - tmt.getTahun();
    }

    public int hitungMasaKerjaBulan() {
        int bulanSekarang = 3;
        return bulanSekarang - tmt.getBulan();
    }

    public String getMasaKerja() {
        return hitungMasaKerjaTahun() + " tahun " + hitungMasaKerjaBulan() + " bulan";
    }

    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + Nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir.formatTanggal());
        System.out.println("TMT: " + tmt.formatTanggal());
    }
}