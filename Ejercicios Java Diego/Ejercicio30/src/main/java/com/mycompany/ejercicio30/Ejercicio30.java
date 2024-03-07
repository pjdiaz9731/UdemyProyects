/*
 Saber si un array está en orden creciente o decreciente 

En este programa rellenaremos un arreglo, posteriormente se nos dirá si ese 
arreglo está ordenado de forma creciente o decreciente, o si está ordenado, 
o si todos los números son iguales*/

package com.mycompany.ejercicio30;

import java.util.Scanner;

/**
 *
 * @author Diego
 */

public class Ejercicio30 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i; // Variable para el índice del bucle
        boolean creciente = false, decreciente = false; // Variables para verificar si la serie es creciente o decreciente
        int array[] = new int[10]; // Crear un array de tamaño 10 para almacenar los números
        
        // Llenar el array con números ingresados por el usuario
        for (i = 0; i < 10; i++) 
        {
            System.out.print("Introduce un número " + (i + 1) + " : ");
            array[i] = sc.nextInt(); // Obtener un número desde la entrada estándar
        }
        
        // Comprobamos el orden de la serie
        for (i = 0; i < 9; i++) // Usamos i o i+1, por lo que la i solo podrá llegar hasta 8
        {
            if (array[i] > array[i + 1]) // Si encontramos un elemento mayor al siguiente, ya no es creciente
                decreciente = true;
            if (array[i] < array[i + 1]) 
                creciente = true; // Si encontramos un elemento menor al siguiente, ya no es decreciente
        }
        
        // Mostrar el resultado según el orden de la serie
        if (creciente == true && decreciente == false)
            System.out.println("Serie creciente");
        if (creciente == false && decreciente == true)
            System.out.println("Serie decreciente");
        if (creciente == true && decreciente == true)
            System.out.println("Serie desordenada");
        if (creciente == false && decreciente == false)
            System.out.println("Todos los números iguales");
    }
}