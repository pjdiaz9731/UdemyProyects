/*
Rellenar una matriz de 3 filas y 3 columnas, y posteriormente imprimir los datos. */

package com.mycompany.ejercicio23;

import java.util.Scanner;

/**
 *
 * @author Diego
 */

public class Ejercicio23 { 

    
    public static void main(String[] args) 
    {
        // Matrices
        int matriz[][] = new int[3][3]; // Crear una matriz de tamaño 3x3
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para la entrada de datos
        
        // Llenar la matriz con números ingresados por el usuario
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.println("Introduce un número: ");
                int num = sc.nextInt(); // Obtener un número desde la entrada estándar
                matriz[i][j] = num; // Asignar el número a la posición correspondiente en la matriz
            }
        }
        
        // Mostrar los números de la matriz en consola
        System.out.println("Imprimir números de la matriz: ");
        
        for (int i = 0; i < 3; i++) 
        {
            System.out.println("\n");
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(matriz[i][j] + "\t");   // Mostrar el número en formato de tabla
            }
        }
    }
}