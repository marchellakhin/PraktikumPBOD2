/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 24 Februari 2026
*/
public class MTitik {
    public static void main(String[] args) {
        Titik T0 = new Titik(); //Membuat objek titik T0 (0,0)
        Titik T1 = new Titik(3, 4);
        
        //setAbsis
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3

        //setOrdinat
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //mencetak koordinat T1 ke layar

        //geser
        T1.geser(3, 4); //menggeser T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser

        //getCounterTitik
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        
        //getKuadran
        System.out.println("Letak T1 berada di kuadran = " + T1.getKuadran());
        
        //getJarakPusat
        System.out.println("Jarak ke pusat: " + T1.getJarakPusat());
        
        //getJarak
        Titik T2 = new Titik(-2, 5);
        System.out.println("Jarak T1 ke T2: " + T1.getJarak(T2));
        
        //refleksiX
        T2.refleksiX();
        System.out.print("T2 setelah refleksi X: ");
        T2.printTitik();
        
        //refleksiY
        T1.refleksiY();
        System.out.print("T1 setelah refleksi Y: ");
        T1.printTitik();

        //getRefleksiX
        Titik T3 = T1.getRefleksiX();
        System.out.print("Refleksi sumbu X: ");
        T3.printTitik();

        //getRefleksiY
        Titik T4 = T1.getRefleksiY();
        System.out.print("Refleksi sumbu Y: ");
        T4.printTitik();
    }
}
