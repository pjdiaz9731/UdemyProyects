/*
Crearemos un arreglo de 10 posiciones, donde almacenaremos 10 números enteros, 
y posteriormente, desplazaremos cada número una posición adelante. */

package com.mycompany.ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Diego
 */

public class Ejercicio16 {

    public static void main(String[] args) {
        
        int array[] = new int[10]; // Declaración de un arreglo de enteros con capacidad para 10 elementos.
        int ultimo; // Variable para almacenar el último elemento del arreglo.
        Scanner sc = new Scanner(System.in); // Creación de un objeto Scanner para leer la entrada del usuario.
        
        // Ingreso de números enteros en el arreglo
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Introduce un número entero: ");
            array[i] = sc.nextInt();
        }
        
        ultimo = array[9]; // Almacena el último elemento del arreglo en la variable 'ultimo'.
        
        // Desplazamiento de los elementos del arreglo una posición a la derecha
        for (int i = 8; i >= 0; i--) 
        {
            array[i + 1] = array[i];
        }

        array[0] = ultimo; // Coloca el último elemento en la primera posición del arreglo.

        System.out.println("Mostrar números desplazados una posición a la derecha:  ");
        
        // Mostrar los números después del desplazamiento
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(array[i]);
        }
    }
}

