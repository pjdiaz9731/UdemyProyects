/*
Almacenar serie de 5 en 5 en una matriz de 3 x 3. */

package com.mycompany.ejercicio24;

import java.util.Scanner;

/**
 *
 * @author Diego
 */

public class Ejercicio24 {

    
    public static void main(String[] args) 
    {
        int matriz[][] = new int[3][3]; // Crear una matriz de tamaño 3x3
        Scanner sc = new Scanner(System.in); 
        int serie = 0; // Variable para la serie numérica
        
        // Llenar la matriz con una serie numérica ascendente iniciando desde 5
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                serie = serie + 5; // Incrementar la serie por 5 en cada iteración
                matriz[i][j] = serie; // Asignar el valor de la serie a la posición correspondiente en la matriz
            }
        }
        
        // Mostrar los números de la matriz en consola
        System.out.println("Imprimir números de la matriz: ");
        
        for (int i = 0; i < 3; i++) // Iterar solo hasta la tercera fila
        {
            System.out.println("\n");
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(matriz[i][j] + "\t"); // Mostrar el número en formato de tabla
            }
        }
    }
}
