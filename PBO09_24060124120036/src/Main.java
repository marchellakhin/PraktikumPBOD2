/* Nama File    : Main.java
 * Deskripsi    : Berisi Class Main
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 28 April 2026
*/

public class Main {
    public static void main(String[] args) {
        Teman<String> KoleksiTeman = new Teman<>();
        System.out.println("menambahkan teman: ");
        KoleksiTeman.addnama("ali");
        KoleksiTeman.addnama("azka");
        KoleksiTeman.addnama("basil");
        KoleksiTeman.addnama("caesar");
        KoleksiTeman.addnama("bayu");
        KoleksiTeman.addnama("devano");
        KoleksiTeman.addnama("dinda");
        KoleksiTeman.addnama("elza");
        KoleksiTeman.addnama("ferdy");
        KoleksiTeman.addnama("ghatfan");
        KoleksiTeman.addnama("isan");
        KoleksiTeman.addnama("hasta");
        KoleksiTeman.addnama("ijat");
        KoleksiTeman.addnama("marcel");
        KoleksiTeman.addnama("menza");
        KoleksiTeman.addnama("rama");
        KoleksiTeman.addnama("lutfi");
        KoleksiTeman.addnama("naufal");
        KoleksiTeman.addnama("atta");
        KoleksiTeman.addnama("vela");

        System.out.println("\n daftar teman");
        KoleksiTeman.showTeman();

        // getNbelm()
        System.out.println("\njumlah teman : " + KoleksiTeman.getNbelm());

        // getNama(indeks)
        System.out.println("\nteman pada indeks ke-3 : ");
        System.out.println(KoleksiTeman.getnama(3));

        // setNama(indeks, nama)
        System.out.println("\nmengubah nama pada indeks ke-0");
        KoleksiTeman.setnama(1, "azka");

        System.out.println("hasil setelah setnama : ");
        KoleksiTeman.showTeman();

        // isMember(nama)
        System.out.println("\ncek member : ");
        System.out.println(KoleksiTeman.isMember("marcel"));

        // gantiNama(nama, namabaru)
        System.out.println("\nmengganti nama marcel");

        KoleksiTeman.gantinama("marcel", "cela");

        System.out.println("hasil setelah gantinama : ");
        KoleksiTeman.showTeman();

        // delNama(nama)
        System.out.println("\nmenghapus ali");

        KoleksiTeman.delnama("ali");

        System.out.println("hasil setelah delnama : ");
        KoleksiTeman.showTeman();

        // KOLEKSI KELAS BENTUKAN
        Piaraan klinik = new Piaraan();

        Anggora k1 = new Anggora("juju", 3.5);
        Kembangtelon k2 = new Kembangtelon("koma", 4.2);
        Anjing a1 = new Anjing("tami");
        Burung b1 = new Burung("lumi");

        klinik.enqueueAnabul(k1);
        klinik.enqueueAnabul(k2);
        klinik.enqueueAnabul(a1);
        klinik.enqueueAnabul(b1);

        System.out.println("=== daftar anabul ===");
        klinik.showAnabul();

        System.out.println("\njumlah anabul : ");
        System.out.println(klinik.getNbelm());

        System.out.println("\nanabul paling depan : ");
        System.out.println(klinik.getAnabul().getNama());

        System.out.println("\njumlah keluarga kucing : ");
        System.out.println(klinik.countKucing());

        System.out.println("\ntotal bobot kucing : ");
        System.out.println(klinik.bobotKucing());

        System.out.println("\njenis anabul : ");
        klinik.showJenisAnabul();

        System.out.println("\ndequeue anabul : ");
        System.out.println(klinik.dequeueAnabul().getNama());

        System.out.println("\nisi antrean setelah dequeue : ");
        klinik.showAnabul();
    }
}

/*Koleksi berfungsi sebagai tempat penyimpanan yang dapt menampung banyak data dalam satu wadah agar mudah diatur.
Padda program ini, koleksi digunakan untuk menyimpan data peliharaan ke dalam antrian dengan sistem first in first out
yaitu mendahulukan sesuai dengan antrian masuk. Program ini memudahkan kita dalam menambah, mencari, menamilkan, dan menghapus 
data peliharaan tanpa harus membuat variabel satu per satu. */
