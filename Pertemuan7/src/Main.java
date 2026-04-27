/* Nama File    : Main.java
 * Deskripsi    : Berisi Polimorfisme AD HOC Coersion
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Senin, 27 April 2026
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("2b. contoh aplikasi class Mahasiswa");
        Mahasiswa m1 = new Mahasiswa();
        m1.setProgramstudi();
        m1.tampil();

        Mahasiswa m2 = new Mahasiswa();
        m2.setProgramstudi("Informatika");
        m2.tampil();

        Mahasiswa m3 = new Mahasiswa();
        m3.setProgramstudi(m2);
        m3.tampil();

        System.out.println("2c. konstruktor Mahasiswa tanpa parameter");
        Mahasiswa a = new Mahasiswa();
        a.tampil();

        System.out.println("2d. konstruktor Mahasiswa dengan 3 parameter");
        Mahasiswa b = new Mahasiswa("300718", "Arkhina", "Informatika");
        b.tampil();

        System.out.println("2e. konstruktor mahasiswa dengan 1 parameter");
        Mahasiswa c = new Mahasiswa(b);
        c.tampil();

        System.out.println("3. Class Anabul");
        Anabul[] daftarHewan = {
            new Kucing("aren"),
            new Anjing("max"),
            new Burung("wari")
        };

        for (Anabul hewan : daftarHewan) {
            hewan.Gerak();
            hewan.Bersuara();
            System.out.println();
        }

        System.out.println("4e. 2 objek dosen dan 5 objek mahasiswa");
        Dosen d1 = new Dosen("Pak Budi", "D001");
        Dosen d2 = new Dosen("Bu Sari", "D002");

        Mahasiswa2 M1 = new Mahasiswa2("Kenzo", "M001");
        Mahasiswa2 M2 = new Mahasiswa2("Liebert", "M002");
        Mahasiswa2 M3 = new Mahasiswa2("Billy", "M003");
        Mahasiswa2 M4 = new Mahasiswa2("Emma", "M004");
        Mahasiswa2 M5 = new Mahasiswa2("Percy", "M005");
        
        System.out.println("4i. setWali");
        M1.setWali(d1);
        M2.setWali(d1);
        M3.setWali(d2);
        M4.setWali(d2);
        M5.setWali(d1);

        Seminar seminar = new Seminar();

        System.out.println("4f. prosedur Registrasi dengan ketujuh objek peserta");
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(M1);
        seminar.registrasi(M2);
        seminar.registrasi(M3);
        seminar.registrasi(M4);
        seminar.registrasi(M5);

        System.out.println("4g. tampilPeserta");
        seminar.tampilPeserta();

        System.out.println("4c. countPeserta");
        System.out.println("Total peserta: " + seminar.countPeserta());

        System.out.println("4h. countMahasiswa");
        System.out.println("Jumlah mahasiswa: " + seminar.countMahasiswa());
        
        System.out.println("4j. tampilDataMahasiswa");
        System.out.println("\nData Mahasiswa:");
        M1.tampilDataMahasiswa();
        M2.tampilDataMahasiswa();
        M3.tampilDataMahasiswa();
        M4.tampilDataMahasiswa();
        M5.tampilDataMahasiswa();
    }
}

/*Polimorfisme itu konsep di OOP yang bikin satu method bisa punya banyak bentuk atau perilaku yang berbeda. 
Jadi walaupun nama method-nya sama, hasilnya bisa beda tergantung objek atau parameternya.
Di praktikum ini, polimorfisme kelihatan dari beberapa hal. 
Pertama, dari konversi tipe data (coercion), misalnya integer bisa jadi char, 
double, atau string. Kedua, dari overloading, yaitu method yang sama tapi parameternya beda.
Ketiga, dari inheritance dan overriding, kayak di contoh Anabul,
di mana tiap hewan punya suara dan gerakan yang beda walaupun method-nya sama.*/