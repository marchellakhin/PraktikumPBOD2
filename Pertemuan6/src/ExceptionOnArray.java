/* Nama File    : Asersi1.java
 * Deskripsi    : Berisi Program penggunaan eksepsi menggunakan class library Java             jari-jari lingkaran yang bernilai nolberisi Class Asersi2
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 24 Maret 2026
*/

public class ExceptionOnArray{
    public static void main(String[] args){
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}