/*
Crearemos un método estático que recibirá un array como parámetro, 
que fue llenado con números aleatorios, y  al final nos devolverá cuál es el menor. */

package com.mycompany.ejercicio22;

/**
 *
 * @author Diego
 */

public class Ejercicio22 {

    public static void main(String[] args) 
    {
        int m; // Variable para almacenar el número menor
        int t[] = new int[6]; // Crear un array de tamaño 6 para almacenar números aleatorios
        
       
        System.out.println("Llenar el arreglo con números aleatorios entre 1 y 100");
        
        
        System.out.println("Los números aleatorios añadidos son:");
        
        // Llenar el array con números aleatorios entre 1 y 100 y mostrarlos
        for (int i = 0; i < t.length; i++) 
        {
            t[i] = (int) (Math.random() * 100 + 1);
            System.out.println(t[i]);
        }
        
        // Calcular el número menor utilizando el método de la clase NumeroMenor
        m = NumeroMenor.numeroenor(t);
        System.out.println("El número menor es: " + m);
    }
}