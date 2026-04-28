/* Nama File    : OperatorGenerik.java
 * Deskripsi    : Berisi Class OperatorGenerik
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 28 April 2026
*/

public class OperatorGenerik {
    public static <T> void TukarKonseptual(T a, T b) {
        T temp = a;
        a = b;
        b = temp;
    }

    public static <T> void Tukar(T[] a, T[] b) {
        T temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }

    public static <T extends Kucing> double Bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot();
    }
}
