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
import java.util.Date;
import javax.swing.JOptionPane;


public class Pantalla1 extends javax.swing.JFrame {

     private AgregarActividad PantallaAgr;
      public static String usuarioG = Interfaz.UsernameGuardado;
    conexion.ConexionMySql con = new ConexionMySql();
     Connection cn = con.conectar();
     
    public Pantalla1() {
        initComponents();
            PantallaAgr = new AgregarActividad();
                       
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        calendar = new com.toedter.calendar.JDateChooser();
        mostrarAgregarActividad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        actividadesText = new javax.swing.JTextArea();
        BotonSeleccionarFecha = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        fechasTexto = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tipoTexto = new javax.swing.JTextArea();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("02:04:25 ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1384, 693));
        setMinimumSize(new java.awt.Dimension(1384, 693));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(102, 0, 255));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(1384, 693));
        jPanel1.setMinimumSize(new java.awt.Dimension(1384, 693));
        jPanel1.setPreferredSize(new java.awt.Dimension(1384, 693));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("FECHA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 16, 170, 147));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("02:04:25 | 22/04/24");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 390, -1));

        calendar.setBackground(new java.awt.Color(255, 255, 255));
        calendar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 370, 40));

        mostrarAgregarActividad.setBackground(new java.awt.Color(0, 0, 255));
        mostrarAgregarActividad.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        mostrarAgregarActividad.setForeground(new java.awt.Color(255, 255, 255));
        mostrarAgregarActividad.setText("AGREGAR ACTIVIDAD");
        mostrarAgregarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarAgregarActividadActionPerformed(evt);
            }
        });
        jPanel1.add(mostrarAgregarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 380, 90));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        actividadesText.setEditable(false);
        actividadesText.setColumns(20);
        actividadesText.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        actividadesText.setRows(5);
        jScrollPane1.setViewportView(actividadesText);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 270, 500));

        BotonSeleccionarFecha.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        BotonSeleccionarFecha.setText("Buscar");
        BotonSeleccionarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSeleccionarFechaActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSeleccionarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 120, 40));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        fechasTexto.setEditable(false);
        fechasTexto.setColumns(20);
        fechasTexto.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        fechasTexto.setRows(5);
        jScrollPane2.setViewportView(fechasTexto);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 220, 500));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tipoTexto.setEditable(false);
        tipoTexto.setColumns(20);
        tipoTexto.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        tipoTexto.setRows(5);
        jScrollPane3.setViewportView(tipoTexto);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 250, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        pack();
    }// </editor-fold>                        

    private void mostrarAgregarActividadActionPerformed(java.awt.event.ActionEvent evt) {                                                        
      
       PantallaAgr.setVisible(true);
       PantallaAgr.setLocationRelativeTo(null);
                       

    }                                                       

    private void BotonSeleccionarFechaActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        
        ConsultarActividades();
        
    }                                                     
 public void ConsultarActividades(){
        
        Date fechaSeleccionada = calendar.getDate();
        if(fechaSeleccionada != null){
             java.sql.Date fecha = new java.sql.Date(fechaSeleccionada.getTime());
             actividadesText.setText("");
            try{
                PreparedStatement ps = cn.prepareStatement("SELECT `username`, `fecha`, `hora`, `actividad`,  `tipo` FROM `actividades` WHERE username = ? AND fecha = ? ORDER BY hora ASC");
           ps.setString(1, usuarioG);
           ps.setDate(2, fecha);
           
           ResultSet rs = ps.executeQuery();
           
    
               
          while(rs.next()){
             
                actividadesText.append(rs.getString("actividad") +"\n\n");
                fechasTexto.append(rs.getTime("hora")+"\n\n");
                tipoTexto.append(rs.getString("tipo")+"\n\n");
                
                           }
          
          if(actividadesText.getText().isEmpty()){
              
              JOptionPane.showMessageDialog(null, "No hay actividades en la fecha seleccionada"); 
          }
            }
          
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error al verificar las credenciales: " + e.getMessage());
                                   }
                
            }
        
        else{
         JOptionPane.showMessageDialog(null, "seleccione una fecha valida");   
        }
            
            
            
        
    }







    // Variables declaration - do not modify                     
    private javax.swing.JButton BotonSeleccionarFecha;
    private javax.swing.JTextArea actividadesText;
    private com.toedter.calendar.JDateChooser calendar;
    private javax.swing.JTextArea fechasTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton mostrarAgregarActividad;
    private javax.swing.JTextArea tipoTexto;
    // End of variables declaration                   
}
