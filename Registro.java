/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz_grafica;

import conexion.ConexionMySql;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author migue
 */
public class Registro extends javax.swing.JFrame {

  conexion.ConexionMySql con = new ConexionMySql();
  Connection cn = con.conectar();
  
    public Registro() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txrNombre = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txrApellido = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txrEmail = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txrUsuario = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txrPassword = new javax.swing.JPasswordField();
        inicio1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1384, 693));
        setMinimumSize(new java.awt.Dimension(1384, 693));
        setPreferredSize(new java.awt.Dimension(1384, 693));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1384, 693));
        jPanel1.setMinimumSize(new java.awt.Dimension(1384, 693));
        jPanel1.setPreferredSize(new java.awt.Dimension(1384, 693));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("REGISTRO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 300, 90));

        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        txrNombre.setBackground(new java.awt.Color(234, 231, 231));
        txrNombre.setColumns(1);
        txrNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txrNombre.setForeground(new java.awt.Color(0, 0, 0));
        txrNombre.setRows(1);
        txrNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txrNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txrNombre.setMinimumSize(new java.awt.Dimension(1, 1));
        txrNombre.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(txrNombre);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 440, 47));

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 233, -1));

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 233, -1));

        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));

        txrApellido.setBackground(new java.awt.Color(234, 231, 231));
        txrApellido.setColumns(1);
        txrApellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txrApellido.setForeground(new java.awt.Color(0, 0, 0));
        txrApellido.setRows(1);
        txrApellido.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txrApellido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txrApellido.setMinimumSize(new java.awt.Dimension(1, 1));
        txrApellido.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(txrApellido);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 440, 47));

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 233, -1));

        jScrollPane4.setForeground(new java.awt.Color(255, 255, 255));

        txrEmail.setBackground(new java.awt.Color(234, 231, 231));
        txrEmail.setColumns(1);
        txrEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txrEmail.setForeground(new java.awt.Color(0, 0, 0));
        txrEmail.setRows(1);
        txrEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txrEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txrEmail.setMinimumSize(new java.awt.Dimension(1, 1));
        txrEmail.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(txrEmail);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 450, 47));

        jScrollPane5.setForeground(new java.awt.Color(255, 255, 255));

        txrUsuario.setBackground(new java.awt.Color(234, 231, 231));
        txrUsuario.setColumns(1);
        txrUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txrUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txrUsuario.setRows(1);
        txrUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txrUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txrUsuario.setMinimumSize(new java.awt.Dimension(1, 1));
        txrUsuario.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane5.setViewportView(txrUsuario);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 440, 47));

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Usuario");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 233, -1));

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 233, -1));

        txrPassword.setBackground(new java.awt.Color(234, 231, 231));
        txrPassword.setForeground(new java.awt.Color(0, 0, 0));
        txrPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txrPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txrPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 440, 50));

        inicio1.setBackground(new java.awt.Color(102, 102, 255));
        inicio1.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        inicio1.setForeground(new java.awt.Color(255, 255, 255));
        inicio1.setText("REGISTRARSE");
        inicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicio1ActionPerformed(evt);
            }
        });
        jPanel1.add(inicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 480, 250, 52));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txrPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txrPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txrPasswordActionPerformed

    private void inicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicio1ActionPerformed
        String nombre = txrNombre.getText();
        String apellido = txrApellido.getText();
        String email = txrEmail.getText();
        String usuario = txrUsuario.getText();
        String password = txrPassword.getText();
        
        if(nombre.isEmpty()|| apellido.isEmpty()|| email.isEmpty()|| usuario.isEmpty()|| password.isEmpty()){
            JOptionPane.showMessageDialog(null, "DEBE COMPLETAR TODOS LOS DATOS");
            
        }
        else{
            try {
                String consulta = "INSERT INTO datos(`nombre`, `apellido`, `email`, `password`, `username`) VALUES ('"+nombre+"','"+apellido+"','"+email+"','"+password+"','"+usuario+"')";
                
                PreparedStatement ps=cn.prepareStatement(consulta);
                ps.executeUpdate();
                 JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
                 limpiar();
                
            }catch (HeadlessException | SQLException e){
                
                 JOptionPane.showMessageDialog(null, "NO SE LOGRO GUARDAR LOS DATOS, INTENTA NUEVAMENTE"+ e);
                
            }
        }

    }//GEN-LAST:event_inicio1ActionPerformed

   void limpiar(){
        
     txrNombre.setText("");
      txrApellido.setText("");
       txrEmail.setText("");
        txrUsuario.setText("");
      txrPassword.setText("");
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inicio1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea txrApellido;
    private javax.swing.JTextArea txrEmail;
    private javax.swing.JTextArea txrNombre;
    private javax.swing.JPasswordField txrPassword;
    private javax.swing.JTextArea txrUsuario;
    // End of variables declaration//GEN-END:variables
}
