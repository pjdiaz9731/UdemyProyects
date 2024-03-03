/*
Crearemos un método estático que recibirá un array como parámetro, 
que fue llenado con números aleatorios, y  al final nos devolverá cuál es el menor. */

package com.mycompany.ejercicio22;

/**
 *
 * @author Diego
 */

public class NumeroMenor {

    // Método estático para encontrar el número menor en un array
    static int numeroenor(int t[])
    {
        int menor; // Variable para almacenar el número menor
        menor = t[0]; // Inicializar menor con el primer elemento del array

        // Iterar a través del array para encontrar el número menor
        for (int i = 0; i < t.length; i++) 
        {
            if (t[i] < menor) menor = t[i]; // Actualizar menor si se encuentra un elemento menor
        }

        return menor; // Devolver el número menor encontrado
    }
}