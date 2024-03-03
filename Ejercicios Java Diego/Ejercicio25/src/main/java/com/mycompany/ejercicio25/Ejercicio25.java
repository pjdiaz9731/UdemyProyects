/*
Rellenar matriz de 3 x 3 con sólo números positivos */

package com.mycompany.ejercicio25;

import java.util.Scanner;

/**
 *
 * @author Diego
 */

public class Ejercicio25 {

    
    public static void main(String[] args) 
    {
        int matriz[][] = new int[3][3]; // Crear una matriz de tamaño 3x3
        Scanner sc = new Scanner(System.in);
        
        // Llenar la matriz con números ingresados por el usuario (solo se permite números no negativos)
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz.length;) 
            {
                System.out.println("Introduce un número: ");
                int num = sc.nextInt(); // Obtener un número desde la entrada estándar
                
                if (num >= 0) // Verificar si el número ingresado es no negativo
                {
                    matriz[i][j] = num; // Asignar el número a la posición correspondiente en la matriz
                    j++; // Incrementar el índice de columna solo si el número es no negativo
                }
                else
                {
                    // Mensaje de advertencia si se ingresa un número negativo
                    System.out.println("El número es negativo. No podrá acceder a la matriz."); 
                }
            }
        }
        
        // Mostrar los números de la matriz en consola
        System.out.println("Mostrar matriz");
        for (int i = 0; i < matriz.length; i++) 
        {
            System.out.println("\n");
            for (int j = 0; j < matriz.length; j++) 
            {
                System.out.print(matriz[i][j] + "\t");  // Mostrar el número en formato de tabla
            }
        }
    }
}
