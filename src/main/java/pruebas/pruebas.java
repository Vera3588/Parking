/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;
import GUI.bd.*;
import java.sql.Connection;
import java.sql.SQLException;

public class pruebas {
    
   public static void main(String[] args) throws SQLException, ClassNotFoundException {
  
       conexion_bd conexionRegistroEstudiantes = new conexion_bd();
        Connection obtenerconexionBD = conexionRegistroEstudiantes.getOracleConnection();
        
        
        CreacionUsuarios nuevo = new CreacionUsuarios();
        
        nuevo.RegistroUsuarios("Admin", "Admin", "Admin");
        
  
    }
  
}
