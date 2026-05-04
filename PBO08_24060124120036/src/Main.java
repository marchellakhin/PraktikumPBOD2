/* Nama File    : Main.java
 * Deskripsi    : Berisi Class Main
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 28 April 2026
*/

public class Main {
    public static void main(String[] args) {
        // GENERIK PADA CLASS DATUM
        System.out.println("DATUM GENERIK");

        Datum<Anabul> d1 = new Datum<>(new Anjing("Tenma"));
        Datum<Anabul> d2 = new Datum<>(new Burung("Bryce"));
        Datum<Kucing> d3 = new Datum<>(new Anggora("Merlin", 3.5));

        d1.getIsi().Gerak();
        d1.getIsi().Bersuara();

        d2.getIsi().Gerak();
        d2.getIsi().Bersuara();

        d3.getIsi().Gerak();
        d3.getIsi().Bersuara();

        // GENERIK PADA OPERATOR
        System.out.println("\nTUKAR INTEGER");

        Integer[] a = {3};
        Integer[] b = {6};

        System.out.println("Sebelum tukar:");
        System.out.println("a = " + a[0]);
        System.out.println("b = " + b[0]);

        OperatorGenerik.Tukar(a, b);

        System.out.println("Sesudah tukar:");
        System.out.println("a = " + a[0]);
        System.out.println("b = " + b[0]);

        System.out.println("\nTUKAR STRING");

        String[] s1 = {"Dua"};
        String[] s2 = {"Lima"};

        System.out.println("Sebelum tukar:");
        System.out.println("s1 = " + s1[0]);
        System.out.println("s2 = " + s2[0]);

        OperatorGenerik.Tukar(s1, s2);

        System.out.println("Sesudah tukar:");
        System.out.println("s1 = " + s1[0]);
        System.out.println("s2 = " + s2[0]);

        System.out.println("\nTUKAR ANABUL");

        Anabul[] x = {new Anjing("Arkhi")};
        Anabul[] y = {new Kucing("Kit", 4)};

        System.out.println("Sebelum tukar:");
        System.out.println(x[0].getNama());
        System.out.println(y[0].getNama());

        OperatorGenerik.Tukar(x, y);

        System.out.println("Sesudah tukar:");
        System.out.println(x[0].getNama());
        System.out.println(y[0].getNama());

        // BOBOT2
        System.out.println("\nBOBOT2");

        Anggora ang = new Anggora("Lani", 3);
        Kembangtelon kem = new Kembangtelon("Biru", 4);

        double totalBobot = OperatorGenerik.Bobot2(ang, kem);

        System.out.println("Total bobot = " + totalBobot);

        // LARIK GENERIK
        System.out.println("\nDATA GENERIC");

        Data<Anabul> data = new Data<>();

        data.setIsi(1, new Anjing("Tenma"));
        data.setIsi(2, new Burung("Bryce"));
        data.setIsi(3, new Anggora("Biru", 2.5));

        System.out.println("Jumlah elemen = " + data.getSize());

        for (int i = 1; i <= data.getSize(); i++) {
            Anabul a1 = data.getIsi(i);

            System.out.println("\nData ke-" + i);
            System.out.println("Nama : " + a1.getNama());

            a1.Gerak();
            a1.Bersuara();
        }
    }
}

/*Renungan : Simpulkan bagaimana cara kerja konsep Generik sesuai kalimat Anda sendiri!
Dapat disimpulkan bahwa konsep Generik pada Java bekerja dengan membuat class, method, 
atau interface yang dapat digunakan untuk berbagai tipe data tanpa perlu membuat kode yang sama
dimana kita dapat menentukan tipe data saat objek dibuat sehingga programnya lebih fleksibel 
karena kesalahan tipe data dapat dideteksi saat proses kompilasi dan dengan generik, 
satu class atau method dapat dipakai untuk berbagai objek.*/