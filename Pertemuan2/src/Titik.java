/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 24 Februari 2026
*/
public class Titik {
    /*************ATRIBUT**************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*************METHOD************* */
    //konstruktor untuk membuat titik (0,0)

    Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    static int getCounterTitik() {
        return counterTitik;
    }

    //konstruktor untuk membuat titik (0,0)
    Titik() {
        this(0,0);
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    } 

    //mengset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    } 

    //mengggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    int getKuadran() {
        if((absis > 0 && ordinat > 0)) {
            return 1;
        }
        if((absis < 0 && ordinat > 0)) {
            return 2;
        }
        if((absis < 0 && ordinat < 0)) {
            return 3;
        }
        if((absis > 0 && ordinat < 0)) {
            return 4;
        } else {
            return 0;
        }
    }

    double getJarakPusat() {
        return Math.sqrt(absis*absis+ordinat*ordinat);
    }

    double getJarak(Titik M) {
        double dx = absis - M.absis;
        double dy = ordinat - M.ordinat;
        return Math.sqrt(dx*dx+dy*dy);
    }

    void refleksiX() {
        ordinat = -ordinat;
    }

    void refleksiY() {
        absis = -absis;
    }

    Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }

    void printcounterTitik() {
        System.out.println(Titik.counterTitik);
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}
