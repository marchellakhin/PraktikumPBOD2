/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam class MBangunDatar
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 17 Maret 2026
*/

public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar P1 = new Persegi(10, "Pink", "Putih");
        Persegi P2 = new Persegi(10, "Hijau", "Putih");
        BangunDatar L1 = new Lingkaran(14, "Biru", "Pink");
        Lingkaran L2 = new Lingkaran(28, "Merah", "Putih");
        P1.printInfo();
        System.out.println();
        P2.printInfo();
        System.out.println();
        L1.printInfo();
        System.out.println();
        L2.printInfo();
        System.out.println();

        System.out.println("Apakah luas P1 sama dengan P2? " + P1.isEqualLuas(P2));
        System.out.println("Apakah keliling L1 sama dengan L2? " + L1.isEqualKeliling(L2));

        System.out.println("\nSebelum Resize");
        P1.printInfo();
        L1.printInfo();

        IResize p = (IResize) P1;
        IResize l = (IResize) L1;
        p.zoomIn();
        l.zoomIn();
        System.out.println("\nZoom In 10%");
        P1.printInfo();
        L1.printInfo();
        p.zoomOut();
        l.zoomOut();
        System.out.println("\nZoom Out 10%");
        P1.printInfo();
        L1.printInfo();
        p.zoom(200);
        l.zoom(50);
        System.out.println("\nZoom");
        P1.printInfo();
        L1.printInfo();
    }
}