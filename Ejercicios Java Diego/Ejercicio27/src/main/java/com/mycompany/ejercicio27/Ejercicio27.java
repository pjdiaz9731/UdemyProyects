/*
Rellenar matriz de 3 x 5 (No cuadrada), con datos tipo char */

package com.mycompany.ejercicio27;

/**
 *
 * @author Diego
 */

public class Ejercicio27 {

    public static void main(String[] args) 
    {
        final int FILAS = 3;
        final int COLUMNAS = 5;
        char[][] letras = new char[FILAS][COLUMNAS]; // Crear una matriz de tamaño 3x5
        char letraQueToca = 'A'; // Inicializar la letra que se va a cargar en la matriz
        
        // Cargar las letras en la matriz
        for (int f = 0; f < FILAS; f++) 
        {
            for (int c = 0; c < COLUMNAS; c++) 
            {
                letras[f][c] = letraQueToca;
                letraQueToca++;
            }     
        }
        
        // Modificar en pantalla la matriz
        for (int f = 0; f < FILAS; f++) 
        {
            for (int c = 0; c < COLUMNAS; c++) 
            {
                System.out.print(letras[f][c] + " "); // Mostrar el contenido de la matriz en consola
            }
            System.out.println(); // Saltar a la siguiente línea después de cada fila
        }
    }
}