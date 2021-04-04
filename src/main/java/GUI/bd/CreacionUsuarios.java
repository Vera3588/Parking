/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CreacionUsuarios {

    private String sqlInsertarEstudiantes = "INSERT INTO usuarios (usuario, clave, correo)"
            + "VALUES(?, ?, ?);";
    private String sqlInsertarVehiculos = "INSERT INTO vehiculos (piso, espacio, total)"
            + "VALUES(?, ?, ?);";

    public void RegistroUsuarios(String usuario, String clave, String correo) {

        conexion_bd conexionRegistroEstudiantes = new conexion_bd();
        Connection obtenerconexionBD;
        try {
            // obtengo la conexion
            obtenerconexionBD = conexionRegistroEstudiantes.getOracleConnection();

            PreparedStatement prepararsentenciasql = obtenerconexionBD.prepareStatement(sqlInsertarEstudiantes);

            prepararsentenciasql.setString(1, usuario);
            prepararsentenciasql.setString(2, clave);
            prepararsentenciasql.setString(3, correo);

            int estadoDeLaEjecucion = prepararsentenciasql.executeUpdate();
            obtenerconexionBD.close();

            if (estadoDeLaEjecucion > 0) {

                JOptionPane.showMessageDialog(null, "Registro satisfactorio de usuario");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en BD al insertar usuario" + ex);
        }

    }
    
    public void RegistroVehiculos(int piso, int espacio, int total) {
        
        
        conexion_bd conexionRegistroVehiculos = new conexion_bd();
        Connection obtenerconexionBD;
        try {
            // obtengo la conexion
            obtenerconexionBD = conexionRegistroVehiculos.getOracleConnection();

            PreparedStatement prepararsentenciasql = obtenerconexionBD.prepareStatement(sqlInsertarVehiculos);

            prepararsentenciasql.setInt(1, piso);
            prepararsentenciasql.setInt(2, espacio);
           
            
            prepararsentenciasql.setInt(3, total);
            
              

            int estadoDeLaEjecucion = prepararsentenciasql.executeUpdate();
            obtenerconexionBD.close();

            if (estadoDeLaEjecucion > 0) {

                JOptionPane.showMessageDialog(null, "Se ha sacado correctamente el vehiculo");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en BD al insertar vehiculo" + ex);
        }

    }
    
}
