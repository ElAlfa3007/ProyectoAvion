package MySQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionSQL {
    String URL = "jdbc:mysql://localhost:3306/proyecto";
    String USER = "root";
    String PASSWORD = "";
    Connection con = null;

    //conexion a la base de datos
    public Connection getconetion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conectado");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
