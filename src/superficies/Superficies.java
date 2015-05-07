package superficies;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author damian
 */
public class Superficies {

    private static Scanner sc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Modelo contenedor = new Modelo();
        
  int  opc = JOptionPane.showOptionDialog(
                null, "MENU", "ELIJA SU OPERACION", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "Cuadrado",
                    "Rectangulo",
                    "Triangulo",
                    "Circulo"},
                "Exit")+1;

        switch (opc) {
            case 1:
                contenedor.setFigura("Cuadrado");
                break;
            case 2:
                contenedor.setFigura("Rectangulo");
                break;
            case 3:
                contenedor.setFigura("Triangulo");
                break;
            case 4:
                contenedor.setFigura("Circulo");
                break;
            default:
                System.exit(0);
        }

    }

    public static float realizaOperacion(float base, float altura, float radio, String oper) {
        float res = 0;
        if (oper.compareToIgnoreCase("Cuadrado") == 0) {
            res = base * altura;
        }
        if (oper.compareToIgnoreCase("Rectangulo") == 0) {
            res = base * altura;
        }
        if (oper.compareToIgnoreCase("Triangulo") == 0) {
            res = base * altura / 2;
        }
        if (oper.compareToIgnoreCase("Circulo") == 0) {
            res = (float)(radio * radio * 3.14159265);
        }
        return res;

    }
}
