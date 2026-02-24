/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 24 Februari 2026
*/
public class Titik1 {
    /*************ATRIBUT**************/
    double absis;
    double ordinat;
    static int countterTitik = 0;

    /*************METHOD************* */
    //konstruktor untuk membuat titik (0,0)

    Titik1(double x, double y) {
        absis = x;
        ordinat = y;
        countterTitik++;
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
        if((absis > 0) && (ordinat > 0)) {
            return 1;
        }
        if((absis < 0) && (ordinat > 0)) {
            return 2;
        }
        if((absis < 0) && (ordinat < 0)) {
            return 3;
        }
        if((absis > 0) && (ordinat < 0)) {
            return 4;
        } else {
            return 0;
        }
    }

    Titik1 getRefleksiX() {
        Titik1 T = new Titik1(abis, ordinat*-1);
        return T;
    }


    void printcounterTitik() {
        System.out.println(this.countterTitik);
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}
