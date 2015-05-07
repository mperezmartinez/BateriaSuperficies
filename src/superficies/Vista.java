/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Vista {
    
    /**
     * Esta clase sirve para dar saloda a los datos.
     * @param obj pasa los valores de la clase modelo para poder hacer getters y recoger todos los valores antes pasados con setters
     */
        public static void imprimir(Modelo obj){
        
  if (obj.getFigura().compareToIgnoreCase("Cuadrado") == 0){
     JOptionPane.showMessageDialog(null, "Cuadrado "+obj.getBase()+"*"+obj.getAltura()+ "= "+obj.getArea());    
  } 
   if (obj.getFigura().compareToIgnoreCase("Rectangulo") == 0){
     JOptionPane.showMessageDialog(null, "Rectangulo "+obj.getBase()+"*"+obj.getAltura()+ "= "+obj.getArea());    
  }
    if (obj.getFigura().compareToIgnoreCase("Triangulo") == 0){
     JOptionPane.showMessageDialog(null, "Triangilo "+obj.getBase()+"*"+obj.getAltura()+"/2"+  "= "+obj.getArea());    
  }
     if (obj.getFigura().compareToIgnoreCase("Circulo") == 0){
   JOptionPane.showMessageDialog(null, "Circulo "+obj.getRadio()+"*"+obj.getRadio()+"*"+"3.14159265" +"= "+obj.getArea()); 
  }
    }
    
    
    
}
