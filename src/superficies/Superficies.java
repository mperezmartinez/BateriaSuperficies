package superficies;

import javax.swing.JOptionPane;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author Miguel
 */
public class Superficies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Modelo contenedor = new Modelo();

        int opc = JOptionPane.showOptionDialog(
                null, "MENU", "ELIJA SU OPERACION", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "Cuadrado",
                    "Rectangulo",
                    "Triangulo",
                    "Circulo"},
                "Exit") + 1;

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

        if (contenedor.getFigura().compareToIgnoreCase("Cuadrado") == 0) {

            float num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Base"));
            float num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Altura"));

            contenedor.setBase(num1);
            contenedor.setAltura(num2);

            contenedor.setArea(Superficies.realizaOperacion(num1, num2, 0, contenedor.getFigura()));

        }

        if (contenedor.getFigura().compareToIgnoreCase("Rectangulo") == 0) {

            float num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Base"));
            float num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Altura"));

            contenedor.setBase(num1);
            contenedor.setAltura(num2);

            contenedor.setArea(Superficies.realizaOperacion(num1, num2, 0, contenedor.getFigura()));

        }
        if (contenedor.getFigura().compareToIgnoreCase("Triangulo") == 0) {

            float num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Base"));
            float num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Altura"));

            contenedor.setBase(num1);
            contenedor.setAltura(num2);

            contenedor.setArea(Superficies.realizaOperacion(num1, num2, 0, contenedor.getFigura()));

        }
        if (contenedor.getFigura().compareToIgnoreCase("Circulo") == 0) {

            float num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "radio"));

            contenedor.setRadio(num1);

            contenedor.setArea(Superficies.realizaOperacion(0, 0, num1, contenedor.getFigura()));

        }
        Vista.imprimir(contenedor);

    }

    /**
     *
     * @param base le pasa la base de la figura
     * @param altura le pasa la altura de la fifura
     * @param radio le pasa el radio de la figura
     * @param oper pasa la operacion seleccionada para saber que calculo hacer
     * @return res devuelve el resultado en cada uno de los casos
     */
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
            res = (float) (radio * radio * 3.14159265);
        }
        return res;

    }
}
