/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.bd;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

public class conexion_bd  {
   
    
    
    Connection conn = null;
  
    public  Connection getOracleConnection() throws SQLException {


     conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/parqueadero?serverTimezone=UTC", "root", "");
        
            
        return conn;
    }

    public PreparedStatement prepareStatement(String select__from_usuarios__WHERE_usuario__) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

