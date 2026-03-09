/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 03 Maret 2026
*/
import java.util.ArrayList;

public class Mahasiswa {
    //atribut
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private int sks;

public Mahasiswa(String nim, String nama, String prodi) {
    this.nim = nim;
    this.nama = nama;
    this.prodi = prodi;
    this.listMatkul = new ArrayList<>();
}

    public Mahasiswa() {
        this.listMatkul = new ArrayList<>();
    }

    public Dosen getDosenWali() { 
        return dosenWali; 
    }
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali; 
    }

    public Kendaraan getKendaraan() { 
        return kendaraan; 
    }

    public void setKendaraan(Kendaraan kendaraan) { 
        this.kendaraan = kendaraan; 
    }

    public void addMatKul(MataKuliah newMatKul) {
        listMatkul.add(newMatKul);
    }

    public int getSKS() {
        return sks;
    }

    public int getJumlahSKS() {
        int jumlah = 0;
        int i;
        for(i = 0; i < listMatkul.size(); i++) {
            jumlah += listMatkul.get(i).getSKS();
        }
        return jumlah;
    }

    public int getJumlahMatKul() {
        int jumlah = 0;
        int i;
        for(i = 0; i < listMatkul.size(); i++) {
            jumlah += 1;
        }
        return jumlah;
    }

    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        int i;
        for(i = 0; i < listMatkul.size(); i++) {
            System.out.println(listMatkul.get(i).getNama());
        }
    }
}
