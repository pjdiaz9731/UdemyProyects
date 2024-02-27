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

public class NumeroMayor {

    // Método estático para encontrar el número máximo en un array
    static int numeroMaximo(int t[]) 
    {
        int max; // Variable para almacenar el número máximo
        max = t[0]; // Inicializar max con el primer elemento del array

        // Iterar a través del array para encontrar el número máximo
        for (int i = 0; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i]; // Actualizar max si se encuentra un elemento mayor
            }
        }

        return max; // Devolver el número máximo encontrado
    }
}