/*
Crearemos dos arrays, "a" y "b", y almacenaremos 10 números en cada uno. Posteriormente, 
en un tercer arreglo "c", guardaremos los números del arreglo "a" y el arreglo "b", 
en este orden: El primero de a, el primero de b, el segundo de a, el segundo de b, 
el tercero de a, el tercero de b, etc. */

package com.mycompany.ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Diego
 */

public class Ejercicio14 {

    public static void main(String[] args) {
        
        int a[] = new int[10]; // Declaración de un arreglo 'a' de enteros con capacidad para 10 elementos.
        int b[] = new int[10]; // Declaración de un arreglo 'b' de enteros con capacidad para 10 elementos.
        int c[] = new int[20]; // Declaración de un arreglo 'c' de enteros con capacidad para 20 elementos.
        int i, j; // Variables de control del bucle.
        Scanner sc = new Scanner(System.in); // Creación de un objeto Scanner para leer la entrada del usuario.
        
        System.out.println("Introducir datos en el array 'a': ");
        
        // Bucle for para solicitar al usuario que introduzca datos en el arreglo 'a'.
        for (i = 0; i < a.length; i++) 
        {
            System.out.println("Posición " + (i + 1) + " : ");
            a[i] = sc.nextInt();
        }
        
        System.out.println("Introducir datos en el array 'b': ");
        
        // Bucle for para solicitar al usuario que introduzca datos en el arreglo 'b'.
        for (i = 0; i < b.length; i++) 
        {
            System.out.println("Posición " + (i + 1));
            b[i] = sc.nextInt();
        }
        
        System.out.println("Pasar los números al array 'c': ");
        
        j = 0; // Inicializa la variable j para el bucle de combinación de los arreglos 'a' y 'b'.
        
        // Bucle for para combinar los elementos de 'a' y 'b' en 'c'.
        for (i = 0; i < 10; i++) 
        {
            c[j] = a[i]; // Almacena el elemento actual de 'a' en 'c'.
            System.out.println(c[j]); // Muestra el elemento de 'c'.
            j++;
            c[j] = b[i]; // Almacena el elemento actual de 'b' en 'c'.
            System.out.println(c[j]); // Muestra el elemento de 'c'.
            j++;
        }
    }
}