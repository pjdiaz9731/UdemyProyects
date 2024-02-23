/*
Crearemos un arreglo de 10 posiciones, el cual llenaremos con 10 números enteros. 
Al momento de imprimir ese arreglo, lo haremos con el siguiente orden en los números: 
primero, último, segundo, penúltimo, tercero. */

package com.mycompany.ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        
        int j; // Variable de control del bucle
        int array[] = new int[10]; // Declaración de un arreglo de enteros con capacidad para 10 elementos.
        Scanner sc = new Scanner(System.in); // Creación de un objeto Scanner para leer la entrada del usuario.
        
        // Bucle for para solicitar al usuario que introduzca 10 números y almacenarlos en el arreglo.
        for (j = 0; j < array.length; j++) 
        {
            System.out.println("Introduce un número " + (j + 1));
            array[j] = sc.nextInt();
        }
        
        System.out.println("\nMostrar los números"); // Mensaje que indica que se mostrarán los números del arreglo.

        // Bucle for para mostrar los primeros 5 números y sus correspondientes inversos.
        for (j = 0; j < 5; j++) 
        {
            System.out.println(array[j]); // Muestra el número en la posición j.
            System.out.println(array[9 - j]); // Muestra el número inverso correspondiente.
        }
    }
}