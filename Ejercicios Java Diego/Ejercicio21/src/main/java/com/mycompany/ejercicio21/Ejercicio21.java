/*
Usaremos el método estático random( ), que pertenece a la clase Math, que nos 
devolverá un número aleatorio, tipo double, el cual tenemos que convertir a int. */

package com.mycompany.ejercicio21;

/**
 *
 * @author Diego
 */

public class Ejercicio21 {

    // Método principal
    public static void main(String[] args) 
    {
        int array[] = new int[10]; // Crear un array de tamaño 10 para almacenar números aleatorios
        System.out.println("Números aleatorios entre 1 y 100: ");
        
        // Llenar el array con números aleatorios entre 1 y 100 y mostrarlos
        for (int i = 0; i < 10; i++) 
        {
            array[i] = (int) (Math.random() * 100); // Generar un número aleatorio y asignarlo al array
            System.out.println(array[i]); 
        }
    }
}