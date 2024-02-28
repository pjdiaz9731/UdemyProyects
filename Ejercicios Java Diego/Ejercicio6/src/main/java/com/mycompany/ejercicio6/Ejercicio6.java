/*
 En este programa, se multiplicarán los primeros 10 números impares, 
usando un ciclo for. */

package com.mycompany.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Diego
 */

public class Ejercicio6 {

    public static void main(String[] args) {

        long productoImpares = 1;

        // Bucle for que itera por los primeros 10 números impares y calcula el producto.
        for (int i = 1; i < 20; i += 2) {
            productoImpares = productoImpares * i;
        }
        // Muestra el resultado del producto de los primeros 10 números impares.
        System.out.println("El resultado de multiplicar los primeros 10 números impares es: " + productoImpares);

    }
}
