package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        // Ejercicio 1 Java.- Array con 30 ventas del mes, y que diga cuáles y cuántas son mayores que $2000.
        // Adaptado a 10 ventas y 5000 mil colones.
        
        double ventas[] = new double[10];
        Scanner dato = new Scanner(System.in); 
        
        System.out.println("Ingrese 10 las ventas del mes ");
        
        for (int i = 0; i < ventas.length; i++) {
            System.out.println((i+1) + ". Venta " );
            ventas[i] = dato.nextDouble();                   
        }
        
        int k = 0, total = 0;
        
        System.out.println("El total de ventas mayor a 5000 fue: ");
        
        while (k < 10) {            
            if (ventas[k] >= 5000) {   
                System.out.println(ventas[k]);
                total++;                
            }
            k++;          
        }
        System.out.println("En total fueron: " + total);
    }    
}
