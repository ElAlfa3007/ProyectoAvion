package MySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;

import javax.swing.table.DefaultTableModel;

import Negocio.Avion;

public class AvionSQL {
    private ConexionSQL conectar = new ConexionSQL();
    private Avion avion;
    private Connection con;
    PreparedStatement ppstmt = null;
    Statement stmt = null;

    public void insertarAvion(int avion_id, String compania, String salida, String hora_salida, String destino,
            String hora_destino) {
        avion = new Avion(avion_id, compania, salida, hora_salida, destino, hora_destino);

        try {
            //conectar = new ConexionSQL();
            con = conectar.getconetion();
            ppstmt = con.prepareStatement("INSERT INTO avion VALUES(?,?,?,?,?,?)");

            ppstmt.setInt(1, avion.getAvion_id());
            ppstmt.setString(2, avion.getCompania());
            ppstmt.setString(3, avion.getSalida());
            ppstmt.setString(4, avion.getHoara_salida());
            ppstmt.setString(5, avion.getDestino());
            ppstmt.setString(6, avion.getHora_destino());

            ppstmt.executeUpdate();

            System.out.println("datos insertados...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Borrar Datos
    public void borrarAvion(int avion_id) {
        try {
            //conectar = new ConexionSQL();
            con = conectar.getconetion();
            ppstmt = con.prepareStatement("DELETE FROM avion WHERE Avion_id = " + avion_id);
            ppstmt.executeUpdate();
            System.out.println("Registro eliminado...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Actualizar Datos
    public void UpdateAvion(int avion_id, int opcion, String UpdateDato) {
        String consulta = "";

        if (opcion == 1) {
            consulta = "Avion_id = '" + UpdateDato + "'";
        }
        if (opcion == 2) {
            consulta = "Compania = " + UpdateDato;
        }
        if (opcion == 3) {
            consulta = "Salida = '" + UpdateDato + "'";
        }
        if (opcion == 4) {
            consulta = "Hora_salida = '" + UpdateDato + "'";
        }
        if (opcion == 5) {
            consulta = "Destino = '" + UpdateDato + "'";
        }
        if (opcion == 6) {
            consulta = "Hora_destino = '" + UpdateDato + "'";
        }
        try {
            //conectar = new ConexionSQL();
            con = conectar.getconetion();

            ppstmt = con.prepareStatement("UPDATE avion SET " + consulta + " WHERE Avion_id = " + avion_id);

            ppstmt.executeUpdate();
            System.out.println("Registro actualizado...");

        } catch (Exception e) {
            e.printStackTrace();
        }
        // UPDATE `cliente` SET `Nombre` = 'juan' WHERE `cliente`.`Cedula` = 123456
    }
}
