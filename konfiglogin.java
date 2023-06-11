package uas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class konfiglogin {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if (koneksi==null){
            try{
                String url = new String();
                String user = new String();
                String password = new String();
                url = "jdbc:mysql://localhost:3306/dbtelevisi";
                user = "root";
                password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
            }catch(SQLException t){
                System.out.println("Koneksi Gagal!");
            }
        }
        return koneksi;
    }
}
