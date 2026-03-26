/* Nama File    : MPegawai.java
 * Deskripsi    : berisi atribut dan method dalam class MPegawai
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Jum'at, 20 Maret 2026
*/

public class MPegawai {
    public static void main(String[] args) {
        System.out.println("Dosen Tetap");

        Date lahir = new Date();
        lahir.setHari(5);
        lahir.setBulan(5);
        lahir.setTahun(1990);

        Date tmt = new Date();
        tmt.setHari(1);
        tmt.setBulan(1);
        tmt.setTahun(2005);

        DosenTetap d = new DosenTetap();

        d.setNIP("135001855");
        d.setNIDN("78647324");
        d.setNama("Arkhi");
        d.setTanggalLahir(lahir);
        d.setTmt(tmt);
        d.setFakultas("Fakultas Sains dan Matematika");
        d.setGajiPokok(5000000);

        d.printInfo();
        System.out.println("\nDosen Tamu");
        Date lahir2 = new Date(15, 7, 2001);
        Date tmt2 = new Date(1, 9, 2023);
        Date akhirKontrak = new Date(1, 9, 2025);

        DosenTamu DT = new DosenTamu("135007889", "11223344", "Alex Turner", lahir2,                     
        tmt2, 4500000, "Fakultas 505", akhirKontrak);
        DT.printInfo();

        System.out.println("\nTendik");
        Date lahir3 = new Date(1, 12, 1998);   
        Date tmt3 = new Date(1, 1, 2020);
        Tendik T = new Tendik("135001966", "Bill Skarsgard", lahir3, tmt3, 4000000,"Fakultas Sastra Mesin" );
        T.printInfo();
    }
    
}