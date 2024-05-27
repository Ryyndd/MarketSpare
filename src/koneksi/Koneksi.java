package koneksi;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Koneksi {

    public static Connection connectionmysql;

    public static Connection ConnectionDB() {
        if (connectionmysql == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/db_marketspare";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                connectionmysql = (Connection) DriverManager.getConnection(url, user, pass);
                JOptionPane.showMessageDialog(null, "Connection Succes");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "connection Failed");
            }
        }

        return connectionmysql;
    }
}
