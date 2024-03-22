package ejercicio10;
import javax.swing.JOptionPane;
/**
 *
 * @author sebas
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        // Ejercicio 10 Java.- Introducir N sueldos, y al final mostrarle el sueldo mayor(Con JOptionPane).
        
        int N = 0, sueldos = 0, numeracion = 0, sueldoMAx = 0; 
        boolean primerSueldo = false; 
        N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de sueldos, que desea comparar "));
        
        for (int i = 0; i < N; i++) {
            numeracion++;
            sueldos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo " + numeracion + ": "));
            
            if (primerSueldo == false) {
                sueldoMAx = sueldos;
                primerSueldo = true;
            } else if (sueldos > sueldoMAx){
                sueldoMAx = sueldos;                    
            }            
        }    
        
        JOptionPane.showMessageDialog(null, "El mayor sueldo es: " + sueldoMAx);
    }
    
}
