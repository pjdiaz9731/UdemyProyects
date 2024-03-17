package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        // Ejercicio 5 Java.- Capturar sólo números positivos, y obtener la media(promedio) de esos números.
        
        Scanner sc = new Scanner (System.in);
        int numeros = 0, total = 0, cantidad = 0;
        double promedio = 0;
        
        do {            
            System.out.print("Digite numeros: ");
            numeros = sc.nextInt();  
            if(numeros > 0){
            total += numeros;
            cantidad++;
            }
        } while(numeros >= 0);
        
        promedio = total/cantidad;
        System.out.print("El promedio de los numeros digitados es: " + promedio);
   
    }    
}
