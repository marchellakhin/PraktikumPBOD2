/* Nama File    : Coersion.java
 * Deskripsi    : Berisi Polimorfisme AD HOC Coersion
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 21 April 2026
*/

public class Coersion{
        public static void main(String[] args) {
        // a
        int intN = 65;
        char charN = (char) intN;
        double realN = intN;
        String stringN = Integer.toString(intN);
        System.out.println("a. Konversi nilai 65");
        System.out.println("Integer  : " + intN);
        System.out.println("Karakter : " + charN);
        System.out.println("Real     : " + realN);
        System.out.println("String   : " + stringN);


        // b
        int intAwal = 65;
        double ubahReal = intAwal;
        int intKembali = (int) ubahReal;
        System.out.println("\nb. Integer->Real->Integer");
        System.out.println("Bilangan awal    : " + intAwal);
        System.out.println("Bilangan real    : " + ubahReal);
        System.out.println("Bilangan kembali : " + intKembali);


        // c
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("\nc. Operasi String Integer");
        System.out.println("S (Konkatenasi) = " + S);
        System.out.println("Z (Penjumlahan) = " + Z);

        // d
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("\nc. Operasi String Integer");
        System.out.println("R (Konkatenasi) = " + R);
        System.out.println("D (Penjumlahan) = " + D);

        // e
        Integer A = Integer.parseInt(S);
        System.out.println("\nA = " + A);

        // f
        String T = A.toString();
        System.out.println("T = " + T);
        }
}