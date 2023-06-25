package MySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Negocio.Asiento;

public class AsientoSQL {
    private ConexionSQL conectar = new ConexionSQL();
    private Asiento asiento;
    private Connection con = conectar.getconetion();
    PreparedStatement ppstmt = null;
    Statement stmt = null;

    public void insertarAsientos(int asiento_id, String estado, String clase, String avion_id) {
        asiento = new Asiento(asiento_id, estado, clase, avion_id);
        try {
            // conectar = new ConexionSQL();
            // con = conectar.getconetion();
            ppstmt = con.prepareStatement("INSERT INTO seatFlight" + avion_id + " VALUES(?,?,?,?)");

            ppstmt.setInt(1, asiento.getAsiento_id());
            ppstmt.setString(2, asiento.isEstado());
            ppstmt.setString(3, asiento.getClase());
            ppstmt.setString(4, asiento.getAvion_id());
            ppstmt.executeUpdate();

            System.out.println("datos insertados...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizarAsiento(String avion_id, int asiento_id, String estado) {
        try {
            // conectar = new ConexionSQL();
            con = conectar.getconetion();
            ppstmt = con.prepareStatement("UPDATE seatflight" + avion_id + " SET Estado = '" + estado + "' WHERE Asiento_id = " + asiento_id);
            ppstmt.executeUpdate();
            System.out.println("Registro actualizado...");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // CREATE Table asiento(
    // Asiento_id INT(3),
    // Estado BOOLEAN,
    // Clase VARCHAR(3),
    // Avion_id INT(10),
    // PRIMARY KEY(Asiento_id),
    // CONSTRAINT FOREIGN KEY(Avion_id) REFERENCES avion(Avion_id) ON UPDATE CASCADE
    // )
    // crea una tabla de asientos para un
    public void setVueloAsientos(String avion_id) {
        conectar = new ConexionSQL();
        con = conectar.getconetion();
        try {
            String tabalSQL = "CREATE TABLE seatFlight" + avion_id + " ("
                    + "Asiento_id INT(3),"
                    + "Estado VARCHAR(10),"
                    + "Clase VARCHAR(10),"
                    + "Avion_id INT(10),"
                    + "PRIMARY KEY(Asiento_id),"
                    + "CONSTRAINT FOREIGN KEY(Avion_id) REFERENCES avion(Avion_id) ON UPDATE CASCADE"
                    + ");";
            stmt = con.createStatement();
            stmt.execute(tabalSQL);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setAsientosAvion_1(String avion_id) {
        setVueloAsientos(avion_id);

        for (int i = 1; i <= 5; i++) {
            insertarAsientos(i, "Libre", "vip", avion_id);
        }
        for (int i = 6; i <= 44; i++) {
            insertarAsientos(i, "Libre", "turista", avion_id);
        }
    }

    public boolean isAsientoFull(String avion_id, int seat) {
        String dato = "";
        String dato2 = "Libre";
        try {
            String sql = "SELECT Estado FROM seatflight" + avion_id + " WHERE Asiento_id = '" + seat + "'";
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                dato = rs.getString("Estado");
            } else {
                JOptionPane.showMessageDialog(null, "El asiento no existe");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (dato.equals("Libre")) {
            return true;
        } else {
            return false;
        }
    }
}
