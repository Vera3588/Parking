/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.bd.CreacionUsuarios;
import GUI.bd.conexion_bd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GUILogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public GUILogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jBingresarLogin = new javax.swing.JButton();
        jLparqueaderoPrincipal = new javax.swing.JLabel();
        jBsalirLogin = new javax.swing.JButton();
        jTFusuarioLogin = new javax.swing.JTextField();
        jPFcontraseñaLogin = new javax.swing.JPasswordField();
        jBcrearusuarioLogin = new javax.swing.JButton();
        jLusuarioLogin = new javax.swing.JLabel();
        jLcontraseñaLogin = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(227, 227, 124));

        jPanel2.setBackground(new java.awt.Color(227, 227, 124));

        jBingresarLogin.setBackground(new java.awt.Color(0, 0, 0));
        jBingresarLogin.setForeground(new java.awt.Color(255, 255, 255));
        jBingresarLogin.setText("Ingresar");
        jBingresarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBingresarLoginActionPerformed(evt);
            }
        });

        jLparqueaderoPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        jLparqueaderoPrincipal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLparqueaderoPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLparqueaderoPrincipal.setText("Parqueadero JX");
        jLparqueaderoPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBsalirLogin.setBackground(new java.awt.Color(0, 0, 0));
        jBsalirLogin.setForeground(new java.awt.Color(255, 255, 255));
        jBsalirLogin.setText("Salir");
        jBsalirLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirLoginActionPerformed(evt);
            }
        });

        jTFusuarioLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFusuarioLoginActionPerformed(evt);
            }
        });

        jBcrearusuarioLogin.setBackground(new java.awt.Color(0, 0, 0));
        jBcrearusuarioLogin.setForeground(new java.awt.Color(255, 255, 255));
        jBcrearusuarioLogin.setText("Crear usuario");
        jBcrearusuarioLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcrearusuarioLoginActionPerformed(evt);
            }
        });

        jLusuarioLogin.setText("Usuario");

        jLcontraseñaLogin.setText("Contraseña");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLcontraseñaLogin)
                        .addGap(33, 33, 33)
                        .addComponent(jPFcontraseñaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLusuarioLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFusuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBsalirLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcrearusuarioLogin)
                    .addComponent(jBingresarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLparqueaderoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLparqueaderoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBingresarLogin)
                    .addComponent(jTFusuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLusuarioLogin))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcrearusuarioLogin)
                    .addComponent(jPFcontraseñaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLcontraseñaLogin))
                .addGap(18, 18, 18)
                .addComponent(jBsalirLogin)
                .addGap(133, 133, 133))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(429, 333));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBingresarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBingresarLoginActionPerformed
      
        String bd_usuario = jTFusuarioLogin.getText();
        String bd_clave =  jPFcontraseñaLogin.getText();
        String comprobar="";
        
        conexion_bd conexionRegistroUsuarios = new conexion_bd();
        
        try {
                Connection obtenerconexionBD = conexionRegistroUsuarios.getOracleConnection();
						
		PreparedStatement stmt =  obtenerconexionBD.prepareStatement("SELECT * FROM usuarios");
			
		ResultSet rs= stmt.executeQuery();
						
		while(rs.next()){
		 			
		 if(bd_usuario.equals(rs.getString("usuario")) && bd_clave.equals(rs.getString("clave"))){  
                     comprobar ="Y";
                    }
                }
                
                if(comprobar.equals("Y")){
                  GUIPrincipal VentanaPrincipal = new GUIPrincipal();
                    VentanaPrincipal.setVisible(true);
                    this.dispose();
                }
                else{
                   JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectos, por favor registrese primero.", "Error",
                    JOptionPane.ERROR_MESSAGE);
                    
                }
                
                rs.close();
                stmt.close();
            
        }
            
        catch (SQLException ex) {
            Logger.getLogger(GUIRegistrarse.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       
        
        
    }//GEN-LAST:event_jBingresarLoginActionPerformed

    private void jTFusuarioLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFusuarioLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFusuarioLoginActionPerformed

    private void jBcrearusuarioLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcrearusuarioLoginActionPerformed
            GUIRegistrarse VentanaRegistrarse = new GUIRegistrarse();
            VentanaRegistrarse.setVisible(true);
    }//GEN-LAST:event_jBcrearusuarioLoginActionPerformed

    private void jBsalirLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirLoginActionPerformed
         this.dispose();
    }//GEN-LAST:event_jBsalirLoginActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUILogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcrearusuarioLogin;
    private javax.swing.JButton jBingresarLogin;
    private javax.swing.JButton jBsalirLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLcontraseñaLogin;
    private javax.swing.JLabel jLparqueaderoPrincipal;
    private javax.swing.JLabel jLusuarioLogin;
    private javax.swing.JPasswordField jPFcontraseñaLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFusuarioLogin;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
