
package interfaz_grafica;
import conexion.ConexionMySql;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Pantalla1 extends javax.swing.JFrame {

      public static String usuarioG = Interfaz.UsernameGuardado;
      
      static java.util.Date utilDate = new java.util.Date(124, 4, 11);
 static java.sql.Date fechaS = new java.sql.Date(utilDate.getTime());
 private String[] frases;

 int xMouse, yMouse;
    conexion.ConexionMySql con = new ConexionMySql();
     Connection cn = con.conectar();
     AgregarActividad PantallaAgr = new AgregarActividad(AgregarActividad.nombreNuevoHobby);
     EliminarActividad PantallaElm = new EliminarActividad();
     Interfaz pantallaInicio = new Interfaz();
    public Pantalla1() {
        
        inicializarFrases();
        iniciarReloj();
        initComponents();
        mostrarFrase();
        
         
           
                       
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        calendar = new com.toedter.calendar.JDateChooser();
        eliminarActividadBoton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        actividadesText = new javax.swing.JTextArea();
        BotonSeleccionarFecha = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        fechasTexto = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tipoTexto = new javax.swing.JTextArea();
        mostrarAgregarActividad = new javax.swing.JButton();
        volverBoton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fraseLabel = new javax.swing.JLabel();
        autorLabel = new javax.swing.JLabel();
        cositoArriba = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("02:04:25 ");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1384, 693));
        setMinimumSize(new java.awt.Dimension(1384, 693));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(24, 14, 14));
        jPanel1.setForeground(new java.awt.Color(102, 0, 255));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(1384, 693));
        jPanel1.setMinimumSize(new java.awt.Dimension(1384, 693));
        jPanel1.setPreferredSize(new java.awt.Dimension(1384, 693));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto Thin", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FECHA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 170, 60));

        labelHora.setFont(new java.awt.Font("Roboto Thin", 1, 48)); // NOI18N
        labelHora.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(labelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, 480, -1));

        calendar.setBackground(new java.awt.Color(255, 255, 255));
        calendar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 370, 40));

        eliminarActividadBoton.setBackground(new java.awt.Color(117, 5, 9));
        eliminarActividadBoton.setFont(new java.awt.Font("Roboto Thin", 1, 26)); // NOI18N
        eliminarActividadBoton.setForeground(new java.awt.Color(255, 255, 255));
        eliminarActividadBoton.setText("ELIMINAR ACTIVIDAD\n");
        eliminarActividadBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActividadBotonActionPerformed(evt);
            }
        });
        jPanel1.add(eliminarActividadBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 340, 380, 90));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setColumnHeaderView(null);
        jScrollPane1.setHorizontalScrollBar(null);

        actividadesText.setEditable(false);
        actividadesText.setBackground(new java.awt.Color(231, 213, 200));
        actividadesText.setColumns(20);
        actividadesText.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        actividadesText.setForeground(new java.awt.Color(0, 0, 0));
        actividadesText.setRows(5);
        actividadesText.setAutoscrolls(false);
        jScrollPane1.setViewportView(actividadesText);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 380, 530));

        BotonSeleccionarFecha.setBackground(new java.awt.Color(24, 0, 55));
        BotonSeleccionarFecha.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        BotonSeleccionarFecha.setForeground(new java.awt.Color(255, 255, 255));
        BotonSeleccionarFecha.setText("Buscar");
        BotonSeleccionarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSeleccionarFechaActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSeleccionarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 120, 40));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setHorizontalScrollBar(null);

        fechasTexto.setEditable(false);
        fechasTexto.setBackground(new java.awt.Color(231, 213, 200));
        fechasTexto.setColumns(20);
        fechasTexto.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        fechasTexto.setForeground(new java.awt.Color(0, 0, 0));
        fechasTexto.setRows(5);
        jScrollPane2.setViewportView(fechasTexto);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 190, 530));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setHorizontalScrollBar(null);

        tipoTexto.setEditable(false);
        tipoTexto.setBackground(new java.awt.Color(231, 213, 200));
        tipoTexto.setColumns(20);
        tipoTexto.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        tipoTexto.setForeground(new java.awt.Color(0, 0, 0));
        tipoTexto.setRows(5);
        jScrollPane3.setViewportView(tipoTexto);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 220, 530));

        mostrarAgregarActividad.setBackground(new java.awt.Color(30, 0, 114));
        mostrarAgregarActividad.setFont(new java.awt.Font("Roboto Thin", 1, 26)); // NOI18N
        mostrarAgregarActividad.setForeground(new java.awt.Color(255, 255, 255));
        mostrarAgregarActividad.setText("AGREGAR ACTIVIDAD");
        mostrarAgregarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarAgregarActividadActionPerformed(evt);
            }
        });
        jPanel1.add(mostrarAgregarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 220, 380, 90));

        volverBoton.setBackground(new java.awt.Color(87, 44, 66));
        volverBoton.setFont(new java.awt.Font("Roboto Thin", 1, 20)); // NOI18N
        volverBoton.setForeground(new java.awt.Color(255, 255, 255));
        volverBoton.setText("SALIR");
        volverBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBotonActionPerformed(evt);
            }
        });
        jPanel1.add(volverBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 660, 90, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\migue\\Pictures\\Screenshots\\Screenshot 2024-05-12 223706.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 510, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\migue\\Pictures\\Screenshots\\Screenshot 2024-05-12 222654.png")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 100));

        fraseLabel.setBackground(new java.awt.Color(24, 14, 14));
        fraseLabel.setFont(new java.awt.Font("Roboto Thin", 1, 24)); // NOI18N
        fraseLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(fraseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 460, 380, 130));

        autorLabel.setFont(new java.awt.Font("Roboto Thin", 1, 24)); // NOI18N
        autorLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(autorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 600, 380, 40));

        cositoArriba.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cositoArribaMouseDragged(evt);
            }
        });
        cositoArriba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cositoArribaMousePressed(evt);
            }
        });
        jPanel1.add(cositoArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 730));

        pack();
    }// </editor-fold>                        

    private void eliminarActividadBotonActionPerformed(java.awt.event.ActionEvent evt) {                                                       
          PantallaElm.setVisible(true);
          PantallaElm.setLocationRelativeTo(null);
                      
    }                                                      

    private void BotonSeleccionarFechaActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        
        ConsultarActividades();
        
    }                                                     

    private void mostrarAgregarActividadActionPerformed(java.awt.event.ActionEvent evt) {                                                        
       
       abrirAgregarActividad();
       
    }                                                       

    private void volverBotonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        pantallaInicio.setVisible(true);
        pantallaInicio.setLocationRelativeTo(null);
        dispose();
        
    }                                           

    private void cositoArribaMousePressed(java.awt.event.MouseEvent evt) {                                          
       xMouse = evt.getX();
        yMouse = evt.getY();  
    }                                         

    private void cositoArribaMouseDragged(java.awt.event.MouseEvent evt) {                                          
         int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }                                         
 public void ConsultarActividades(){
        
        Date fechaSeleccionada = calendar.getDate();
        if(fechaSeleccionada != null){
             java.sql.Date fecha = new java.sql.Date(fechaSeleccionada.getTime());
             actividadesText.setText("");
             fechasTexto.setText("");
                tipoTexto.setText("");
            try{
                PreparedStatement ps = cn.prepareStatement("SELECT `username`, `fecha`, `hora`, `actividad`,  `tipo` FROM `actividades` WHERE username = ? AND fecha = ? ORDER BY hora ASC");
           ps.setString(1, usuarioG);
           ps.setDate(2, fecha);
           
           ResultSet rs = ps.executeQuery();
           
    
               
          while(rs.next()){
             
                actividadesText.append(rs.getString("actividad") +"\n————————————————————————\n");
                fechasTexto.append(rs.getTime("hora")+"\n——————————————\n");
                tipoTexto.append(rs.getString("tipo")+"\n————————\n");
                
                           }
          
          if(actividadesText.getText().isEmpty()){
              
              JOptionPane.showMessageDialog(null, "No hay actividades en la fecha seleccionada"); 
          }else{
              
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
 
 public void abrirAgregarActividad(){
     PantallaAgr.setVisible(true);
       PantallaAgr.setLocationRelativeTo(null);
 }
  private void iniciarReloj() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarHora();
            }
        });
        timer.start();
    }

    private void actualizarHora() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String hora = sdf.format(new Date());

        SimpleDateFormat sdfFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = sdfFecha.format(new Date());

        labelHora.setText(hora + " | " + fecha);
    }

  
    private void inicializarFrases(){
        this.frases = new String[] {"<html>El éxito es la suma de pequeños esfuerzos repetidos día tras día. - Robert Collier", 
            "<html>La clave del éxito es comenzar antes de estar listo. - Marie Forleo",
            "<html>Cree en ti mismo y todo será posible. - Anónimo",
            "<html>El único lugar donde el éxito viene antes que el trabajo es en el diccionario. - Vidal Sassoon",
            "<html>El fracaso no es el final, es una oportunidad para comenzar de nuevo con más inteligencia. - Henry Ford",
            "<html>No se trata de cuántas veces caigas, sino de cuántas veces te levantes. - Anónimo",
            "<html>La motivación te impulsa a comenzar, el hábito te mantiene firme en tu camino. - Jim Ryun",
            "<html>No esperes a que las circunstancias sean perfectas para actuar, actúa y haz que las circunstancias sean perfectas. - Anónimo",
            "<html>El optimismo es la fe que conduce al logro; nada se puede hacer sin esperanza y confianza. - Helen Keller",
            "<html>Si realmente quieres hacer algo, encontrarás una manera; si no, encontrarás una excusa. - Jim Rohn"
        };
    }
    

private void mostrarFrase() {
    Random random = new Random();
    System.out.println(frases[0]);
    if (frases.length > 0 && frases[0] != null) { // Verificar que el arreglo de frases no esté vacío
        int numero = random.nextInt(frases.length);
        String fraseDelDia = frases[numero];
        String autor = "";
        
        for (int i = 0; i < fraseDelDia.length(); i++) {
            if (fraseDelDia.charAt(i) == '-') {
                autor = fraseDelDia.substring(i); // Obtener el autor eliminando el guion y los espacios adicionales
                fraseDelDia = fraseDelDia.substring(0, i).trim(); // Obtener la frase sin el autor y los espacios adicionales
                break;
            }
        }
        fraseLabel.setText(fraseDelDia);
        autorLabel.setText(autor);
    }
    

    
    
}
    





    // Variables declaration - do not modify                     
    private javax.swing.JButton BotonSeleccionarFecha;
    private javax.swing.JTextArea actividadesText;
    private javax.swing.JLabel autorLabel;
    private com.toedter.calendar.JDateChooser calendar;
    private javax.swing.JPanel cositoArriba;
    private javax.swing.JButton eliminarActividadBoton;
    private javax.swing.JTextArea fechasTexto;
    private javax.swing.JLabel fraseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelHora;
    private javax.swing.JButton mostrarAgregarActividad;
    private javax.swing.JTextArea tipoTexto;
    private javax.swing.JButton volverBoton;
    // End of variables declaration                   
}
