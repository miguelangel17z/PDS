/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz_grafica;

import conexion.ConexionMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author migue
 */
public class Interfaz extends javax.swing.JFrame {
    
  conexion.ConexionMySql con = new ConexionMySql();
  Connection cn = con.conectar();

    public static Registro cambio;
    public static Pantalla1 primera;
    public Interfaz() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtUsuario = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        inicio1 = new javax.swing.JButton();
        Registro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1384, 693));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1384, 693));
        jPanel1.setPreferredSize(new java.awt.Dimension(1384, 693));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("USUARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 233, 233, -1));

        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        txtUsuario.setBackground(new java.awt.Color(234, 231, 231));
        txtUsuario.setColumns(1);
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setRows(1);
        txtUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsuario.setMinimumSize(new java.awt.Dimension(1, 1));
        txtUsuario.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(txtUsuario);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 269, 695, 47));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\migue\\Documents\\NetBeansProjects\\Healtime\\src\\main\\java\\Imagenes\\logo.jpg")); // NOI18N
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setAlignmentX(0.5F);
        jLabel3.setAlignmentY(0.6F);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 58, -1, 125));

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CONTRASEÑA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 409, 233, -1));

        txtPassword.setBackground(new java.awt.Color(234, 231, 231));
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 457, 695, 47));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\migue\\Documents\\NetBeansProjects\\Healtime\\src\\main\\java\\Imagenes\\original.png")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 597, 700));

        inicio1.setBackground(new java.awt.Color(0, 0, 0));
        inicio1.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        inicio1.setForeground(new java.awt.Color(255, 255, 255));
        inicio1.setText("INICIAR SESIÓN");
        inicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicio1ActionPerformed(evt);
            }
        });
        jPanel1.add(inicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 250, 52));

        Registro.setBackground(new java.awt.Color(0, 0, 0));
        Registro.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        Registro.setForeground(new java.awt.Color(102, 102, 255));
        Registro.setText("No tienes una cuenta?registrate aqui.");
        Registro.setActionCommand("");
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });
        jPanel1.add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 390, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add yo handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
               cambio = new Registro();
        cambio.setVisible(true);
        cambio.setLocationRelativeTo(null);

    }//GEN-LAST:event_RegistroActionPerformed

    private void inicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicio1ActionPerformed
                                      
        
    String usuario = txtUsuario.getText();
    String password = txtPassword.getText();
    
    if (!usuario.equals("") && !password.equals("")) {
        try {
            
            PreparedStatement ps = cn.prepareStatement("SELECT nombre FROM datos WHERE username = ? AND password = ?");
            ps.setString(1, usuario);
            ps.setString(2, password);
            
            ResultSet rs = ps.executeQuery();
            
   if (rs.next()) {
        String nombre = rs.getString("nombre");
          JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso. Bienvenido, " + nombre);
          primera = new Pantalla1();
        primera.setVisible(true); 
        primera.setLocationRelativeTo(null);

          
    } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
    } catch (SQLException e) {
       JOptionPane.showMessageDialog(null, "Error al verificar las credenciales: " + e.getMessage());
       }
    } else {
      JOptionPane.showMessageDialog(null, "Ingrese un usuario y contraseña válidos");
    }


      
    
        
        
    }//GEN-LAST:event_inicio1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registro;
    private javax.swing.JButton inicio1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextArea txtUsuario;
    // End of variables declaration//GEN-END:variables
}
