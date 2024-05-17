
package interfaz_grafica;

import conexion.ConexionMySql;
import java.awt.Color;
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
    
     int xMouse, yMouse;
  conexion.ConexionMySql con = new ConexionMySql();
  Connection cn = con.conectar();
  public static String UsernameGuardado = "";

    public static Registro cambio;
    public static Pantalla1 primera;
    public Interfaz() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cositaArriba = new javax.swing.JPanel();
        panelX = new javax.swing.JPanel();
        xLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtUsuario = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        login_Iniciarpantalla1 = new javax.swing.JButton();
        abrirRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1384, 693));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(231, 213, 200));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1384, 693));
        jPanel1.setPreferredSize(new java.awt.Dimension(1384, 693));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\migue\\Documents\\NetBeansProjects\\Healtime\\src\\main\\java\\Imagenes\\original.png")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 597, 700));

        cositaArriba.setBackground(new java.awt.Color(231, 213, 200));
        cositaArriba.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cositaArribaMouseDragged(evt);
            }
        });
        cositaArriba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cositaArribaMousePressed(evt);
            }
        });
        cositaArriba.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelX.setBackground(new java.awt.Color(231, 213, 200));
        panelX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelXMouseExited(evt);
            }
        });
        panelX.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        xLabel.setBackground(new java.awt.Color(231, 213, 200));
        xLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        xLabel.setForeground(new java.awt.Color(0, 0, 0));
        xLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xLabel.setText("X");
        xLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xLabelMouseExited(evt);
            }
        });
        panelX.add(xLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        cositaArriba.add(panelX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        jPanel1.add(cositaArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 60));

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("USUARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 233, 233, -1));

        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        txtUsuario.setBackground(new java.awt.Color(234, 231, 231));
        txtUsuario.setColumns(1);
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
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
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\migue\\Pictures\\Screenshots\\Screenshot 2024-05-12 235134.png")); // NOI18N
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setAlignmentX(0.5F);
        jLabel3.setAlignmentY(0.6F);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 170));

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CONTRASEÑA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 409, 233, -1));

        txtPassword.setBackground(new java.awt.Color(234, 231, 231));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 457, 695, 47));

        login_Iniciarpantalla1.setBackground(new java.awt.Color(0, 0, 0));
        login_Iniciarpantalla1.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        login_Iniciarpantalla1.setForeground(new java.awt.Color(255, 255, 255));
        login_Iniciarpantalla1.setText("INICIAR SESIÓN");
        login_Iniciarpantalla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_Iniciarpantalla1ActionPerformed(evt);
            }
        });
        jPanel1.add(login_Iniciarpantalla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 250, 52));

        abrirRegistro.setBackground(new java.awt.Color(0, 0, 0));
        abrirRegistro.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        abrirRegistro.setForeground(new java.awt.Color(89, 154, 252));
        abrirRegistro.setText("¿No tienes una cuenta? ");
        abrirRegistro.setActionCommand("");
        abrirRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(abrirRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 280, 40));

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
    }// </editor-fold>                        

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add yo handling code here:
    }                                           

    private void abrirRegistroActionPerformed(java.awt.event.ActionEvent evt) {                                              
               cambio = new Registro();
        cambio.setVisible(true);
        cambio.setLocationRelativeTo(null);
     
    }                                             

    private void login_Iniciarpantalla1ActionPerformed(java.awt.event.ActionEvent evt) {                                                       
                                      
        
    String usuario = txtUsuario.getText();
    String password = txtPassword.getText();
    
    if (!usuario.equals("") && !password.equals("")) {
        try {
            
            PreparedStatement ps = cn.prepareStatement("SELECT nombre FROM datos WHERE username = ? AND password = ?");
            ps.setString(1, usuario);
            ps.setString(2, password);
            
            ResultSet rs = ps.executeQuery();
            
   if (rs.next()) {
          UsernameGuardado = usuario;
          primera = new Pantalla1();
         
        primera.setVisible(true); 
        primera.setLocationRelativeTo(null);
        dispose();
       

          
    } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
    } catch (SQLException e) {
       JOptionPane.showMessageDialog(null, "Error al verificar las credenciales: " + e.getMessage());
       }
    } else {
      JOptionPane.showMessageDialog(null, "Ingrese un usuario y contraseña válidos");
    }


      
    
       
        
    }                                                      

    private void cositaArribaMousePressed(java.awt.event.MouseEvent evt) {                                          
        xMouse = evt.getX();
        yMouse = evt.getY();    
    }                                         

    private void cositaArribaMouseDragged(java.awt.event.MouseEvent evt) {                                          
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }                                         

    private void xLabelMouseEntered(java.awt.event.MouseEvent evt) {                                    
         panelX.setBackground(new Color(255,0,51));
        xLabel.setForeground(Color.white);
        
        
    }                                   

    private void xLabelMouseExited(java.awt.event.MouseEvent evt) {                                   
       panelX.setBackground(new Color(231,213,200));
         xLabel.setForeground(Color.black);
    }                                  

    private void xLabelMouseClicked(java.awt.event.MouseEvent evt) {                                    
        System.exit(0);
    }                                   

    private void panelXMouseEntered(java.awt.event.MouseEvent evt) {                                    
        
    }                                   

    private void panelXMouseExited(java.awt.event.MouseEvent evt) {                                   
        
    }                                  


    // Variables declaration - do not modify                     
    private javax.swing.JButton abrirRegistro;
    private javax.swing.JPanel cositaArriba;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton login_Iniciarpantalla1;
    private javax.swing.JPanel panelX;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextArea txtUsuario;
    private javax.swing.JLabel xLabel;
    // End of variables declaration                   
}
