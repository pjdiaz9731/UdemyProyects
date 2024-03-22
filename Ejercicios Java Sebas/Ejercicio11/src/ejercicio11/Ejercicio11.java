package ejercicio11;
import javax.swing.JOptionPane;
/**
 *
 * @author sebas
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 11 Java.- de 5 alumnos, saber cuáles reprobaron(Con ventanas emergentes).
        
    int codigo = 0, nota = 0;     
    String alumno = "";    
    
        for (int i = 0; i < 5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del alumno: "));
            alumno = JOptionPane.showInputDialog("Ingrese el nombre del alumno ");
            nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del alumno: "));
            
            if (nota >= 7) {
                JOptionPane.showMessageDialog(null, "El estudiante codigo #" + codigo + ", de nombre: " + alumno + " fue aprobado.");
            } else {
                JOptionPane.showMessageDialog(null, "El estudiante codigo #" + codigo + ", de nombre: " + alumno + " fue reprobado.");
            }   
        }
    }
    
}
