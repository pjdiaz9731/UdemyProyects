package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        // Ejercicio 2 Java.- Saber cuál es el mayor de un arreglo.
        
        Scanner sc = new Scanner(System.in);
        
        int Numeros[] = new int [3];
        int mayor = Numeros[0];
        
        System.out.println("Ingrese los numeros: ");
        
        for (int i = 0; i < Numeros.length; i++) {            
            Numeros[i] = sc.nextInt();
            
            if (mayor < Numeros[i]) {
                mayor = Numeros[i];
            }    
        }        
        System.out.println("El numero mayor es: " + mayor);
   
    }
    
}
