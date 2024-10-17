package maulana.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

public class KoneksiDB {

    private String url = "jdbc:mysql://localhost:3306/artomoro";
    private String user = "root";
    private String pass = "";
    
    public Connection getKoneksi() {
        Connection koneksi = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(url, user, pass);            
            System.out.println("koneksi berhasil");
        } catch (Exception e) {
            System.out.println("koneksi gagal");
        }
        return koneksi;
    }
}
