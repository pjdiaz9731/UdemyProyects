/*
Crearemos un arreglo de 5 posiciones, para almacenar números enteros, y el programa al finalizar 
nos dirá cuál es el mayor de esos 5. */

package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Diego
 */

public class Ejercicio2 {

    public static void main(String[] args) {

        int array[] = new int[5];
        int mayor = array[0]; // Inicializa la variable 'mayor' con el primer elemento del arreglo.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los 5 números");

        // Bucle para ingresar los 5 números y encontrar el mayor.
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

            // Verifica si el número actual es mayor que el almacenado en 'mayor'.
            if (array[i] > mayor) {
                mayor = array[i];
            }

            // Mueve la impresión del número mayor fuera del bucle para evitar repeticiones.
        }

        // Imprime el número mayor después de haber ingresado todos los números.
        System.out.println("El numero mayor es: " + mayor);

    }
}
