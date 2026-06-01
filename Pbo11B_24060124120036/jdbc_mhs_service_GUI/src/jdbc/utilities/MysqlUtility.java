package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static Connection koneksi;

    // Pastikan ada kata 'static' setelah public!
    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                // Gunakan driver mysql-connector terbaru
                Class.forName("com.mysql.cj.jdbc.Driver"); 
                
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs";
                String user = "root"; // <--- Sesuaikan dengan user MySQL Workbench kamu
                String password = "marchellakhina_"; // <--- Sesuaikan dengan password MySQL Workbench kamu
                
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil");
                }
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver: " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal Koneksi: " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}