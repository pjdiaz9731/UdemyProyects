/*
Crearemos un arreglo de 6 posiciones, que contendrá valores entre 1 y 100, 
aleatoriamente, para eso se usará el método random, de la clase Math. 
Posteriormente, ese arreglo será pasado al método, y ese método al final nos 
devolverá cuál es el mayor del arreglo */

package com.mycompany.ejercicio20;

/**
 *
 * @author Diego
 */

public class Ejercicio20 {

    public static void main(String[] args) 
    {
        int max; // Variable para almacenar el número mayor
        int t[] = new int[6]; // Crear un array de tamaño 6 para almacenar números aleatorios
        
        System.out.println("Llenar el arreglo con números aleatorios entre 1 y 100");
        
        System.out.println("Los números aleatorios añadidos son: ");
        
        // Llenar el array con números aleatorios entre 1 y 100 y mostrarlos
        for (int i = 0; i < t.length; i++) 
        {
            t[i] = (int) (Math.random() * 100 + 1);
            System.out.println(t[i]);
        }
        
        // Calcular el número mayor utilizando el método de la clase NumeroMayor
        max = NumeroMayor.numeroMaximo(t);
        System.out.println("El número mayor es: " + max); // Mostrar el resultado
    }
}