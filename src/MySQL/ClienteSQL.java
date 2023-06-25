package MySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import Negocio.Cliente;

public class ClienteSQL {
    private ConexionSQL conectar= new ConexionSQL();;
    private Cliente cliente;
    private Connection con;
    PreparedStatement ppstmt = null;
    Statement stmt = null;

    //Agregar Datos
    public void insertarCliente(String cedula, String nombre, String sexo, int edad) {
        cliente = new Cliente(cedula, nombre, sexo, edad);

        try {
            //conectar = new ConexionSQL();
            con = conectar.getconetion();
            ppstmt = con.prepareStatement("INSERT INTO cliente VALUES(?,?,?,?)");

            ppstmt.setString(1, cliente.getCedula());
            ppstmt.setString(2, cliente.getNombre());
            ppstmt.setString(3, cliente.getSexo());
            ppstmt.setInt(4, cliente.getEdad());

            ppstmt.executeUpdate();

            System.out.println("datos insertados...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Borrar Datos
    public void borrarCliente(String cedula) {
        try {
            //conectar = new ConexionSQL();
            con = conectar.getconetion();
            ppstmt = con.prepareStatement("DELETE FROM cliente WHERE Cedula = " + cedula);
            ppstmt.executeUpdate();
            System.out.println("Registro eliminado...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Actualizar Datos
    public void UpdateCliente(String cedula, int opcion, String UpdateDato) {
        String consulta = "";

        if (opcion == 1) {
            consulta = "Cedula = '" + UpdateDato+"'";
        }
        if (opcion == 2) {
            consulta = "Nombre = '" + UpdateDato+"'";
        }
        if (opcion == 3) {
            consulta = "Edad = '" + Integer.parseInt(UpdateDato)+"'";
        }
        if (opcion == 4) {
            consulta = "Sexo = '" + UpdateDato+"'";
        }
        
        try {
            //conectar = new ConexionSQL();
            con = conectar.getconetion();
            ppstmt = con.prepareStatement("UPDATE cliente SET " + consulta + " WHERE Cedula = "+cedula);
            ppstmt.executeUpdate();
            System.out.println("Registro actualizado...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //UPDATE `cliente` SET `Nombre` = 'juan' WHERE `cliente`.`Cedula` = 123456
    }

}
