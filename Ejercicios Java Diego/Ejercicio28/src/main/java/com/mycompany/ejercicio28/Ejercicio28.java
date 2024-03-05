/*
 Matriz de 4 x 5, con unos en las orillas, y ceros en el centro */

package com.mycompany.ejercicio28;

/**
 *
 * @author Diego
 */

public class Ejercicio28 {

    public static void main(String[] args) 
    {
        int i, j; // Variables para índices de filas y columnas
        int matriz[][]; // Declarar la matriz
        
        matriz = new int[4][5]; // Crear una matriz de tamaño 4x5
        
        // Inicializar la matriz con 1 en las primeras y últimas filas y columnas
        for (i = 0; i < 4; i++) 
        {
            for (j = 0; j < 5; j++) 
            {
                if (i == 0 || i == 3) 
                {
                    // Si nos encontramos en la primera o última fila
                    matriz[i][j] = 1;  
                }
                if (j == 0 || j == 4) 
                {
                    // Si nos encontramos en la primera o última columna
                    matriz[i][j] = 1;
                }   
            }
        }
        
        System.out.print("Matriz de 4 x 5: ");
        
        // Mostrar la matriz en consola
        for (i = 0; i < 4; i++) 
        {
            System.out.println();
            for (j = 0; j < 5; j++) 
            {
                System.out.print(matriz[i][j] + " ");
            }
        }
        
        System.out.println(); // Saltar a la siguiente línea después de imprimir la matriz
    }
}
