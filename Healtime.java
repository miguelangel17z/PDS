// Healtime.java
package codigo;

import interfaz_grafica.Interfaz;



public class Healtime {

    public static void main(String[] args) {
        
inicializarComponentes();        

     
    }
    
  public static void inicializarComponentes(){
      Interfaz panta = new Interfaz();
      panta.setVisible(true);
panta.setLocationRelativeTo(null);
  } 
    
}
