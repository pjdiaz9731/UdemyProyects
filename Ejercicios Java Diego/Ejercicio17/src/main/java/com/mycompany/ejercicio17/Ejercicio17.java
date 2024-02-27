/*
Ingresaremos 5 números enteros en un arreglo de tamaño de 10, ordenados y de manera creciente. 
Posteriormente, ingresaremos un número, y éste se insertará en el lugar adecuado, 
para que el arreglo continúe ordenado, números de menor a mayor. */

package com.mycompany.ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Diego
 */

public class Ejercicio17 {

    public static void main(String[] args) {
        
        int array[] = new int[10]; // Declaración de un arreglo de enteros con capacidad para 10 elementos.
        int num, pos_num, j; // Variables para almacenar el número ingresado, la posición donde se insertará, y un índice de bucle.
        Scanner sc = new Scanner(System.in); // Creación de un objeto Scanner para leer la entrada del usuario.
        
        // Ingreso de 5 números de forma creciente en el arreglo
        System.out.println("Introduce los 5 números de forma creciente: ");
        for (int i = 0; i < 5; i++) 
        {
            array[i] = sc.nextInt();
        }
        
        // Ingreso de un número entero
        System.out.println("Ingrese un número entero: ");
        num = sc.nextInt();
        
        pos_num = 0; // Inicialización de la posición donde se insertará el nuevo número.
        j = 0; // Inicialización del índice de bucle.

        // Bucle while para determinar la posición de inserción
        while (array[j] < num && j <= 4) 
        {            
            pos_num++;
            j++;
        }

        // Bucle for para desplazar los elementos a la derecha desde la posición de inserción
        for (int i = 4; i >= pos_num; i--) 
        {
            array[i + 1] = array[i];
        }

        array[pos_num] = num; // Inserta el nuevo número en la posición determinada.

        // Muestra el nuevo arreglo ordenado
        System.out.println("Nuevo arreglo ordenado: ");
        for (int i = 0; i < 6; i++) 
        {
            System.out.println(array[i]);
        }
    }
}