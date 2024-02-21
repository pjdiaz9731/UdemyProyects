/*
El programa nos pide introducir 5 números enteros, y al final, los mostrará al revés.
*/

package com.mycompany.ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        
        int array[] = new int [5]; // Declara un arreglo de enteros con tamaño 5.
        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario.
        
        // Bucle for para solicitar al usuario que introduzca 5 números.
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduzca un número: "); // Pide al usuario que introduzca un número.
            array[i] = sc.nextInt(); // Almacena el número introducido por el usuario en el arreglo.
        }
        
        System.out.println("Los números en orden inverso son: "); // Mensaje que indica que a continuación se mostrarán los números en orden inverso.
        
        // Inicializa j en 4 para empezar desde el último elemento del arreglo.
        int j = 4;
        // Bucle while para imprimir los elementos del arreglo en orden inverso.
        while (j >= 0) {            
            System.out.print("|" + array[j] + "|"); // Imprime el elemento actual del arreglo, rodeado por barras verticales.
            j--; // Decrementa j para moverse al elemento anterior en el arreglo.
        }
    }
}
