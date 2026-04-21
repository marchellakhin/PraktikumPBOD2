/* Nama File    : coersion.java
 * Deskripsi    : Berisi Polimorfisme AD HOC Coersion
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 21 April 2026
*/

public class coersion{
        public static void main(String[] args) {

        int N = 65;
        String SN = Integer.toString(N);
        System.out.println("a. Konversi nilai 65");
        System.out.println("Integer  : " + N);
        System.out.println("Karakter : " + (char) N);
        System.out.println("Real     : " + (double) N);
        System.out.println("String   : " + SN);

        int A = 65;
        double B = A;
        int C = (int) B;
        System.out.println("\nb. Integer - Real - Integer");
        System.out.println("Awal    : " + A);
        System.out.println("Real    : " + B);
        System.out.println("Kembali : " + C);

        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("\nc. Operasi String Integer");
        System.out.println("S Hasil Konkatenasi = " + S);
        System.out.println("Z Hasil Penjumlahan = " + Z);
        }
}